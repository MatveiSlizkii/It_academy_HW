package home_work_6.AdapterFile;

import home_work_6.AdapterFile.api.IAdapterString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringToList implements IAdapterString {
    public List<String> adaptFile(String book) {
        String[] arrayWords = book.split("\\s");
        List<String> listBook = new ArrayList<>();
        Collections.addAll(listBook, arrayWords);
        return listBook;
    }
}
