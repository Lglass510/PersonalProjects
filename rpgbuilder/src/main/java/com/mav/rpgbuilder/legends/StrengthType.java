package com.mav.rpgbuilder.legends;

public enum StrengthType {
    BRUTE_FORCE("Classic raw muscle. Maybe a little light on brains."),

    INNER_RESOLVE("Unyielding endurance and will!"),

    FERAL_RAGE("Chaotic, primal power!"),

    DIVINE_MIGHT("Power gifted by godlike entities."),

    TERRIFYING_PRECISION("Cold, surgical strength. Not just skill DOMINATION through accuracy and speed that feels inhuman."),

    ELEGANT_FURY("Beauty in destruction. Fluid, graceful, but every motion is lethal! These fighters don't flail - they flow,then strike!"),

    HYPER_PERCEPTION("Strength lies in sensing weakness! Catching micro-expressions, the twitch of fear, the misstep. Nothing will go unnoticed!"),

    INSTINCTUAL_FORCE("Power that comes from the gut. They dont calculate, they KNOW."),

    EARTHBORN_GRIT("Strength forged from hardship and survival. Unmoving. Unbreaking."),

    VIBRATIONAL_SENSE("Uses perception beyond sight. Every motion around them is a part of the fight!"),

    TEMPERED_WRATH("Rage, but harnessed. Their strength comes from struggle and restraint."),

    HONOR_DRIVEN("Strength in purpose,not for ego."),

    GRACEFUL_TORRENT("Beautiful, flowing technique that can snap into a deadly storm without warning!"),

    TRICKSTER_FORCE("They weponize unpredictablility and misdirection. Never the strongest, always the last one standing."),

    BLOODLUST_ELEGANCE("They find art in violence. It's not just a fight, it's a performance."),

    SADISTIC_FINESSE("Every strike is measured to inflict just the right pain. They're not trying to kill you ... they want you to feel it.") ;

    private final String lore;
    StrengthType(String lore){this.lore = lore;}
    public String getLore(){return lore;}









}
