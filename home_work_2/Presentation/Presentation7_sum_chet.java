package home_work_2.Presentation;

public class Presentation7_sum_chet {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, 5, 6, 7, 8};
        int plus = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] % 2 == 0) {
                plus += nums[i];
            }
        }
        System.out.println(plus);
    }
}
