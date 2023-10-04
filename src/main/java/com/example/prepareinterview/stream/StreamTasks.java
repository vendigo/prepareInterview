package com.example.prepareinterview.stream;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Stream;

public class StreamTasks {

    /**
     * Finds words not longer than minLength, uppercase it, distinct and returns in a set
     */
    public List<String> findShortWords(String text, int minLength) {
        return Stream.of(text.split("\\s"))
                .filter(StringUtils::hasText)
                .map(word -> word.replaceAll("\\W", ""))
                .filter(word -> word.length() <= minLength)
                .map(String::toUpperCase)
                .distinct()
                .toList();
    }
}
