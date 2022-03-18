package mycollections;

import java.util.Comparator;

public class SortEmployees implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameCompare =  e1.getName().compareTo(e2.getName());
        int ageCompare = e1.getAge()-e2.getAge();

        return nameCompare == 0 ? ageCompare : nameCompare;
    }
}
