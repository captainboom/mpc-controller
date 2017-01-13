package fr.captainboom.mpdController.controllers;

import fr.captainboom.mpdController.services.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.bff.javampd.artist.MPDArtist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/artist")
@Slf4j
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<MPDArtist>> getAllArtists() {
        return new ResponseEntity<Collection<MPDArtist>>(artistService.listAllArtists(), HttpStatus.OK);
    }
}
