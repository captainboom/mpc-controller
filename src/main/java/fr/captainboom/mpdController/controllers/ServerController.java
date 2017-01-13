package fr.captainboom.mpdController.controllers;

import fr.captainboom.mpdController.services.ServerService;
import lombok.extern.slf4j.Slf4j;
import org.bff.javampd.server.ServerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
@Slf4j
public class ServerController {

    @Autowired
    ServerService serverService;

    @RequestMapping(method = RequestMethod.GET, value = "/status")
    public ResponseEntity<ServerStatus> getServerStatus() {
        return new ResponseEntity<>(serverService.getStatus(), HttpStatus.OK);
    }
}
