package myconcurrency;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<T> {
    private List<T> queue= new LinkedList<>();
    private int limit =10;

    public synchronized void put(T item){
        while (queue.size()==limit){
            try {
                wait();
            }catch (InterruptedException exc){
                System.out.println("Interrupted");
            }
        }
        if (queue.isEmpty())
            notify();
        queue.add(item);
    }

    public synchronized T take(){
        while (queue.isEmpty()){
            try {
                wait();
            }catch (InterruptedException exc){}
        }
        if (queue.size() == limit)
            notifyAll();
        return queue.remove(0);
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new BlockingQueue<>();
        for (int i = 0; i <10 ; i++)
            queue.put(i+1);

        Thread t1 = new Thread(()-> queue.put(11));
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        queue.take();
    }
}
