package home_work_6;

import java.util.*;

public class ArrayStringToSet {

    public Set<String> setBook(String words) {
        String[] arrayWords = words.split("\\s");
        Set<String> setBook = new HashSet<>();
        Collections.addAll(setBook, arrayWords);
        return setBook;
    }

    public int sizeSet(Set<String> setBook) {
        return setBook.size();
    }

    public List<String> listBook(String words) {
        String[] arrayWords = words.split("\\s");
        List<String> listBook = new ArrayList<>();
        Collections.addAll(listBook, arrayWords);
        return listBook;
    }

    public Map<String, Integer> mapBook(List<String> listBook) {
        Map<String, Integer> mapBook = new HashMap<String, Integer>();
        for (int i = 0; i < listBook.size(); i++) {
            mapBook.putIfAbsent(listBook.get(i),1);
            if (mapBook.containsKey(listBook.get(i))) {
                mapBook.put(listBook.get(i), mapBook.get(listBook.get(i)) + 1);
            }
        }
        return mapBook;
    }

    public String topWords(int top, Map<String, Integer> mapBook) {
        // value list
        List<Integer> valueList = new ArrayList<>(mapBook.values());
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < valueList.size(); i++) {
                if (valueList.get(i) > valueList.get(i - 1)) {
                    int temp = valueList.get(i);
                    valueList.set(i, valueList.get(i - 1));
                    valueList.set(i - 1, temp);
                    isSorted = false;
                }
            }
        }
        // проверка на величину топов
        if (top > valueList.size()){
            top = valueList.size();
        }
        String result = "";
        if (top > 0){
            for (int i = 0; i < top; i++) {
                if (mapBook.containsValue(valueList.get(i))){
                    //result +=
                }

            }
        } else {
            return "Неверно указано число топ";
        }
        return Arrays.toString(new List[]{valueList});
    }

}
