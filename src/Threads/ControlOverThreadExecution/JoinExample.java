package Threads.ControlOverThreadExecution;

class NewThread extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("My Thread " + i);
        }
    }
}

public class JoinExample {
    static void main(String[] args) {
       NewThread t1 = new NewThread();
        t1.start();
        System.out.println("Main Thread Finished");
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
