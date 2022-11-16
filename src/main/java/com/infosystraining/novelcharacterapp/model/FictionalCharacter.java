package com.infosystraining.novelcharacterapp.model;

import org.hibernate.type.CharacterType;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

public class FictionalCharacter {
    private Long id;
    private String name;
    private String age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private CharacterRole role;
    @ManyToOne(cascade = CascadeType.ALL)
    private Novel novel;
}
