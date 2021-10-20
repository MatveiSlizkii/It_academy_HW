package home_work_6.AdapterFile.Comporators;

import java.util.Comparator;

public class ComporatorListInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
