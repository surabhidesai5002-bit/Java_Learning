package Threads.SingleThreaded;

public class Demo {
    static void main(String[] args) { //main is a thread
        System.out.println("Main thread started!");
        for(int i = 0 ; i<=4 ; i++){
            System.out.println("Main thread " + i);
        }
        System.out.println("Main thread stopped!");
    }
}
