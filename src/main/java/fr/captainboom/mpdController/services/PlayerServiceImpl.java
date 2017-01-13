package fr.captainboom.mpdController.services;

import org.bff.javampd.server.MPD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private MPD mpd;

    @Override
    public void play() {
        mpd.getPlayer().play();
    }

    @Override
    public void stop() {
        mpd.getPlayer().stop();
    }

    @Override
    public void pause() {
        mpd.getPlayer().pause();
    }

    @Override
    public void setVolume(int volumeValue) {
        mpd.getPlayer().setVolume(volumeValue);
    }
}
