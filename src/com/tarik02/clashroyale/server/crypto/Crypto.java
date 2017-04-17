package com.tarik02.clashroyale.server.crypto;

import com.caligochat.nacl.NaclException;
import com.caligochat.nacl.SecretBox;
import com.tarik02.clashroyale.server.protocol.MessageHeader;
import com.tarik02.clashroyale.server.utils.LogManager;

import java.util.logging.Logger;

public abstract class Crypto {
	private static Logger logger = LogManager.getLogger(Crypto.class);

	protected byte[] privateKey;
	protected byte[] serverKey;
	protected byte[] clientKey;
	protected byte[] sharedKey;
	protected Nonce decryptNonce;
	protected Nonce encryptNonce;
	protected byte[] sessionKey;

	public byte[] encrypt(byte[] message) {
		return encrypt(message, null);
	}

	public byte[] encrypt(byte[] message, Nonce nonce) {
		if (nonce == null) {
			nonce = encryptNonce;
			nonce.increment();
		}

		return SecretBox.seal(message, nonce.getBytes(), sharedKey);
	}

	public byte[] decrypt(byte[] message) {
		return decrypt(message, null);
	}

	public byte[] decrypt(byte[] message, Nonce nonce) {
		if (nonce == null) {
			nonce = decryptNonce;
			nonce.increment();
		}

		try {
			return SecretBox.open(message, decryptNonce.getBytes(), sharedKey);
		} catch (NaclException e) {}

		return null;
	}

	public abstract void decryptPacket(MessageHeader message);
	public abstract void encryptPacket(MessageHeader message);
}