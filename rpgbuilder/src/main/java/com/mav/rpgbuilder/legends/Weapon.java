package com.mav.rpgbuilder.legends;
import java.util.List;

public interface Weapon {
    String getName();
    int getBaseDamage();
    List<CharacterType> getAllowedType();

}
