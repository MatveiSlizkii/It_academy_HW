package home_work_2.Presentation;



public class Presentation10_two_min {
    public static void main(String[] args) {
        int[] array = {15, 213, 11, 4, 18, 6, 5, 8, 83, 2, 3};
        int back = array[0];
        int back2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (back >= array[i]) {
                back2 = back;
                back = array[i];
            }

        }

        System.out.println(back + ", " + back2);
    }
}
