package royaleserver.protocol;

import royaleserver.protocol.messages.client.ClientHello;
import royaleserver.protocol.messages.client.Login;
import royaleserver.protocol.messages.client.ClientCapabilities;
import royaleserver.protocol.messages.client.KeepAlive;
import royaleserver.protocol.messages.client.InboxOpened;
import royaleserver.protocol.messages.client.EndClientTurn;
import royaleserver.protocol.messages.client.VisitHome;
import royaleserver.protocol.messages.client.HomeBattleReplay;
import royaleserver.protocol.messages.client.AskForAllianceData;
import royaleserver.protocol.messages.client.AskForJoinableAlliancesList;
import royaleserver.protocol.messages.client.JoinAlliance;
import royaleserver.protocol.messages.client.LeaveAlliance;
import royaleserver.protocol.messages.client.DonateAllianceUnit;
import royaleserver.protocol.messages.client.SearchAlliances;
import royaleserver.protocol.messages.client.AskForAllianceRankingList;
import royaleserver.protocol.messages.client.AskForTVContent;
import royaleserver.protocol.messages.client.AskForAvatarRankingList;
import royaleserver.protocol.messages.client.AskForAvatarLocalRanking;
import royaleserver.protocol.messages.client.AskForAvatarStream;
import royaleserver.protocol.messages.client.AskForBattleReplayStream;
import royaleserver.protocol.messages.client.AskForJoinableTournaments;
import royaleserver.protocol.messages.client.AvatarNameCheckRequest;
import royaleserver.protocol.messages.client.CancelMatchmake;
import royaleserver.protocol.messages.client.ChangeAvatarName;
import royaleserver.protocol.messages.client.GoHome;
import royaleserver.protocol.messages.client.StartMission;

public interface Handler {

	boolean handleClientHello(ClientHello message) throws Throwable;

	boolean handleLogin(Login message) throws Throwable;

	boolean handleClientCapabilities(ClientCapabilities message) throws Throwable;

	boolean handleCancelMatchmake(CancelMatchmake message) throws Throwable;

	boolean handleKeepAlive(KeepAlive message) throws Throwable;

	boolean handleInboxOpened(InboxOpened message) throws Throwable;

	boolean handleEndClientTurn(EndClientTurn message) throws Throwable;

	boolean handleVisitHome(VisitHome message) throws Throwable;

	boolean handleHomeBattleReplay(HomeBattleReplay message) throws Throwable;

	boolean handleAskForAllianceData(AskForAllianceData message) throws Throwable;

	boolean handleAvatarNameCheckRequest(AvatarNameCheckRequest message) throws Throwable;

	boolean handleAskForJoinableAlliancesList(AskForJoinableAlliancesList message) throws Throwable;

	boolean handleAskForJoinableTournaments(AskForJoinableTournaments message) throws Throwable;

	boolean handleJoinAlliance(JoinAlliance message) throws Throwable;

	boolean handleLeaveAlliance(LeaveAlliance message) throws Throwable;

	boolean handleDonateAllianceUnit(DonateAllianceUnit message) throws Throwable;

	boolean handleSearchAlliances(SearchAlliances message) throws Throwable;

	boolean handleAskForAllianceRankingList(AskForAllianceRankingList message) throws Throwable;

	boolean handleAskForTVContent(AskForTVContent message) throws Throwable;

	boolean handleAskForAvatarRankingList(AskForAvatarRankingList message) throws Throwable;

	boolean handleAskForAvatarLocalRanking(AskForAvatarLocalRanking message) throws Throwable;

	boolean handleAskForAvatarStream(AskForAvatarStream message) throws Throwable;

	boolean handleAskForBattleReplayStream(AskForBattleReplayStream message) throws Throwable;

	boolean handleStartMission(StartMission message) throws Throwable;

	boolean handleGoHome(GoHome message) throws Throwable;

	boolean handleChangeAvatarName(ChangeAvatarName message) throws Throwable;
}
