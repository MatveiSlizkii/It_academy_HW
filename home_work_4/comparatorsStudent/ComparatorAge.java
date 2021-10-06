package home_work_4.comparatorsStudent;

import home_work_4.Student;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
