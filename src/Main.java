import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Fred", "123 W. Elm St."));
        students.add(new Student(2,"Amy", "232 South St."));
        students.add(new Student(3,"Cat", "4321 Park Ave."));
        students.add(new Student(4,"Ernie", "555 W. Elm St."));
        students.add(new Student(5,"Jack", "555 South St."));
        students.add(new Student(6,"Daryl", "555 Park Ave."));
        students.add(new Student(7,"George", "123 E. 5th St."));
        students.add(new Student(8,"Bobby", "232 S. Sherman St."));
        students.add(new Student(9,"Joe", "4321 53rd Ave."));
        students.add(new Student(10,"Harry", "123 W. Broadway St."));

        MySelectionSortMethod.selectionSort(students, new RollNoComparator());
        System.out.println("\nSORTED BY ROLL NUMBER:");
        printStudents(students);

        MySelectionSortMethod.selectionSort(students, new NameComparator());
        System.out.println("\nSORTED BY NAME:");
        printStudents(students);
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
