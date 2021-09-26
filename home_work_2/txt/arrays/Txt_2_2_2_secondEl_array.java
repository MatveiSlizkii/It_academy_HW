package home_work_2.txt.arrays;

public class Txt_2_2_2_secondEl_array {
    public static void main(String[] args) {
        ArraysUtils adg = new ArraysUtils();
        int[] arr = adg.arrayFromConsole();
        int n = 1;
        System.out.println();
        do {
            System.out.print(arr[n] + " ");
            n += 2;
        } while (n < arr.length);
        //while
        System.out.println();
        n = 1;
        while (n < arr.length) {
            System.out.print(arr[n] + " ");
            n += 2;
        }
        //for
        System.out.println();
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        //foreach костыль
        System.out.println();
        int i = 1;
        for (int element : arr) {
            while (i < arr.length) {
                System.out.print(arr[i] + " ");
                i += 2;
            }
        }
    }

}

