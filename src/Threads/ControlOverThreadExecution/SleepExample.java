package Threads.ControlOverThreadExecution;

class MyThread extends Thread {
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("My Thread " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class SleepExample{
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }

}
