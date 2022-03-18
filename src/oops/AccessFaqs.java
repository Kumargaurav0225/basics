package oops;

public class AccessFaqs {
    private int a;
    private static int b;
    private AccessFaqs() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "oops.AccessFaqs{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) {
        AccessFaqs obj = new AccessFaqs();
        obj.setA(1);
        System.out.println(obj.toString());
    }
}


