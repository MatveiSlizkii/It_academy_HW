package home_work_6;

public class EasySearch implements ISearchEngine{
    public long search(String text, String word) {

        long count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(" " + word + " ") != -1 ){
                i = text.indexOf(word)+1;
                text = text.substring(i);

                count++;
            } else {
                i = text.length();
            }

        }
        return count;
    }
}
