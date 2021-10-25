package home_work_6.adapterFile;

import home_work_6.adapterFile.api.IAdapterString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StringToMap implements IAdapterString {
    public Map<String, Integer> adaptFile (String book) {

        IAdapterString adapterFile;
        adapterFile = new StringToList();
        List<String> listBook = (List<String>) adapterFile.adaptFile(book);
        Map<String, Integer> mapBook = new HashMap<String, Integer>();
        for (int i = 0; i < listBook.size(); i++) {
            mapBook.putIfAbsent(listBook.get(i), 0);
            if (mapBook.containsKey(listBook.get(i))) {
                mapBook.put(listBook.get(i), mapBook.get(listBook.get(i)) + 1);
            }
        }
        return mapBook;
    }
}
