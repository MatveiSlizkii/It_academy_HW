package home_work_5.sorts;

import home_work_5.comparators.NameComparator;
import home_work_5.sorts.api.ISortsStudent;
import home_work_5.Student;

import java.util.List;

public class NameSort implements ISortsStudent {
    public void sort(List <Student> listStudent) {
        NameComparator nameComparator = new NameComparator();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < listStudent.size() - 1; i++) {
                if (nameComparator.compare(listStudent.get(i), listStudent.get(i + 1)) > 0) {
                    Student temp = listStudent.get(i + 1);
                    listStudent.set(i + 1, listStudent.get(i));
                    listStudent.set(i, temp);
                    isSorted = false;
                }
            }
        }
    }
}
