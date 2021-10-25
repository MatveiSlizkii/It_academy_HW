package home_work_4;

import java.util.Comparator;

public class Student{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return возраст студента
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age возраст студента
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return имя студента
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name сохраняеи имя студента
     */
    public void setName(String name) {
        this.name = name;
    }


}
