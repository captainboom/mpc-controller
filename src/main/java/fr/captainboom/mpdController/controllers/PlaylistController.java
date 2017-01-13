package fr.captainboom.mpdController.controllers;

import fr.captainboom.mpdController.services.PlaylistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlist")
@Slf4j
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @RequestMapping(method = RequestMethod.POST, value = "/clear")
    public void clear() {
        playlistService.clear();
    }
}