package com.mav.rpgbuilder.legends;

import java.util.List;

public class Hunter extends Character {

    private Hunter(HunterBuilder builder){
        this.name = builder.name;
        this.characterType = builder.characterType;
        this.intellect = builder.intellect;
        this.powerLevel = builder.powerLevel;
        this.stamina = builder.stamina;
        this.strengthType = builder.strengthType;
        this.signatureMoves = builder.signatureMoves;
        this.powerSource = builder.powerSource;
        this.corruptionLevel = builder.corruptionLevel;
        this.originStory = builder.originStory;
        this.goals = builder.goals;
        this.fears = builder.fears;
        this.temperament = builder.temperament;
        this.moralAlignment = builder.moralAlignment;
        this.skills = builder.skills;
    }
    public static HunterBuilder builder(){return new HunterBuilder();}





}
