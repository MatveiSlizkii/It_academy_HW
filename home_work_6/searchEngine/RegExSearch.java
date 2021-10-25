package home_work_6.searchEngine;

import home_work_6.searchEngine.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public long search(String text, String word) {
        long count = 0;
        Pattern pattern = Pattern.compile("\\b(" + word + ")\\b", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
            count++;
        return count;
    }
}
