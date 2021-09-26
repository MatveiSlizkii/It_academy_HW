package home_work_2.txt.arrays;

public class Txt_2_2_1_all_array {
    public static void main(String[] args) {
        ArraysUtils adg = new ArraysUtils();
        int[] arr = adg.arrayFromConsole();
        int n = 0;
        System.out.println();
        do {
            System.out.print(arr[n] + " ");
            n++;
        } while (n != arr.length);
        //while
        System.out.println();
        n = 0;
        while (n != arr.length) {
            System.out.print(arr[n] + " ");
            n++;
        }
        //for
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //foreach
        System.out.println();
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
