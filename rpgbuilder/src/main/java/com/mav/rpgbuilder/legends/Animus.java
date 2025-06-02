package com.mav.rpgbuilder.legends;

import static java.lang.Math.min;

public class Animus {
    private int intellect;
    private int stamina;
    private int corruptionLevel;

    public Animus(int intellect, int stamina, int corruptionLevel){
        this.intellect = intellect;
        this.stamina = stamina;
        this.corruptionLevel = corruptionLevel;
    }

    public int getIntellect() {return intellect;}

    public int getStamina() {return stamina;}

    public int getCorruptionLevel() {return corruptionLevel;}

// Combat Resources
    public void consumeStamina(int amount){
        stamina = Math.max(stamina - amount, 0);}

    public void regainStamina(int amount){
        stamina = Math.min(stamina + amount, 100);}

    public void gainIntellect( int points){
        intellect += points;}

    public void increaseCorruption(int amount){
        corruptionLevel = Math.min(corruptionLevel + amount,100);}

    public void cleanseCorruption(int amount){
        corruptionLevel = Math.max(corruptionLevel - amount, 0);}

    public String corruptionState(){
        if (corruptionLevel <25) return "Pure";
        if (corruptionLevel <50) return "Tainted";
        if (corruptionLevel <75) return "Corrupted";
        return "Fallen";}

    @Override
    public String toString(){
        return "Animus [intellect=" + intellect +
                ", stamina=" + stamina +
                ", corruptionLevel=" + corruptionLevel +
                ",state=" + corruptionState() + "]";
    }




}
