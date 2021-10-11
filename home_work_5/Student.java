package home_work_5;

/*
1. Создать класс Student с полями
	+1.1 Порядковый номер (int)
	+1.2 Имя (Строка размером от 3 до 10 русских символов)
	+1.3 возраст (7-17)
	+1.4 оценка(0.0-10.0)
	+1.5 признак участия в олимпиадах (bool).
2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.
	2.1 Заполнять имя рандомными русскими символами
	2.2* Заполнять имя рандомными понятными именами
	2.3** Заполнять имя рандомными понятными именами загруженными из файла.
3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8). Отфильтрованных
студентов поместить в отдельный список. Старый список дожен остаться неизменным.
4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
Читай внимательно шестое задание
 */


import java.util.Comparator;

public class Student {
private int serialNumber;
private String name;
private int age;
private double mark;
private boolean olimpiad;

    public Student(int serialNumber, String name, int age, double mark, boolean olimpiad) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.olimpiad = olimpiad;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOlimpiad() {
        return olimpiad;
    }

    public void setOlimpiad(boolean olimpiad) {
        this.olimpiad = olimpiad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "номер = " + serialNumber +
                ", имя = '" + name + '\'' +
                ", возраст = " + age +
                ", оценка = " + mark +
                ", олимпиадник = " + olimpiad +
                '}';
    }

}
