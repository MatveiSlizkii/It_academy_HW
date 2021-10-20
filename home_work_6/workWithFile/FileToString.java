package home_work_6.workWithFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToString {

    private String stringFile;
    //конструктор
    public FileToString(String pathToFile) throws IOException{
        Path fileName = Path.of(pathToFile);
        this.stringFile = Files.readString(fileName);

    }

    public String getStringFile() {
        return stringFile;
    }
}

