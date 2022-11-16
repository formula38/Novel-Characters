package com.infosystraining.novelcharacterapp.controller;

import com.infosystraining.novelcharacterapp.service.FictionalCharacterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/characters")
public class FictionalCharacterController {
    private FictionalCharacterService fictionalCharacterService;

    public FictionalCharacterController(FictionalCharacterService fictionalCharacterService) {
        this.fictionalCharacterService = fictionalCharacterService;
    }


}