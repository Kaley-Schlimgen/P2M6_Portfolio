import java.util.ArrayList;
import java.util.Comparator;

public class MyQuickSortMethod {

    public static <Student> void quickSort(ArrayList<Student> vals, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivot = partition(vals, low, high, comparator);
            quickSort(vals, low, pivot - 1, comparator);
            quickSort(vals, pivot + 1, high, comparator);
        }

    }

    private static <Student> int partition(ArrayList<Student> vals, int low, int high, Comparator<Student> comparator) {
        Student pivot = vals.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(vals.get(j), pivot) <= 0) {
                i++;
                swap(vals, i, j);
            }
        }

        swap(vals, i + 1, high);
        return i + 1;
    }

    private static <Student> void swap(ArrayList<Student> vals, int i, int j) {
        Student temp = vals.get(i);
        vals.set(i, vals.get(j));
        vals.set(j, temp);
    }
}
