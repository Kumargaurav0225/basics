package myconcurrency.introduction.synchronization;

public class SynchronisedMethods {
    public static void main(String[] args) {

        /* Difference references - both threads can call MyObject.foo() */
//        MyObject obj1 = new MyObject();
//        MyObject obj2 = new MyObject();
//        MyClass thread1 = new MyClass(obj1, "1");
//        MyClass thread2 = new MyClass(obj2, "2");
//        thread1.start();
//        thread2.start();

        /* Same reference to obj. Only one will be allowed to call foo, and the other will be forced to wait. */
        MyObject obj = new MyObject();
        MyClass thread1 = new MyClass(obj, "1");
        MyClass thread2 = new MyClass(obj, "2");
        thread1.start();
        thread2.start();
    }
}
