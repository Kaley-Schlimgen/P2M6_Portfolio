/*
 *
 * @author kaleyschlimgen
 * Programming 2: CT Mod 6
 * Edit for Portfolio Milestone #2
 *
 * Original Requirements:
 * Program stores 10 student objects in an ArrayList: ArrayList<Student>.
 * Student object contains: int rollno, String name, String address.
 * 2 comparator classes sort student objects by name and by rollno.
 * Implement own selection sort method and place code in separate Java source file.
 *
 * Portfolio Milestone Edit:
 * To enhance understanding, explore a different sorting algorithm.
 *
 * Since merge sort and quick sort have better performance, they can be
 * better for larger datasets (although merge set is best for really big data sets).
 * Since quick sort is quicker on data sets that are not huge, such as this one,
 * I will change my selection sort to quick sort.
 *
 */

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

        //my previous call to selection sort did not have the low and high indexes as input
        MyQuickSortMethod.quickSort(students, 0, students.size() - 1, new RollNoComparator());
        System.out.println("\nSORTED BY ROLL NUMBER:");
        printStudents(students);

        //same as above
        MyQuickSortMethod.quickSort(students, 0, students.size() - 1, new NameComparator());
        System.out.println("\nSORTED BY NAME:");
        printStudents(students);
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
