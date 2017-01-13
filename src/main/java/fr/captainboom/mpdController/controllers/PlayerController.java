package fr.captainboom.mpdController.controllers;

import fr.captainboom.mpdController.services.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
@Slf4j
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(method = RequestMethod.POST, value = "/play")
    public ResponseEntity play() {
        playerService.play();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/stop")
    public ResponseEntity stop() {
        playerService.stop();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pause")
    public ResponseEntity pause() {
        playerService.pause();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/volumeValue")
    public ResponseEntity setVolume(@RequestBody final int volumeValue) {
        playerService.setVolume(volumeValue);
        return new ResponseEntity(HttpStatus.OK);
    }
}
