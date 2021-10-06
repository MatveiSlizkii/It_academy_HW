package home_work_2.txt.arrays;

import java.util.Random;
import java.util.Scanner;

public class SortUtils {
    public static void bubbleSorter(int[] array) {
        boolean found = true; //надо ли делать сортировку до сих пор
        while (found) {
            found = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    found = true;
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
    }

    public static void shakerSorter(int[] array) {
        boolean found = true; //надо ли делать сортировку до сих пор
        while (found) {
            found = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            for (int i = array.length - 1; i >0; i--) {
                if (array[i] < array[i - 1]) {
                    found = true;
                    int a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        int[] container = {1, 14, 2, 18, 15, 3, 18, 0};
//        shakerSorter(container);
//        for (int i : container) {
//            System.out.print(i + " ");
//        }
//    }

}
