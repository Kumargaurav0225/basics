package mycollections;

import java.util.Comparator;

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b) {

        return a.name.compareTo(b.name);
    }
}
