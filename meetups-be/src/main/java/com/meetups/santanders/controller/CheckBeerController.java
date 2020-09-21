package com.meetups.santanders.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class CheckBeerController {
    @GetMapping("/checkBeerToDay")
    public ResponseEntity<String> checkBeerToDay(){
        return  new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> checkTheWeatherOfTheDay(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
