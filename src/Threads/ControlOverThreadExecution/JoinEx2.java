package Threads.ControlOverThreadExecution;

class thread extends Thread{
    Thread other;
    thread(Thread other){
        this.other = other;
    }
    public void run(){
        try{
            if(other != null){
                other.join();
            }
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

public class JoinEx2 {
    static void main(String[] args){
        thread t1 = new thread(null);
        thread t2 = new thread(t1);
        t1.start();
        t2.start();
    }
}
