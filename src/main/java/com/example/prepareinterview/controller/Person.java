package com.example.prepareinterview.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record Person(
        @NotNull
        @Size(min = 2, max = 32)
        String firstName,
        @NotNull
        @Size(min = 2, max = 32)
        String lastName,
        @Min(18)
        @Max(80)
        int age) {
}
