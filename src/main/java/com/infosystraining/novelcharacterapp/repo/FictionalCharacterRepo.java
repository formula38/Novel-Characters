package com.infosystraining.novelcharacterapp.repo;

import com.infosystraining.novelcharacterapp.model.FictionalCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FictionalCharacterRepo extends JpaRepository<FictionalCharacter, Long> {
}
