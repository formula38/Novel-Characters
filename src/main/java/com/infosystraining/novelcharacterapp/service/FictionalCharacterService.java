package com.infosystraining.novelcharacterapp.service;

import com.infosystraining.novelcharacterapp.exception.CharacterNotFoundException;
import com.infosystraining.novelcharacterapp.model.FictionalCharacter;
import com.infosystraining.novelcharacterapp.repo.FictionalCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FictionalCharacterService {

    private FictionalCharacterRepo fictionalCharacterRepo;

    @Autowired
    public FictionalCharacterService(FictionalCharacterRepo fictionalCharacterRepo) {
        this.fictionalCharacterRepo = fictionalCharacterRepo;
    }

    public List<FictionalCharacter> findAllCharacters() {
        return fictionalCharacterRepo.findAll();
    }

    public FictionalCharacter findCharacterById(Long id) {
        return fictionalCharacterRepo.findById(id)
                .orElseThrow(() -> new CharacterNotFoundException(
                        String.format("Character with id [%s] not found", id)
                ));
    }

    public FictionalCharacter addNewCharacter(FictionalCharacter character) {
        return fictionalCharacterRepo.save(character);
    }

    public FictionalCharacter updateCharacter(FictionalCharacter character) {
        return fictionalCharacterRepo.save(character);
    }

    public void deleteCharacter(Long id) {
        fictionalCharacterRepo.deleteById(id);
    }
}
