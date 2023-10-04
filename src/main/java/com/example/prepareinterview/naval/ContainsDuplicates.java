package com.example.prepareinterview.naval;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicates {

    public boolean containsDuplicatesSimple(List<Integer> arr) {
        var elems = new HashSet<>(arr);
        return elems.size() != arr.size();
    }

    public boolean containsDuplicatesInPlace(ArrayList<Integer> arr) {
        arr.sort(Comparator.naturalOrder());

        if (arr.size() < 2) return false;

        Integer prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            Integer current = arr.get(i);
            if (current.equals(prev)) return true;
            prev = current;
        }
        return false;
    }

    @SuppressWarnings("UnstableApiUsage")
    public boolean containsDuplicatesBloomFilter(List<Integer> arr) {
        BloomFilter<Integer> bloomFilter = BloomFilter.create(
                Funnels.integerFunnel(),
                500, 0.01
        );

        for (Integer i : arr) {
            boolean contain = bloomFilter.mightContain(i);
            if (contain) return true;
            bloomFilter.put(i);
        }

        return false;
    }
}
