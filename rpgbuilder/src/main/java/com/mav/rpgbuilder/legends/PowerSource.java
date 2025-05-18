package com.mav.rpgbuilder.legends;

public enum PowerSource {
    INTERNAL("Internal",
            "Self made with discipline and will.",
            "Hmmm every seen an unstoppable force meet an unmovable object?",
            12,
            false),

    EMOTIONAL("Emotional",
            "Fueled by intense feelings, rage,grief,love or despair.",
            "Burst of volatile power erupting at critical moments.",
            13,
            true),

    EMOTION_PARASITE("Feeds off the emotions of opponents like a leech.",
            "Gets stronger when surrounded by fear or intense pain.",
            "The bond feels sticky, invasive and sinister.",
            15,
            true),

    CURSED("Cursed",
            "Power born and tainted from a hex, seal or ancient punishment",
            "Great power at a horrific cost",
            17,
            true),

    ASTRAL("Astral",
            "Power harnessed from the invisible threads between planes.Drawn from the invisible threads between planes,wielders glide between realities ignoring gravity and time",
            "Their presence often leaves behind a scentless chill.",
            19,
            false
    ),

    TELEPATHIC("Telepathic",
            "Harnessed from the minds deepest corridors, thoughts become weapons.",
            "Reality bending.",
            18,
            false),

    SACRIFICIAL("Sacrificial",
            "Requires the loss of something precious.... love,memory,life. The power is incredible, but it always takes more than it gives.",
            "incoming",
            19,
            true),

    ARTIFACT_DRIVEN("Artifact driven",
            "Rooted in a powerful item, forged, found or stolen. The weapon is the wielder's identity, and separation means their ruin.",
            "incoming",
            18,
            true),

    DIVINE("Divine",
            "Bestowed by gods or celestial beings.Every use echos with divine judgment!",
            "Feels purposeful, radiant and absolute!",
            19,
            false),

    ARCANE("Arcane",
            "Old magic pulled from ancient text, sacred rituals, or matrices",
            "Complex and volatile",
            19,
            true),

    PRIMAL("Primal",
            "Raw and instinctual.Pulled from the heart of nature,beats and survival itself",
            "Power without polish... ouch!",
            13,
            true),

    COSMIC("Cosmic",
                   "From the outer dark - stars long dead, black holes and truths no mind should hold",
                   "So. .... cold",
                   19,
                   true),

    TECHNOLOGICAL("Tech",
                          "A fusion of man and machine. Cypbernetics,AI, or engineered enhancements",
                          "incoming",
                            14,
                          true),

    ANCESTRAL("Ancestral",
                      "Ancestors lend their wisdom, power, strength and focus and combine it in their descendant.",
                      "You messed with the wrong family!",
                      20,
                      true),

    ELEMENTAL("Elemental",
                      "Bonded to fire, water, earth, air and their sub elements. The bender becomes a vessel for one .. or in rare cases all of the elements.",
                      "Chaos or balance.",
                      15,
                      true),

    STOLEN("Stolen",
                   "Not earned - taken. Deeply resented and hunted by the original owner",
                   "Unstable.",
                   14,
                   true),

    UNKNOWN("Unknown",
                    "The wielder may or may not even understand it. It came suddenly, like a whisper or a vision. It refuses to be named.",
                    "No words to describe it.",
                    18,
                    true);

     PowerSource(String name, String originLore, String manifestation, int dangerLevel, boolean isCorrupting) {
        this.name = name;
        this.originLore = originLore;
        this.manifestation = manifestation;
        this.dangerLevel = dangerLevel;
        this.isCorrupting = isCorrupting;

    }

    private final String name;
    private final String originLore;
    private final String manifestation;
    private final int dangerLevel;
    private final boolean isCorrupting;

}
