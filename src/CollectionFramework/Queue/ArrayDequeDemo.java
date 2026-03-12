package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(0);
        dq.add(1);
        dq.addLast(3);
        dq.add(2);

        System.out.println(dq);
    }
}

/**
 * Features
 * Allows adding and removing from both the sides
 * Faster than Stem class which is no legacy
 * Can work like stack and queues
 */
