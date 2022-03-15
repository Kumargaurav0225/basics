package myconcurrency;

public class VolatileSingleton {
    private static volatile VolatileSingleton instance;

    public static VolatileSingleton getInstance(){
        if (instance == null){
            synchronized (VolatileSingleton.class){
                if (instance == null){
                    instance = new VolatileSingleton();
                    System.out.println("Instance Created");
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        VolatileSingleton obj = VolatileSingleton.getInstance();
    }
}
