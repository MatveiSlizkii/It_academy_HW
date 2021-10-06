package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

/*
1 объвили класс
 */
public class DataContainer<T> {
    /*
    2 создали массив
     */
    private T[] data;

    /*
    3
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /*
    4  добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

       /*
    5 вводим индекс - получаем значение
     */

    public T get(int index) {
        if (index > data.length - 1) {
            return null;
        }
        return this.data[index];
    }

    /*
    6 выводим весь массив
     */
    public T[] getItems() {
        return data;
    }


    /*
    просто метод который сортирует пузрьком так что в конец сдвигается null
     */
    public void sortNull(T[] data) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = data.length - 2; i > -1; i--) {
                if (data[i] == null && data[i + 1] != null) {
                    data[i] = data[i + 1];
                    data[i + 1] = null;
                    isSorted = false;
                }
            }
        }
    }

    /*
    7 удаляет элемент в массиве по индексу полностью, Карл
     */
    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else {
            data[index] = null;
            //сортируем
            sortNull(data);
            // уменьшаем массив
            data = Arrays.copyOf(data, data.length - 1);
        }
        return true;
    }

    /*
    8 удаляет элемент в массиве полностью, Карл
    */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                data[i] = null;
                //сортируем
                sortNull(data);
                // уменьшаем массив
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    /*
    9 сортировочка
     */
    private void sort(Comparator<T> comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 1) {
                    T temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    /*
    10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
     */
    @Override
    public String toString() {
        String str = "";
        for (T item : data) {
            if (item != null) {
                str += item + " ";
            }
        }
        return str;
    }
}
