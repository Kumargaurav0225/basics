package myconcurrency.introduction.runnable;

public class MyRunnable implements Runnable {
    public int count = 0;

    @Override
    public void run() {
        System.out.println("RunnableThread starting.");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("RunnableThread count: " + count);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread terminating.");
    }
}
