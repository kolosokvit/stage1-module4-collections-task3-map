package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        Map<String, Integer> words = new HashMap<>();
        for (String s : sentence.split("\\W+")) {
            if (!words.containsKey(s.toLowerCase())) {
                words.put(s.toLowerCase(), 1);
            } else {
                words.put(s.toLowerCase(), words.get(s.toLowerCase()) + 1);
            }
        }
        return words;
    }
}
