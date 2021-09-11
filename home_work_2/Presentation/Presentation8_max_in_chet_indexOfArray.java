package home_work_2.Presentation;

public class Presentation8_max_in_chet_indexOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 12, 4, 5, 6, 7, 8, 9, 10, 11};
        int max = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
