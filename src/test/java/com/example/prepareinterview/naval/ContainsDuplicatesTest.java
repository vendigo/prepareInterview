package com.example.prepareinterview.naval;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicatesTest {

    public static final ArrayList<Integer> ARR_WITH_DUPLICATE = new ArrayList<>(List.of(1, 2, 6, 20, 10244, 20, 24523, 5263, 45));
    public static final ArrayList<Integer> ARR_WITHOUT_DUPLICATES = new ArrayList<>(List.of(1, 2, 6, 20, 10244, 21, 24523, 5263, 45));
    private final ContainsDuplicates containsDuplicates = new ContainsDuplicates();

    @Test
    void containsDuplicatesSimpleTrue() {
        boolean actualResult = containsDuplicates.containsDuplicatesSimple(ARR_WITH_DUPLICATE);
        assertThat(actualResult).isTrue();
    }

    @Test
    void containsDuplicatesSimpleFalse() {
        boolean actualResult = containsDuplicates.containsDuplicatesSimple(ARR_WITHOUT_DUPLICATES);
        assertThat(actualResult).isFalse();
    }

    @Test
    void containsDuplicatesInPlaceTrue() {
        boolean actualResult = containsDuplicates.containsDuplicatesInPlace(ARR_WITH_DUPLICATE);
        assertThat(actualResult).isTrue();
    }

    @Test
    void containsDuplicatesInPlaceFalse() {
        boolean actualResult = containsDuplicates.containsDuplicatesInPlace(ARR_WITHOUT_DUPLICATES);
        assertThat(actualResult).isFalse();
    }

    @Test
    void containsDuplicatesBloomFilterTrue() {
        boolean actualResult = containsDuplicates.containsDuplicatesBloomFilter(ARR_WITH_DUPLICATE);
        assertThat(actualResult).isTrue();
    }

    @Test
    void containsDuplicatesBloomFilterFalse() {
        boolean actualResult = containsDuplicates.containsDuplicatesBloomFilter(ARR_WITHOUT_DUPLICATES);
        assertThat(actualResult).isFalse();
    }
}