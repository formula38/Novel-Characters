package com.infosystraining.novelcharacterapp.service;

import com.infosystraining.novelcharacterapp.repo.NovelRepo;
import org.springframework.stereotype.Service;

@Service
public class NovelService {
    private NovelRepo novelRepo;

    public NovelService(NovelRepo novelRepo) {
        this.novelRepo = novelRepo;
    }
}
