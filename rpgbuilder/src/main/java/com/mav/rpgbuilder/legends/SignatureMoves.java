package com.mav.rpgbuilder.legends;

public enum SignatureMoves {
    CRUSHING_BLOW(PowerSource.INTERNAL),
    RAGE_SWEEP(PowerSource.EMOTIONAL),
    SHATTERING_PUNCH(PowerSource.PRIMAL),
    LIGHTNING_DANCE(PowerSource.ASTRAL),
    PHANTOM_FANG(PowerSource.UNKNOWN),
    FROSTBITE_WHIP(PowerSource.ELEMENTAL),
    WILL_BREAKER(PowerSource.CURSED),
    JESTERS_GAMBIT(PowerSource.EMOTION_PARASITE),
    DRAGONS_TALON(PowerSource.DIVINE),
    WILDFIRE_BARRAGE(PowerSource.ELEMENTAL),
    SHADOW_STORM(PowerSource.UNKNOWN),
    STORM_CALL(PowerSource.ASTRAL),
    BLADE_VORTEX(PowerSource.ARCANE),
    SHADOW_CURSE(PowerSource.STOLEN),
    ANCESTORS_FURY(PowerSource.ANCESTRAL),
    BLOOD_OATH(PowerSource.ANCESTRAL),
    OVER_CLOCK(PowerSource.TECHNOLOGICAL),
    NANO_SWARM(PowerSource.TECHNOLOGICAL),
    VOID_SUMMON(PowerSource.COSMIC),
    QUANTUM_ECHO(PowerSource.COSMIC),
    SEAL_BREAKER(PowerSource.ARTIFACT_DRIVEN),
    ECHO_OF_ORIGIN(PowerSource.ARTIFACT_DRIVEN),
    PSYCH_BREAK(PowerSource.TELEPATHIC),
    THOUGHT_LOOP(PowerSource.TELEPATHIC);



    private final PowerSource powerSource;

    SignatureMoves(PowerSource powerSource){
        this.powerSource = powerSource;
    }
    public PowerSource getPowerSource(){
        return powerSource;
    }


}
