package myconcurrency;

public class DaemonThread {
    public static void main(String[] args) {
        Thread daemon = new Thread(()
                -> System.out.println("Hello from daemon!"));
        daemon.setDaemon(true);
        daemon.start();
    }
}
