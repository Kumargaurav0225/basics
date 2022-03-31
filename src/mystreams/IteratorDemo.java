package mystreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

// Use an iterator with a stream.
public class IteratorDemo {
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

        // Obtain an iterator to the stream
        Iterator<String> iterator = myStream.iterator();

        // Iterate the elements in the stream
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
