package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(10);

        System.out.println(set);
        System.out.println(set.contains(20));
    }
}

/**
 * Features
 * Duplicates are not allowed
 * Automatically sort the data
 * Uses a Red and Black tree internally - self-balancing binary search tree - which makes it automatically sorted
 * Slower than hash set
 * Used when we want the data to be sorted
 */