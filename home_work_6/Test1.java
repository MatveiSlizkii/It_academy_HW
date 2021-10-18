package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String actual = "- мир привет:    мир \nпривет...мир   пока    привет:мир привет :мир. мир-мир...";
        String input = "Hello Java ! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile(" Java ");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());

        System.out.println();

    }
}
