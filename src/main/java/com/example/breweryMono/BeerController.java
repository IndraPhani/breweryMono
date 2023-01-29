package com.example.breweryMono;


import Services.Beerserviece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @Autowired
    private final Beerserviece beerserviece;

    public BeerController(Beerserviece beerserviece) {
        this.beerserviece = beerserviece;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){

    return new ResponseEntity<>(beerserviece.getBeerId(beerId), HttpStatus.OK);
    }
    @GetMapping("/chk")
    @ResponseBody
    public String getBeer(){

        return "Hi this is get method test!!";

    }
}
