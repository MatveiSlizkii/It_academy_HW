package home_work_5.comparators;

import home_work_5.Student;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result;
        if (o1.getMark() - o2.getMark() < 0){
            result = -1;
        } else if(o1.getMark() - o2.getMark() > 0){
            result = 1;
        } else {
            result = 0;
        }
            return result;
    }

}
