package myconcurrency.introduction.synchronization;

public class MyObject {
    public synchronized void foo(String name){
        try {
            System.out.println("Thread "+name+".foo() : starting");
            Thread.sleep(3000);
            System.out.println("Thread "+name+".foo() : ending");
        }catch (InterruptedException exc){
            System.out.println("Thread "+name+" interrupted");
        }
    }
}
