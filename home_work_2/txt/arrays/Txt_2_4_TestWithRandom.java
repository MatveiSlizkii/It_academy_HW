package home_work_2.txt.arrays;

import java.util.Arrays;

public class Txt_2_4_TestWithRandom {
    public static void main(String[] args) {
        Txt_2_4_MethodsPresentation test = new Txt_2_4_MethodsPresentation();
        int[] arr =  ArraysUtils.arrayRandom(10, 100);
        System.out.println("Исходный" + Arrays.toString(arr));

        System.out.println("Сумма четных " + test.sumChet(arr));
        System.out.println("Максимальный элемент с четным индексом " + test.maxChet(arr));
        System.out.println("Меньше ср арифметического" + Arrays.toString(test.averageMinus(arr)));
        System.out.println("Два наименьших числа " + Arrays.toString(test.twoMin(arr)));
        System.out.println("То что интервал" + Arrays.toString(test.interval(arr, 35, 65)));
        System.out.println("Сумма цифр массива " + test.sumNumArray(arr));

    }
}
