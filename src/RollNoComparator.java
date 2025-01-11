import java.util.*;

public class RollNoComparator implements Comparator<Student> {
    //comparator class to sort student by rollNo
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}