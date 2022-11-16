package com.infosystraining.novelcharacterapp.service;

import com.infosystraining.novelcharacterapp.repo.FictionalCharacterRepo;
import org.springframework.stereotype.Service;

@Service
public class FictionalCharacterService {
    private FictionalCharacterRepo fictionalCharacterRepo;

    public FictionalCharacterService(FictionalCharacterRepo fictionalCharacterRepo) {
        this.fictionalCharacterRepo = fictionalCharacterRepo;
    }
}
