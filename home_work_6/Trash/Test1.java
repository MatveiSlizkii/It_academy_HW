package home_work_6.Trash;

import home_work_6.SearchEngine.EasySearch;
import home_work_6.SearchEngine.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String actual = "- мир привет:    мир \nпривет...мир   пока  Java  привет:мир привет :мир. мир-мир... мир ";
        ISearchEngine searchEngine;
        searchEngine = new EasySearch();
        System.out.println(searchEngine.search(actual, "мир"));



    }
}
