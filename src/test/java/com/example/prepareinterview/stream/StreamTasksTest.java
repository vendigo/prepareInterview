package com.example.prepareinterview.stream;

import com.example.prepareinterview.controller.Person;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StreamTasksTest {

    private final StreamTasks streamTasks = new StreamTasks();
    private final Faker faker = new Faker();

    @Test
    void findShortWords() {
        var text = "Lets find some really   short words,  like this   like it a are not very short, not very long yes.";
        var shortWords = streamTasks.findShortWords(text, 3);
        assertThat(shortWords).containsExactly("IT", "A", "ARE", "NOT");
    }

    @Test
    void streamDistinct() {
        List<String> result = Stream.of("AAA", "YYY", "BBB", "AAA", "NNN", "BBB")
                .distinct()
                .toList();
        result.forEach(System.out::println); //Keeps order
    }

    @Test
    void sortBy() {
        List<Person> people = IntStream.range(0, 10)
                .mapToObj(i -> new Person(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 80)))
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
        people.forEach(System.out::println);
    }
}