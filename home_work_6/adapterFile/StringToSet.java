package home_work_6.adapterFile;

import home_work_6.adapterFile.api.IAdapterString;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringToSet implements IAdapterString {

    public Set<String> adaptFile(String words) {

        String[] arrayWords = words.split("\\s");
        Set<String> setBook = new HashSet<>();
        Collections.addAll(setBook, arrayWords);
        return setBook;
    }
}
