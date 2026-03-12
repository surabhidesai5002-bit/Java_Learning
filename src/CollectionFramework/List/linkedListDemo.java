package CollectionFramework.List;

import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.addFirst("Start");
        ll.addLast("Stop");

        System.out.println(ll);
        System.out.println("First : " +ll.getFirst());
        System.out.println("Last : " + ll.getLast());
        System.out.println("Element : " + ll.get(3));
    }
}

/**
 *Features
 * Maintains order of insertion
 * allows duplicates
 * uses node structure internally - no indexes
 * slower reading but faster insertions and deletions compared to Arraylist
 */