package com.example.prepareinterview.naval;

import java.util.*;

public class FindAnagrams {

    public static List<List<String>> findAnagrams(List<String> words) {
        var byHashes = groupByHashes(words);
        System.out.println(byHashes);

        return List.of();
    }

    private static Map<String, List<String>> groupByHashes(List<String> words) {
        Map<String, List<String>> wordsByHash = new HashMap<>();

        for (String word : words) {
            String hash = hash(word);
            wordsByHash.computeIfPresent(hash, (key, list) -> {
                list.add(word);
                return list;
            });
            wordsByHash.computeIfAbsent(hash, (key) -> {
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                return list;
            });
        }

        return wordsByHash;
    }

    private static String hash(String word) {
        var chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
