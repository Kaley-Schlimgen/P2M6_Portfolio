import java.util.*;

public class NameComparator implements Comparator<Student> {
    //comparator class to sort student by name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}