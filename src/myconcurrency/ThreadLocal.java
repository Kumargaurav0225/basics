package myconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocal {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            int id =i;
            threadPool.submit(() ->{
                String birthDate= new String(id+" 1990");
                System.out.println(birthDate);
            });
        }
        Thread.sleep(1000);
    }
}
