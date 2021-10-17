package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToString {
    public String fileToString (String file) throws IOException {
         Path fileName = Path.of(file);
        return Files.readString(fileName);
    }
}
