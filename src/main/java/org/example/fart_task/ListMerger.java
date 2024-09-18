package org.example.fart_task;

import java.util.*;

public class ListMerger {
  public static List<String> mergeAndRemoveDuplicates(List<String> list1, List<String> list2){
       list1.removeAll(new HashSet<>(list2));
       Collections.sort(list1);
        return list1;
    }
}
