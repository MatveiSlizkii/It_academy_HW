package home_work_2.txt.arrays;

import java.util.Scanner;

public class txt_4_5_arrayFromConsole_Sorter {
    public static void main(String[] args) {
        SortUtils sort = new SortUtils();
        ArraysUtils adg = new ArraysUtils();
        int[] arr = adg.arrayFromConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("каким методом сортировки вы хотите воспользоваться");
        System.out.println("1 Пузырьковый метод");
        System.out.println("2 Шейкерный метод");
        int user = scanner.nextInt();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        if (user == 1){
            sort.bubbleSorter(arr);
        } else {
            sort.shakerSorter(arr);
        }
        System.out.print("-> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
