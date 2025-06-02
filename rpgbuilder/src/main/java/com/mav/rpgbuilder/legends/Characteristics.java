package com.mav.rpgbuilder.legends;

import java.util.List;

public class Characteristics {
    protected String name;
    protected CharacterType characterType;
    protected PowerLevel powerLevel;
    protected StrengthType strengthType;
    protected SignatureMoves signatureMoves;
    protected PowerSource powerSource;
    protected List<String> skills;
    protected String originStory;
    protected String goals;
    protected String fears;
    protected Temperament temperament;
    protected MoralAlignment moralAlignment;

    public Characteristics(CharacterType characterType) {
        this.characterType = characterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }


    public PowerLevel getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(PowerLevel powerLevel) {
        this.powerLevel = powerLevel;
    }


    public StrengthType getStrengthType() {
        return strengthType;
    }

    public void setStrengthType(StrengthType strengthType) {
        this.strengthType = strengthType;
    }

    public SignatureMoves getSignatureMoves() {
        return signatureMoves;
    }

    public void setSignatureMoves(SignatureMoves signatureMoves) {
        this.signatureMoves = signatureMoves;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }


    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getOriginStory() {
        return originStory;
    }

    public void setOriginStory(String originStory) {
        this.originStory = originStory;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getFears() {
        return fears;
    }

    public void setFears(String fears) {
        this.fears = fears;
    }

    public Temperament getTemperament() {
        return temperament;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }

    public MoralAlignment getMoralAlignment() {
        return moralAlignment;
    }

    public void setMoralAlignment(MoralAlignment moralAlignment) {
        this.moralAlignment = moralAlignment;
    }
}

