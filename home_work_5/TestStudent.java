package home_work_5;

import home_work_5.GenerateNames.GenerateName;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<String> coolNames = new ArrayList<String>();
        try

        {
            File file = new File("D:\\JavaProject\\src\\home_work_5\\GenerateNames\\Names.txt");
            //создаем объект  FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            //считаем сначала первую строку
            String line = reader.readLine();
            while (line != null){
                coolNames.add(line);
                //считаем остальные строки
                line = reader.readLine();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(coolNames);
        System.out.println(coolNames.size());

    }
}
