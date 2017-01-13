package fr.captainboom.mpdController.services;

public interface PlayerService {
    public void play();
    public void stop();
    public void pause();
    public void setVolume(int volumeValue);
}
