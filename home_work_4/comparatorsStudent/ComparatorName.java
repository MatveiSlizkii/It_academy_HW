package home_work_4.comparatorsStudent;

import home_work_4.Student;

import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {
    /**
     *
     * @param o1 первый студент
     * @param o2 второй студент
     * @return сравнивает имена студентов
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
