package Threads.LambdaExpression.withRunnableInterface.oldWay;

/*class MyTask implements Runnable {//myTask is a task
    public void run() {
        System.out.println("Thread is running.");
    }
}

class MyTask2 implements Runnable {//myTask is a task
    public void run() {
        System.out.println("Another Thread is running.");
    }
}*/

/* without creating the above classes we can directly use anonymous function while creating thread and define
 what function that thread should perform
 */

public class Demo {
    public static void main(String[] args) {

        /*MyTask obj = new MyTask();//this is just a task
        Thread t1 = new Thread(obj);//this is thread
        MyTask2 obj2 = new MyTask2();
        Thread t2 = new Thread(obj2);*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=5 ; i++){
                    System.out.println("Thread " + i + " running");
                }
            }
        });
        t1.start();
        t2.start();
    }
    }
