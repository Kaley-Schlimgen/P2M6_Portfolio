/*
 *
 * Switching MySelectionSortMethod to MyQuickSortMethod
 *
 * SelectionSort must find the smallest element in the section of the array that
 * has not yet been sorted, which can take a lot longer than QuickSort.
 *
 * QuickSort is faster because it partitions, or splits an array around
 * a pivot, or middle, element. It sorts each left and right sub-arrays recursively.
 *
 */
import java.util.ArrayList;
import java.util.Comparator;

//I changed the name of this class from MySelectionSort
public class MyQuickSortMethod {

    //if low is less than high, array will be partitioned in partition() method
    //subarrays will be sorted (recursively)
    public static <Student> void quickSort(ArrayList<Student> vals, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivot = partition(vals, low, high, comparator);
            quickSort(vals, low, pivot - 1, comparator);
            quickSort(vals, pivot + 1, high, comparator);
        }
    }

    // highest element = pivot
    // rearrange array so elements less than pivot are placed before it,
    // and greater than are placed after
    // returns pivot's high index
    private static <Student> int partition(ArrayList<Student> vals, int low, int high, Comparator<Student> comparator) {
        Student pivot = vals.get(high);
        int i = low - 1;

        //if comparator class returns -1(s1 is < than s2), values will be swapped
        for (int j = low; j < high; j++) {
            if (comparator.compare(vals.get(j), pivot) <= 0) {
                i++;
                swap(vals, i, j);
            }
        }

        swap(vals, i + 1, high);
        return i + 1;
    }

    //swap() swaps two elements in array
    private static <Student> void swap(ArrayList<Student> vals, int i, int j) {
        Student temp = vals.get(i);
        vals.set(i, vals.get(j));
        vals.set(j, temp);
    }
}
