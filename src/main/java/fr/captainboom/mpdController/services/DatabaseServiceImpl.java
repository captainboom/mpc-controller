package fr.captainboom.mpdController.services;

import org.bff.javampd.server.MPD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseServiceImpl implements DatabaseService {
    @Autowired
    private MPD mpd;

}
