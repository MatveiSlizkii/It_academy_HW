package home_work_2.txt.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введитете " + (i + 1) + " элемент массива.");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arr = new int[size];
        int minValueExclusion = 0;
        int diff = maxValueExclusion - minValueExclusion;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(diff + 1) + minValueExclusion;
        }
        return arr;
    }

}
