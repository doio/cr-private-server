package royaleserver.protocol.messages.client;

import royaleserver.protocol.Info;
import royaleserver.protocol.messages.Message;
import royaleserver.protocol.messages.MessageHandler;
import royaleserver.utils.DataStream;

public class StartMission extends Message {

    public static final short ID = Info.START_MISSION;

    public StartMission() {
        super(ID);
    }

    @Override
    public void decode(DataStream stream) {

    }

    public boolean handle(MessageHandler handler) throws Throwable {
        return handler.handleStartMission(this);
    }

}
