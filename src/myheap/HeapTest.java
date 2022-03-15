package myheap;

import java.util.HashMap;

public class HeapTest {
    public static void main(String[] args) {
        HashMap<Integer,HeapTest> map = new HashMap<>();
        for (int i = 0; i <100000000 ; i++) {
            HeapTest ht =new HeapTest();
            map.put(i,ht);
        }
    }
}
