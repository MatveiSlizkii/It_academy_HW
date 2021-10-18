package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{

    public long search(String text, String word) {
        long count = 0;
        Pattern pattern = Pattern.compile(" " + word + " ");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
            count++;
        return count;
    }
}
