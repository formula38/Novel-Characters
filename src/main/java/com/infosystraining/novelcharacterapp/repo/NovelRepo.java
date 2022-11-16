package com.infosystraining.novelcharacterapp.repo;

import com.infosystraining.novelcharacterapp.model.Novel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NovelRepo extends JpaRepository<Novel, Long> {
}
