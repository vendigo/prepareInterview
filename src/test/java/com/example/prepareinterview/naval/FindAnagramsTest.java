package com.example.prepareinterview.naval;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAnagramsTest {

    @Test
    void findAnagrams() {
        FindAnagrams.findAnagrams(List.of("olo", "ola", "foo", "of", "loo", "fo", "ool"));
    }
}