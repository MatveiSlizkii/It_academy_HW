package home_work_6.SearchEngine;

import home_work_6.SearchEngine.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    public long search(String text, String word) {
long count = 0;
        boolean isSorted = false;
while (!isSorted){
    isSorted = true;
    if (text.indexOf("/\bJava\b/") != -1){
        isSorted = false;
        text = text.substring(text.indexOf("/\bJava\b/")+1);
        count++;
    }
}
//        long count = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.indexOf(" " + word + " ") != -1 ){
//                i = text.indexOf(word)+1;
//                text = text.substring(i);
//
//                count++;
//            } else {
//                break;
//            }
//            System.out.println(count);
//        }
//        return count;
//    }
return count;
}}
