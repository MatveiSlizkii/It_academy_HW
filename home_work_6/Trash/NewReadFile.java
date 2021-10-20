//package home_work_6.Trash;
//
//import home_work_6.AdapterFile.ArrayStringToSet;
//import home_work_6.workWithFile.DeleteSimvols;
//
//import java.util.*;
//
//
//public class NewReadFile {
//    public static void main(String[] args) {
//        String actual = "- мир привет:    мир \nпривет...мир   пока    привет:мир привет :мир. мир-мир...";
//        DeleteSimvols deleteSimvols = new DeleteSimvols();
//        actual = deleteSimvols.deleteSimvolsAll(actual);
//        System.out.println(actual);
//        List<String> listBook = new ArrayList<>();
//        ArrayStringToSet arrayStringToSet = new ArrayStringToSet();
//        listBook = arrayStringToSet.listBook(actual);
//        System.out.println(Arrays.toString(new List[]{listBook}));
//        Map<String, Integer> mapBook = new HashMap<>();
//        mapBook = arrayStringToSet.mapBook(listBook);
////        for (Map.Entry<String, Integer> entry : mapBook.entrySet()) {
////            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
////        }
////    System.out.println(arrayStringToSet.topWords(5, mapBook));
////        for (Map.Entry<String, Integer> entry : mapBook.entrySet()) {
////            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
////        }
//        actual.indexOf("при");
//    }
//
//}
//
//
