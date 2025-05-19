package com.mav.rpgbuilder.utils;

import com.mav.rpgbuilder.legends.Character;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterUtils {
    public static List<Character> filterByIntellect(List<Character> characters, int threshold){
        return characters.stream()
                .filter(c -> c.getIntellect())
    }
}
