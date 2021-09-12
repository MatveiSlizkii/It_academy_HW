package home_work_2.txt.arrays;

public class txt_2_2_3_reverse_array {
    public static void main(String[] args) {
        ArraysUtils adg = new ArraysUtils();
        int[] arr = adg.arrayFromConsole();
        int n = arr.length - 1;
        System.out.println();
        do {
            System.out.print(arr[n] + " ");
            n--;
        } while (n != -1);
        //while
        System.out.println();
        n = arr.length - 1;
        while (n != -1) {
            System.out.print(arr[n] + " ");
            n--;
        }
        //for
        System.out.println();
        for (int i = arr.length - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        //foreach костыль
        System.out.println();
        int i = arr.length - 1;
        for (int element : arr) {
            System.out.print(arr[i] + " ");
            i--;
        }

    }
}
