package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(20));
    }

}

/**
 * Features
 * No Duplicates are allowed
 * Maintains insertion order - it acts like a linked list(which maintains insertion order)
 * Uses hashing internally
 * Slightly slower than hashset
 * no indexes
 * Rest every function is same as hashset
 */