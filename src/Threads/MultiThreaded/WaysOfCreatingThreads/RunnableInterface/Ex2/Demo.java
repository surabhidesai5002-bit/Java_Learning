package Threads.MultiThreaded.WaysOfCreatingThreads.RunnableInterface.Ex2;

class MyTask implements Runnable{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("My Thread " + i);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask t2 = new MyTask();
        Thread t1 = new Thread(t2);
        t1.start();

        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("Main Thread " + i);
        }
    }
}
