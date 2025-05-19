package com.mav.rpgbuilder.legends;

public enum StrengthType {
    BRUTE_FORCE("Classic raw muscle. Maybe a little light on brains.",8),

    INNER_RESOLVE("Unyielding endurance and will!",14),

    FERAL_RAGE("Chaotic, primal power!",11),

    DIVINE_MIGHT("Power gifted by godlike entities.",15),

    TERRIFYING_PRECISION("Cold, surgical strength. Not just skill DOMINATION through accuracy and speed that feels inhuman.",17),

    ELEGANT_FURY("Beauty in destruction. Fluid, graceful, but every motion is lethal! These fighters don't flail - they flow,then strike!",18),

    HYPER_PERCEPTION("Strength lies in sensing weakness! Catching micro-expressions, the twitch of fear, the misstep. Nothing will go unnoticed!",18),

    INSTINCTUAL_FORCE("Power that comes from the gut. They don't calculate, they KNOW.",15),

    EARTHBORN_GRIT("Strength forged from hardship and survival. Unmoving. Unbreaking.",15),

    VIBRATIONAL_SENSE("Uses perception beyond sight. Every motion around them is a part of the fight!",18),

    TEMPERED_WRATH("Rage, but harnessed. Their strength comes from struggle and restraint.",15),

    HONOR_DRIVEN("Strength in purpose,not for ego.",10),

    GRACEFUL_TORRENT("Beautiful, flowing technique that can snap into a deadly storm without warning!",12),

    TRICKSTER_FORCE("They weaponize unpredictability and misdirection. Never the strongest, always the last one standing.",18),

    BLOODLUST_ELEGANCE("They find art in violence. It's not just a fight, it's a performance.",17),

    SADISTIC_FINESSE("Every strike is measured to inflict just the right pain. They're not trying to kill you ... they want you to feel it.",15) ;

    private final String lore;
    private final int strengthRating;
    StrengthType(String lore, int strengthRating){this.lore = lore; this.strengthRating = strengthRating;}
    public String getLore(){return lore;}
    public int getStrengthRating(){return strengthRating;}









}
