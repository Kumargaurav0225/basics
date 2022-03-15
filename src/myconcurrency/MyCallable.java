package myconcurrency;

import java.util.concurrent.*;

class MyTask implements Callable<Integer> {

    private volatile int a;
    private volatile int b;

    MyTask(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a+b;
    }
}

public class MyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(new MyTask(2,7));
        System.out.println("Sum :: "+future.get());
        executorService.shutdown();
    }
}
