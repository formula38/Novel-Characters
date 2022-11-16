package com.infosystraining.novelcharacterapp.controller;

import com.infosystraining.novelcharacterapp.model.Novel;
import com.infosystraining.novelcharacterapp.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/novels")
public class NovelController {
    private NovelService novelService;

    @Autowired
    public NovelController(NovelService novelService) {
        this.novelService = novelService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Novel>> getNovels() {
        List<Novel> novels = novelService.findAllNovels();
        return new ResponseEntity<>(novels, HttpStatus.OK);
    }

    @GetMapping(path = "/find{id}")
    public ResponseEntity<Novel> getNovel(@PathVariable("id") Long id) {
        Novel novel = novelService.findNovelById(id);
        return new ResponseEntity<>(novel, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Novel> addNovel(@RequestBody Novel novel) {
        Novel newNovel = novelService.addNewNovel(novel);
        return new ResponseEntity<>(newNovel, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Novel> updateNovel(@RequestBody Novel novel) {
        Novel updateNovel = novelService.updateNovel(novel);
        return new ResponseEntity<>(updateNovel, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteNovel(@PathVariable("id") Long id) {
        novelService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
