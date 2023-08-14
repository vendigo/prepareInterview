package com.example.prepareinterview.controller;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    private static final Faker faker = new Faker();

    @PostMapping
    public void createPerson(@RequestBody @Validated Person person) {
        log.info("Person created: {}", person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Long id) {
        log.info("Searching person with id: {}", id);
        return new Person(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 80));
    }
}
