package CollectionFramework.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.contains(40));
        System.out.println(list.remove(3));
        System.out.println(list.contains(40));
        System.out.println(list);

        for(int i : list){
            System.out.print(i + " ");
        }

    }
}

/**
 *Features
 * Maintains order of insertion
 * allows duplicates
 * dynamic size
 * allows index based access
 */