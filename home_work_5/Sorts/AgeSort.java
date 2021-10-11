package home_work_5.Sorts;

import home_work_5.Comparators.AgeComparator;
import home_work_5.Sorts.api.ISortsStudent;
import home_work_5.Student;

import java.util.List;

public class AgeSort implements ISortsStudent {

    public void sort(List<Student> listStudent) {
        AgeComparator ageComparator = new AgeComparator();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < listStudent.size() - 1; i++) {
                if (ageComparator.compare(listStudent.get(i), listStudent.get(i + 1)) > 0) {
                    Student temp = listStudent.get(i + 1);
                    listStudent.set(i + 1, listStudent.get(i));
                    listStudent.set(i, temp);
                    isSorted = false;
                }
            }
        }
    }

}
