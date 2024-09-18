package org.example.first_task;

import java.util.HashSet;
import java.util.Set;

public class SetDifferenceCalculator {
    public static Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> differ = new HashSet<>(set1);
        differ.removeAll(set2);
        return differ;
    }
}
