package Threads.MultiThreaded.WaysOfCreatingThreads.RunnableInterface.Ex1;

class MyTask implements Runnable{//myTask is a task
    public void run(){
        System.out.println("Thread is running.");
    }
}

public class Demo {
    static void main(String[] args) {
        MyTask obj = new MyTask();//this is just a task
        Thread t1 = new Thread(obj);//this is thread
        t1.start();//thread t1 is created and run function is executed
        obj.run();//obj object is runnning run function
    }
}
