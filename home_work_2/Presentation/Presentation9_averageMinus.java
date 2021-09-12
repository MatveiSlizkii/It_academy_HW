package home_work_2.Presentation;


import java.util.Arrays;


public class Presentation9_averageMinus {
    public static void main(String[] args) {
        int[] array = {1, 2, 11, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        Arrays.sort(array);
//        for (int i = 0; i < length; i++) { //проверка сортировки
//            System.out.print(array[i] + " ");
//        }
        for (int i = 0; i < array.length; i++) { //нашли сумму в массиве
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= sum / array.length) {
                System.out.print(array[i] + " ");
            }

        }

    }
}