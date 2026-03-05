package Threads.deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        Object lock1 =new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked lock1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (lock2) {
                    System.out.println("Thread 1 is waiting for lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 locked lock2");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (lock1) {
                    System.out.println("Thread 2 is waiting for lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
