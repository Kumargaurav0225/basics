package mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomComparator {

    public static void main(String[] args) {
        // Create an empty ArrayList
        // to store Employee
        List<Employee> al = new ArrayList<>();

        Employee obj1 = new Employee("Ajay", 27);
        Employee obj2 = new Employee("Sneha", 23);
        Employee obj3 = new Employee("Simran", 37);
        Employee obj4 = new Employee("Ajay", 22);
        Employee obj5 = new Employee("Ajay", 29);
        Employee obj6 = new Employee("Sneha", 22);

        // Adding customer objects to ArrayList
        // using add() method
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        Collections.sort(al,new SortEmployees());
        for (Employee e: al) {
            System.out.println(e.toString());
        }
    }
}


