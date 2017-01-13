package fr.captainboom.mpdController.services;

import org.bff.javampd.server.MPD;
import org.bff.javampd.server.ServerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerServiceImpl implements ServerService {
    @Autowired
    private MPD mpd;

    @Override
    public ServerStatus getStatus() {
        return mpd.getServerStatus();
    }
}
