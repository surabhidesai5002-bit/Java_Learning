package CollectionFramework.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
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
 * No order of insertion maintained
 * Uses hashing internally
 * Very fast add, remove and search operation
 * no indexes
 */