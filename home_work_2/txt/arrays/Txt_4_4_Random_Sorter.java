package home_work_2.txt.arrays;

import java.util.Scanner;

public class Txt_4_4_Random_Sorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = scanner.nextInt();
        System.out.println("Введите максимальное число рандома");
        int maxValueExclusion = scanner.nextInt();
        int[] arr = ArraysUtils.arrayRandom(size, maxValueExclusion);
        System.out.println("каким методом сортировки вы хотите воспользоваться");
        System.out.println("1 Пузырьковый метод");
        System.out.println("2 Шейкерный метод");
        int user = scanner.nextInt();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        if (user == 1){
            SortUtils.bubbleSorter(arr);
        } else {
            SortUtils.shakerSorter(arr);
        }
        System.out.print("-> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
