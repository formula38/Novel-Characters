package com.infosystraining.novelcharacterapp.model;

import org.hibernate.type.CharacterType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class FictionalCharacter {
    private String name;
    private String age;
    private String location;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private CharacterRole role;
}
