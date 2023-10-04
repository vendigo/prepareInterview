package com.example.prepareinterview.naval;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortDuplicatesTest {

    private static final List<Integer> LIST = List.of(1, 2, 1, 5, 3, 2, 1, 4, 1, 10, 2, 4);
    private final SortDuplicates sortDuplicates = new SortDuplicates();

    @Test
    void sortWithDuplicates() {
        ArrayList<Integer> list = new ArrayList<>(LIST);
        sortDuplicates.sortWithDuplicates(list);
        assertThat(list).containsExactly(1, 2, 3, 4, 5, 10, 1, 1, 1, 2, 2, 4);
    }
}