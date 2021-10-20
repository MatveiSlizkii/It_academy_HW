package home_work_6.workWithFile;

import java.io.IOException;

public class FileToStringWithoutSimvols {
private String stringWithoutSimvols;

    public String getStringWithoutSimvols() {
        return stringWithoutSimvols;
    }

    public FileToStringWithoutSimvols(String pathToFile) throws IOException {
        FileToString fileToString = new FileToString(pathToFile) ;
        DeleteSimvols deleteSimvols = new DeleteSimvols(fileToString.getStringFile());
        this.stringWithoutSimvols = deleteSimvols.getBook();

    }
}
