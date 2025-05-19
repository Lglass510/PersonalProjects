package com.mav.rpgbuilder.legends;

import java.util.List;

public abstract class Character {
 protected String name;
 protected String characterType;
 protected int intellect;
 protected PowerLevel powerLevel;
 protected Stamina stamina;
 protected StrengthType strengthType;
 protected SignatureMoves signatureMoves;
 protected PowerSource powerSource;
 protected int corruptionLevel;
 protected List<String> skills;
 protected String originStory;
 protected String goals;
 protected String fears;
 protected Temperament temperament;
 protected MoralAlignment moralAlignment;


 public Character(String name, String characterType, int intellect, PowerLevel powerLevel, Stamina stamina, StrengthType strengthType,
                  SignatureMoves signatureMoves, PowerSource powerSource, int corruptionLevel, List<String> skills, String originStory,
                  String goals, String fears, Temperament temperament, MoralAlignment moralAlignment){
  this.name = name;
  this.characterType = characterType;
  this.intellect = intellect;
  this.powerLevel = powerLevel;
  this.stamina = stamina;
  this.strengthType = strengthType;
  this.signatureMoves = signatureMoves;
  this.powerSource = powerSource;
  this.corruptionLevel = corruptionLevel;
  this.originStory = originStory;
  this.goals = goals;
  this.fears = fears;
  this.temperament = temperament;
  this.moralAlignment = moralAlignment;

 }

 //region getters
 public String getName(){return name;}
 public String getCharacterType(){return characterType;}
 public int getIntellect(){return intellect;}
 public PowerLevel getPowerLevel(){return powerLevel;}
 public Stamina getStamina(){return stamina;}
 public StrengthType getStrengthType(){return strengthType;}
 public SignatureMoves getSignatureMoves(){return signatureMoves;}
 public PowerSource getPowerSource(){return powerSource;}
 public int getCorruptionLevel(){return corruptionLevel;}
 public List<String> getSkills(){return skills;}
 public String getOriginStory(){return originStory;}
 public String getGoals(){return goals;}
 public String getFears(){return fears;}
 public Temperament getTemperament(){return temperament;}
 public MoralAlignment getMoralAlignment(){return moralAlignment;}
 //endregion
}
