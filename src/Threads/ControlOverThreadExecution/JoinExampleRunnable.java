package Threads.ControlOverThreadExecution;

class MyTask implements Runnable{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("My Thread " + i);
        }
    }
}
public class JoinExampleRunnable {
    static void main(String[] args) {
        MyTask t1 = new MyTask();
        Thread t2 = new Thread(t1);
        t1.run();
        t2.start();
        System.out.println("Main Thread Finished");
        try{
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
