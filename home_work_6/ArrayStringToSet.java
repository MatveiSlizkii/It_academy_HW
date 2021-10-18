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
            mapBook.putIfAbsent(listBook.get(i), 0);
            if (mapBook.containsKey(listBook.get(i))) {
                mapBook.put(listBook.get(i), mapBook.get(listBook.get(i)) + 1);
            }
        }
        return mapBook;
    }

    public List<String> topWords(int top, Map<String, Integer> mapBook) {
        // value list
        Map<String, Integer> mapBookForTop = new HashMap<String, Integer>(mapBook);
        List<Integer> valueList = new ArrayList<>(mapBookForTop.values());
        //заменить на компаратор!
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
        // проверка на величину топов, если топ превышает колво слов то значение топа меняется на макс колво слов
        if (top > valueList.size()) {
            top = valueList.size();
        }
        List<String> topTop= new ArrayList<>();
        if (top > 0) {
            for (int i = 0; i < top; i++) {
            for (Map.Entry<String, Integer> entry : mapBookForTop.entrySet()) {
                    if(entry.getValue().equals(valueList.get(i))){
                        topTop.add(entry.getKey() + " - " + entry.getValue() + " раз");
                        //это костыль чтобы не повторять слова с одинаковой колво повторений
                        // типо чтобы не зациклилось вывод слов со одинаковым значением, то есть не вовыодилось одно и то же число
                        mapBookForTop.put(entry.getKey(), -1);
                        //Война - 200 раз
                    }
                }
            }
        } else {
            topTop.add("Невозможно вывести топ");
        }
        return topTop;
    }

}
