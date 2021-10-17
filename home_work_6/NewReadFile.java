package home_work_6;

import java.util.*;


public class NewReadFile {
    public static void main(String[] args) {
        String actual = "-привет мир привет:    мир \nпривет...мир   пока    привет:мир привет :мир. мир-мир...";
        DeleteSimvols deleteSimvols = new DeleteSimvols();
        actual = deleteSimvols.deleteSimvolsAll(actual);
        System.out.println(actual);
        List<String> listBook = new ArrayList<>();
        ArrayStringToSet arrayStringToSet = new ArrayStringToSet();
        listBook = arrayStringToSet.listBook(actual);
        Map<String, Integer> mapBook = new HashMap<>();
        mapBook = arrayStringToSet.mapBook(listBook);

      System.out.println(arrayStringToSet.topWords(5, mapBook));

    }

}


