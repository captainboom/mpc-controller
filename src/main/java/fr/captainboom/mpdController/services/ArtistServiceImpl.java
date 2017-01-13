package fr.captainboom.mpdController.services;

import org.bff.javampd.artist.MPDArtist;
import org.bff.javampd.server.MPD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    private MPD mpd;

    @Override
    public Collection<MPDArtist> listAllArtists() {
        return mpd.getMusicDatabase().getArtistDatabase().listAllArtists();
    }
}
