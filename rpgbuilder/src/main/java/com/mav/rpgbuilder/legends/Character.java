package com.mav.rpgbuilder.legends;

import java.util.List;

public abstract class Character {
 protected Characteristics characteristics;
 protected Animus animus;

 public Character(Characteristics characteristics){
  this.characteristics = characteristics;
 }

 public Animus getAnimus(){return animus;}



 // region getters
 public String getName(){return characteristics.getName();}

 public CharacterType getCharacterType(){return characteristics.getCharacterType();}



 public PowerLevel getPowerLevel(){return characteristics.powerLevel;}



 public StrengthType getStrengthType(){return characteristics.strengthType;}

 public SignatureMoves getSignatureMoves(){return characteristics.signatureMoves;}

 public PowerSource getPowerSource(){return characteristics.powerSource;}



 public List<String> getSkills() {return characteristics.getSkills();}

 public String getOriginStory() {return characteristics.getOriginStory();}

 public String getGoals() {return characteristics.getGoals();}

 public String getFears() {return characteristics.getFears();}

 public Temperament getTemperament() {return characteristics.getTemperament();}

 public MoralAlignment getMoralAlignment() {return characteristics.getMoralAlignment();}
 //endregion
}
