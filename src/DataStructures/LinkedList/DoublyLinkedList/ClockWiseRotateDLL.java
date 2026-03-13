package DataStructures.LinkedList.DoublyLinkedList;

//ROTATE DOUBLY LINKED LIST BY N NODES

class Node2 {
    char data;
    Node2 next;
    Node2 prev;

    Node2(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ClockWiseRotateDLL {
    Node2 head;

    ClockWiseRotateDLL() {
        head = null;
    }

    void insert(char val) {
        Node2 n = new Node2(val);

        if (head == null) {
            head = n;
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }

    void RotateByN(int N) {
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;

        while (N-- > 0) {
            head = head.next;
            temp = temp.next;
        }
        temp.next = null;
        head.prev = null;
    }

    void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

class Drive{
    public static void main() {
        ClockWiseRotateDLL dll = new ClockWiseRotateDLL();
        dll.insert('a');
        dll.insert('b');
        dll.insert('c');
        dll.insert('d');
        dll.insert('e');

        System.out.println("Original List:");
        dll.display();

        dll.RotateByN(3);

        System.out.println("After Rotation:");
        dll.display();
    }
}