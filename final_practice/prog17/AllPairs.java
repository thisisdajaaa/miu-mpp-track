package final_practice.prog17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AllPairs {
    public static List<Pair<Integer, Integer>> allIncreasingPairs(List<Integer> list) {
        List<Pair<Integer, Integer>> returnVal = new ArrayList<>();
        for (int x : list) {
            for (int y : list) {
                if (x < y) {
                    Pair<Integer, Integer> p = new Pair<>(x, y);
                    returnVal.add(p);
                }
            }
        }
        return returnVal;
    }

    public static <T> List<Pair<T, T>> allIncreasingPairs2(List<T> list, Comparator<? super T> comparator) {
        List<Pair<T, T>> returnVal = new ArrayList<>();

        for (T x : list) {
            for (T y : list) {
                if (comparator.compare(x, y) < 0) {
                    Pair<T, T> p = new Pair<>(x, y);
                    returnVal.add(p);
                }
            }
        }
        return returnVal;
    }
}
