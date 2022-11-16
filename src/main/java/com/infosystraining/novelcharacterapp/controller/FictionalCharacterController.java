package com.infosystraining.novelcharacterapp.controller;

import com.infosystraining.novelcharacterapp.model.FictionalCharacter;
import com.infosystraining.novelcharacterapp.service.FictionalCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/characters")
public class FictionalCharacterController {
    private FictionalCharacterService fictionalCharacterService;

    @Autowired
    public FictionalCharacterController(FictionalCharacterService fictionalCharacterService) {
        this.fictionalCharacterService = fictionalCharacterService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<FictionalCharacter>> getCharacters() {
        List<FictionalCharacter> characters = fictionalCharacterService.findAllCharacters();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/find{id}")
    public ResponseEntity<FictionalCharacter> getCharacter(@PathVariable("id") Long id) {
        FictionalCharacter character = fictionalCharacterService.findCharacterById(id);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<FictionalCharacter> addCharacter(FictionalCharacter character) {
        FictionalCharacter newCharacter = fictionalCharacterService.addNewCharacter(character);
        return new ResponseEntity<>(newCharacter, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<FictionalCharacter> updateCharacter(FictionalCharacter character) {
        FictionalCharacter updatedCharacter = fictionalCharacterService.updateCharacter(character);
        return new ResponseEntity<>(updatedCharacter, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteCharacter(@PathVariable("id") Long id) {
        fictionalCharacterService.deleteCharacter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
