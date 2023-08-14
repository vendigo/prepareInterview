package com.example.prepareinterview.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextParserTest {

    private final TextParser parser = new TextParser();

    @Test
    void parseTextNoMatch() {
        Item result = parser.parseText("Something else");
        assertThat(result).isNull();
    }

    @Test
    void parseMatch() {
        Item result = parser.parseText("30) - Laptop");
        assertThat(result).isEqualTo(new Item(30, "Laptop"));
    }
}