import java.util.ArrayList;
import java.util.Comparator;

public class MySelectionSortMethod {

    public static <Temp> void selectionSort(ArrayList<Temp> vals, Comparator<Temp> comparator) {
        for (int i = 0; i < vals.size() - 1; i++) {
            int indexSmallest = i;
            for (int j = i + 1; j < vals.size(); j++) {
                if (comparator.compare(vals.get(j), vals.get(indexSmallest)) < 0) {
                    indexSmallest = j;
                }
            }
            Temp temp = vals.get(indexSmallest);
            vals.set(indexSmallest, vals.get(i));
            vals.set(i, temp);
        }
    }
}
