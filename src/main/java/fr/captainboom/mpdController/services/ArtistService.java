package fr.captainboom.mpdController.services;

import org.bff.javampd.artist.MPDArtist;

import java.util.Collection;

public interface ArtistService {
    public Collection<MPDArtist> listAllArtists();
}
