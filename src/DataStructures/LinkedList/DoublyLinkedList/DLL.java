package DataStructures.LinkedList.DoublyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DLL {
    Node head;

    public DLL(){
       this.head = null;
    }

    //insert at head
    void insertAtHead(int val){
        Node n = new Node(val);
        if(head != null){
            n.next=head;
            head.prev = n;
        }
        head = n;
    }

    //insert at tail
    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
    }

    //get size
    int getSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    //insert at random place
    void insertAtPos(int val,int pos){
        int size = getSize();
        Node n=new Node(val);
        if(pos < 0 || pos > size){
            System.out.println("Invalid Position Given");
        } else if (pos==0) {
            n.next=head;
            head=n;
        }else{
            Node temp=head;
            while(--pos>0){
                temp = temp.next;
            }
            n.next=temp.next;
            n.prev = temp;
            if(temp.next != null){
                temp.next.prev = n;
            }
            temp.next=n;
        }
    }


    //delete at head
    void deleteAtHead(){
        if(head==null){
            System.out.println("Get Lost!");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null;
    }

    //delete value
    void deleteVal(){

    }

    //display
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

}


class Driver {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.insertAtTail(60);
        dll.insertAtPos(35, 3);
        dll.insertAtPos(35, 20);
        dll.insertAtPos(5, 0);
        dll.insertAtPos(35, -3);
        dll.display();
        dll.deleteAtHead();
//            dll.deleteVal(30);
//            dll.display();
//            dll.deleteVal(300);
        dll.display();
        dll.deleteAtHead();
        dll.display();
    }
}


