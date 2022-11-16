package com.infosystraining.novelcharacterapp.service;

import com.infosystraining.novelcharacterapp.exception.NovelNotFoundException;
import com.infosystraining.novelcharacterapp.model.FictionalCharacter;
import com.infosystraining.novelcharacterapp.model.Novel;
import com.infosystraining.novelcharacterapp.repo.NovelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelService {
    private NovelRepo novelRepo;

    @Autowired
    public NovelService(NovelRepo novelRepo) {
        this.novelRepo = novelRepo;
    }

    public List<Novel> findAllNovels() {
        return novelRepo.findAll();
    }

    public Novel findNovelById(Long id) {
        return novelRepo.findById(id)
                .orElseThrow(() -> new NovelNotFoundException(
                        (String.format("Novel with id [%s] not found.", id))
                ));
    }

    public Novel addNewNovel(Novel novel) {
        return novelRepo.save(novel);
    }

    public Novel updateNovel(Novel novel) {
        return novelRepo.save(novel);
    }

    public void deleteById(Long id) {
        novelRepo.deleteById(id);
    }
}
