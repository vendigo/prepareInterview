package com.example.prepareinterview.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {

    private static final Pattern PATTERN = Pattern.compile("(\\d+)\\) - (\\w+)");
    private static final int ID_GROUP = 1;
    private static final int NAME_GROUP = 2;

    Item parseText(String raw) {
        Matcher matcher = PATTERN.matcher(raw);
        if (matcher.find()) {
            int id = Integer.parseInt(matcher.group(ID_GROUP));
            String name = matcher.group(NAME_GROUP);
            return new Item(id, name);
        }
        return null;
    }
}
