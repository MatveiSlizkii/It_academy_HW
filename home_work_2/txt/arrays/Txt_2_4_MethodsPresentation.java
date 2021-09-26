package home_work_2.txt.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Txt_2_4_MethodsPresentation {

    /*
    2.4.1 Сумма четных положительных элементов массива
     */
    public int sumChet(int[] nums) {
        int plus = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] % 2 == 0) {
                plus += nums[i];
            }
        }
        return plus;
    }

    /*
    2.4.2. Максимальный из элементов массива с четными индексами
     */
    public int maxChet(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    /*
    2.4.3. Элементы массива, которые меньше среднего арифметического
     */
    public int[] averageMinus(int[] array) {
        int sum = 0;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) { //нашли сумму в массиве
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= sum / array.length) {
                count++;
            }
        }
        int[] array1 = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= sum / array.length) {
                array1[temp] = array[i];
                temp++;
            }
        }


        return array1;
    }
    /*
    2.4.4. Найти два наименьших (минимальных) элемента массива
    */

    public int[] twoMin(int[] array) {
        int[] twoMin = new int[2];
        twoMin[0] = array[0];
        twoMin[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (twoMin[0] >= array[i]) {
                twoMin[1] = twoMin[0];
                twoMin[0] = array[i];
            }
        }
        return twoMin;
    }
    /*
    2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     */

    public int[] interval(int[] arr, int a, int b) {
        int count = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                count--;
            }
        }
        int [] array = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= a || arr[i] >= b) {
                array[count] = arr[i];
                count++;
            }
        }
        return array;
    }

    /*
    2.4.6. Сумма цифр массива
     */
    public int sumNumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {                    //если в массиво будет отрицательное число, чтобы не складывать "отрицательные цифры"
                arr[i] = arr[i] * -1;
            }
            int numLength = (int) (Math.log10(arr[i]) + 1);
            for (int j = 0; j < numLength; j++) {
                int a = arr[i] % 10;
                sum += a;
                arr[i] = arr[i] / 10;
            }
        }
        return sum;
    }

}
