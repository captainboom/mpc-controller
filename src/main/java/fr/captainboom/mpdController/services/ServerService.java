package fr.captainboom.mpdController.services;

import org.bff.javampd.server.ServerStatus;

public interface ServerService {
    public ServerStatus getStatus();
}
