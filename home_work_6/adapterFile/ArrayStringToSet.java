package home_work_6.adapterFile;

import home_work_6.adapterFile.comporators.ComporatorListInteger;

import java.util.*;

public class ArrayStringToSet {

    public int sizeSet(Set<String> setBook) {
        return setBook.size();
    }



    public List<String> topWords(int top, Map<String, Integer> mapBook) {
        // value list
        Map<String, Integer> mapBookForTop = new HashMap<String, Integer>(mapBook);
        List<Integer> valueList = new ArrayList<>(mapBookForTop.values());
        ComporatorListInteger comporatorList = new ComporatorListInteger();
        valueList.sort(comporatorList);

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
