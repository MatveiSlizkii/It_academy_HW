package home_work_5;

/*
	+1.1 Порядковый номер (int)
	+1.2 Имя (Строка размером от 3 до 10 русских символов)
	+1.3 возраст (7-17)
	+1.4 оценка(0.0-10.0)
	+1.5 признак участия в олимпиадах (bool).
2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.
	2.1 Заполнять имя рандомными русскими символами
	2.2* Заполнять имя рандомными понятными именами
	2.3** Заполнять имя рандомными понятными именами загруженными из файла.
+ 3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
+ Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.
4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
 */


import home_work_5.GenerateNames.GenerateName;
import home_work_5.Sorts.AgeSort;
import home_work_5.Sorts.MarkSort;
import home_work_5.Sorts.NameSort;
import home_work_5.Sorts.api.ISortsStudent;
import home_work_5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class StudentMain {
    public static void main(String[] args) {
/*
создали массив
 */
        List<Student> listStudent = new ArrayList<>();
/*
заполняем 10_000 студентов через конструктор,
 */
        GenerateName generateName = new GenerateName();
        generateName.createProName(); //сгенерили список имен из файла
        for (int i = 0; i < 10_000; i++) {
            Random random = new Random();
            listStudent.add(new Student(i + 1, generateName.getProName().get(random.nextInt(generateName.getProName().size())), random.nextInt(11) + 7, Math.round((Math.random() * 10) * 100.0) / 100.0, random.nextBoolean()));
        }                                                // или рандом generateName.simpleName(3,10)

/*
все сортировочки
 */
        /*
        3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
         */
        List<Student> sortAge12Mark8Student = new ArrayList<>();
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getAge() >= 12 && listStudent.get(i).getMark() >= 8) {
                sortAge12Mark8Student.add(listStudent.get(i));
            }
        }
        System.out.println("------------------По возрасту (тем кому 12 и выше), по оценке (выше 8)-------------------");
        System.out.println(sortAge12Mark8Student);
        // импортируем интерфейс с сортировками
        ISortsStudent sortsStudent;
        /*
        4 Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        List<Student> sortNameStudent = new ArrayList<>(listStudent);
        sortsStudent = new NameSort();
        sortsStudent.sort(sortNameStudent);
        System.out.println("-------------------Сортировка по имени----------------------");
        System.out.println(sortNameStudent.subList(0, 10));
/*
5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
 */
        List<Student> sortMarkStudent = new ArrayList<>(listStudent);
        sortsStudent = new MarkSort();
        sortsStudent.sort(sortMarkStudent);
        System.out.println("-----------------Сортировка по оценке-----------------");
        System.out.println(sortMarkStudent.subList(0, 10));
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
/*
        6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
 */
        List<Student> sortAgeMarkStudent = new ArrayList<>(listStudent);
        sortsStudent = new MarkSort();
        sortsStudent.sort(sortAgeMarkStudent);
        sortsStudent = new AgeSort();
        sortsStudent.sort(sortAgeMarkStudent);
        for (int i = 7; i < 18; i++) {
            for (int j = 0; j < sortAgeMarkStudent.size(); j++) {
                if (sortAgeMarkStudent.get(j).getAge() == i) {
                    System.out.println("топ 10 студентов с возрастом " + i);
                    System.out.println(sortAgeMarkStudent.subList(j, j + 10));
                    break;
                }

            }
        }
    }
}
