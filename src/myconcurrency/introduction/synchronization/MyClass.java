package myconcurrency.introduction.synchronization;

public class MyClass extends Thread{
    private String name;
    private MyObject myObj;

    public MyClass(MyObject myObj,String name){
        this.name = name;
        this.myObj=myObj;
    }

    public void run(){
        myObj.foo(name);
    }
}
