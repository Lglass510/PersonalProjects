package com.mav.rpgbuilder.legends;

public enum Temperament {
    MERCURIAL("Shifts between moods and loyalties like the tides."),
    RECKLESS("Takes unnecessary risk, thrives in chaos."),
    Grounded("Steady and rooted like a tree, good luck getting a rise out of them."),
    VINDICTIVE("Never forgets a slight. Retribution isn't just a goal it's an instinct."),
    SMOKESCREEN("Everything they say is a half-truth, every move they make has a hidden agenda. Keeps allies and enimies equally unsure."),
    STALKER("Always scanning for prey, threat or weakness. Never rest."),
    LIONHEART("Bravery is an instinct not a choice. Faces danger head-on with unwavering resolve for themselves and others."),
    UNBREAKABLE("No matter how many times they fall, they rise again. Spirit forged in fire."),
    SHIELD_BEARER("Protects others with their life. Stands on the frontlines no matter the cost."),
    OATHBOUND("Their work is law. Once given it binds them to their soul."),
    STONE_SAGE("Speaks rarely, but every word hits like a fist."),
    BLOODLUST("Derives pleasure from suffering. Seeks out conflict and violence to feed their black souls.");

    private final String temperamentType;
    Temperament(String temperamentType){this.temperamentType = temperamentType;}
    public String getTemperamentType(){return temperamentType;}
}
