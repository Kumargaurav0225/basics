package myconcurrency.introduction.mythread;

import java.util.concurrent.ThreadLocalRandom;

public class DriveMyThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        while (thread.count !=5){
            try{
                Thread.sleep(250);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }

        System.out.println("Program terminating.");
    }
}
