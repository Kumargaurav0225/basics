package misc;

import java.util.LinkedHashSet;
import java.util.Set;

public class FilterOddNumbers {
    public static void main(String[] args) {
        printPrime(100);
    }

    private static void printPrime(int n) {

        Set<Integer> comNos = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if((i%j == 0)){
                    comNos.add(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(!comNos.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
