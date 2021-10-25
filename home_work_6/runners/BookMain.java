//package home_work_6.runners;
//
//import home_work_6.AdapterFile.Comporators.ComporatorListInteger;
//import home_work_6.AdapterFile.StringToMap;
//import home_work_6.AdapterFile.StringToSet;
//import home_work_6.AdapterFile.api.IAdapterString;
//import home_work_6.SearchEngine.EasySearch;
//import home_work_6.SearchEngine.RegExSearch;
//import home_work_6.SearchEngine.api.ISearchEngine;
//import home_work_6.workWithFile.FileToString;
//import home_work_6.workWithFile.FileToStringWithoutSimvols;
//
//import java.io.IOException;
//import java.util.*;
//
//public class BookMain {
//    public static void main(String[] args) throws IOException{
//        String book = "D:\\JavaProject\\Wow\\Война и мир_книга.txt";
//
//        //задание с сетом
//        FileToStringWithoutSimvols fileToStringWithoutSimvols = new FileToStringWithoutSimvols(book);
//        String newBook = fileToStringWithoutSimvols.getStringWithoutSimvols();
//        //познакомили с адаптером
//        IAdapterString adapterString;
//        // генерируем Set
//        adapterString = new StringToSet();
//        Set<String> setBook = (Set<String>) adapterString.adaptFile(newBook);
//       // System.out.println(Arrays.toString(new Set[]{setBook}));
//
//        // задание с Map
//        // генерируем Map
//        adapterString = new StringToMap();
//        Map<String,Integer> mapBook = (Map<String, Integer>) adapterString.adaptFile(newBook);
//        //этот лист копирует в себя все значения
//        List<Integer> valueList = new ArrayList<>(mapBook.values());
//        // а теперь мы этот лист сортируем
//        ComporatorListInteger comporatorList = new ComporatorListInteger();
//        valueList.sort(comporatorList.reversed());
//        //System.out.println(Arrays.toString(new List[]{valueList}));
//        // теперь выводим топ!
//        int top = 10;
//        if (top > valueList.size()) {
//            top = valueList.size();
//        }
//        //это лист с топом готовым
//        List<String> topTop= new ArrayList<>();
//        // это копия Map так как дальше мне там надо менять значения и не хочу, чтобы исходный Map изменялся из-за костыля
//        Map<String,Integer> mapBookForTop = new HashMap<String, Integer>(mapBook);
//        if (top > 0) {
//            for (int i = 0; i < top; i++) {
//                for (Map.Entry<String, Integer> entry : mapBookForTop.entrySet()) {
//                    if(entry.getValue().equals(valueList.get(i))){
//                        topTop.add(entry.getKey() + " - " + entry.getValue() + " раз");
//                        //это костыль чтобы не повторять слова с одинаковой колво повторений
//                        // типо чтобы не зациклилось вывод слов со одинаковым значением, то есть не вовыодилось одно и то же число
//                        mapBook.put(entry.getKey(), -1);
//                        //Война - 200 раз
//                    }
//                }
//            }
//        } else {
//            topTop.add("Невозможно вывести топ");
//        }
//       // System.out.println(Arrays.toString(new List[]{topTop}));
//
//        // задания с ISearchEngine
//        FileToString fileToString = new FileToString(book);
//        ISearchEngine searchEngine;
//        searchEngine = new EasySearch();
//        //System.out.println(searchEngine.search(fileToString.getStringFile(), "и"));
//        searchEngine = new RegExSearch();
//        System.out.println(searchEngine.search(fileToString.getStringFile(), "и"));
//
//    }
//
//}
