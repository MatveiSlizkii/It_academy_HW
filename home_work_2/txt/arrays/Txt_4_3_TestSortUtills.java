package home_work_2.txt.arrays;

public class Txt_4_3_TestSortUtills {
    public static void main(String[] args) {
        SortUtils sort = new SortUtils();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        int[] arr4 = {};
        //пузырек
        System.out.println("Пузырек");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.bubbleSorter(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.bubbleSorter(arr2);

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.bubbleSorter(arr3);

        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.bubbleSorter(arr4);

        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // шейкерная
        System.out.println("Шейкерная");
        int[] arr5 = {1, 2, 3, 4, 5, 6};
        int[] arr6 = {1, 1, 1, 1};
        int[] arr7 = {9, 1, 5, 99, 9, 9};
        int[] arr8 = {};
        for (int i : arr5) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");

        sort.shakerSorter(arr5);

        for (int i : arr5) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr6) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.shakerSorter(arr6);

        for (int i : arr6) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr7) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.shakerSorter(arr7);

        for (int i : arr7) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr8) {
            System.out.print(i + " ");
        }
        System.out.print("-> ");
        sort.shakerSorter(arr8);

        for (int i : arr8) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
