package home_work_5.generateNames;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateName {
    /*
    генерируем имена
     */
    public String simpleName(int min, int max) {
        String letters = "йцукенгшщзхъфывапролджэячсмитьбю";
        StringBuilder name = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(max - min + 1) + min; i++) {
            name.append(letters.charAt(random.nextInt(32)));
        }
        name = new StringBuilder(Character.toUpperCase(name.charAt(0)) + name.substring(1));
        return name.toString();
    }

    // список с именами из файла
    private List<String> proName = new ArrayList<String>();

    public List<String> getProName() {
        return proName;
    }

    // генерит список имен с файла
    public void createProName() {
        try {
            File file = new File("D:\\JavaProject\\src\\home_work_5\\GenerateNames\\Names.txt");
            //создаем объект  FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            //считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                proName.add(line);
                //считаем остальные строки
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
