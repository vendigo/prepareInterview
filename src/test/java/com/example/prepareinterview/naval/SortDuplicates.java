package com.example.prepareinterview.naval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class SortDuplicates {

    public void sortWithDuplicates(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());

        if (list.size() < 3) return;

        ArrayList<Integer> duplicates = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        Integer prev = iterator.next();

        while(iterator.hasNext()) {
            Integer current = iterator.next();
            if (prev.equals(current)) {
                iterator.remove();
                duplicates.add(current);
            }
            prev = current;
        }

        list.addAll(duplicates);
    }


}
