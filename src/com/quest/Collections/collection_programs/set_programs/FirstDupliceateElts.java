package com.quest.Collections.collection_programs.set_programs;

import java.util.HashSet;
import java.util.Set;

public class FirstDupliceateElts {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr={1,2,3,4,2,3,5};
        int dupli=0;
        for (int i : arr) {
            if (set.contains(i)){
                dupli=i;
                break;
            }
            else {
                set.add(i);
            }
        }
        if (dupli!=0){
            System.out.println("The first Duplicate elt is: "+dupli);
        }
        else {}
    }
}
