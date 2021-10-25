package home_work_6.searchEngine;

import home_work_6.searchEngine.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    public long search(String text, String word) {
        long count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            if (text.indexOf(word) != -1) {
                isSorted = false;
                text = text.substring(text.indexOf(word) + 1);
                count++;
            }
        }
        return count;
    }
    /* Версия, которая была на паре, оптимизированная с точки зрения что тут не надо сабстринг
        так как индекс оф может принимать два значения
        public long search(String text, String word) {
        int index = text.indexOf(word);
        long count = 0;
        while (index != -1){
            count++;
            index = text.indexOf(word, index + 1);
        }
        return count;
    }
     */
}
