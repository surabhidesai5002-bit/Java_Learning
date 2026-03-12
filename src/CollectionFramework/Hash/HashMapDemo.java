package CollectionFramework.Hash;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ajay");
        map.put(2, "Amar");
        map.put(3,"Alas");

        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(4));
        map.remove(1);
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(4));
    }
}

/**
 * Features
 * Key must be unique
 * Values can be duplicated
 * Does not maintain insertion order
 * Uses hashing Internally
 * Here we use -> put() , get(), remove(), containsKey(), ->important ones
 */