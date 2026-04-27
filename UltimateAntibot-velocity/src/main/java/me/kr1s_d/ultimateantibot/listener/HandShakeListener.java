package me.kr1s_d.ultimateantibot.listener;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.ConnectionHandshakeEvent;
import me.kr1s_d.ultimateantibot.common.IAntiBotManager;
import me.kr1s_d.ultimateantibot.common.IAntiBotPlugin;

/**
 * Deprecated class, useless in velocity, maybe could be used in the future
 */
@Deprecated
public class HandShakeListener {
    @SuppressWarnings("unused")
	private final IAntiBotManager antiBotManager;

    @Deprecated
	public HandShakeListener(IAntiBotPlugin plugin){
        this.antiBotManager = plugin.getAntiBotManager();
    }

    @Deprecated
	@Subscribe
    public void onHandShake(ConnectionHandshakeEvent e) {
        //String ip = Utils.getIP(e.getConnection().getRemoteAddress());

        //if (handshake.getRequestedProtocol() > 2 && antiBotManager.isSomeModeOnline()) {
        //    handshake.setRequestedProtocol(2); // converting to join
        //    if (ConfigManger.blacklistInvalidProtocol) {
        //        antiBotManager.getBlackListService().blacklist(ip, BlackListReason.STRANGE_PLAYER);
        //    }
        //}
    }
}
