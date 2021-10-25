package home_work_6.trash;

import home_work_6.workWithFile.DeleteSimvols;

public class Test1 {
    public static void main(String[] args) {
        String actual = "- мир привет:    мир \nпривет...мир   пока  Java  привет:мир привет :мир. мир-мир... мир ";
        DeleteSimvols deleteSimvols= new DeleteSimvols(actual);
        System.out.println(deleteSimvols.getBook());



    }
}
