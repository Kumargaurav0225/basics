package mystreams;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

// Demonstrate trySplit().
public class TrySplitDemo {
    public static void main(String[] args) {
        // Create a list of Strings.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        // Obtain a Stream to the array list.
        Stream<String> myStream = myList.stream();

        // Obtain a Spliterator.
        Spliterator<String> spliterator = myList.spliterator();

        // Now, split the first iterator.
        Spliterator<String> spliterator2 = spliterator.trySplit();

        // If splitItr could be split, use splitItr2 first.
        if (spliterator2 != null) {
            System.out.println("Output from splitItr2: ");
            spliterator2.forEachRemaining((n) -> System.out.println(n));
        }

        // Now, use the splitItr.
        System.out.println("\nOutput from splitItr: ");
        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
