package home_work_2.Presentation;


public class Presentation12_sum_num_in_arr {
    public static void main(String[] args) {
        int[] arr = {12, 104, 81};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){                    //если в массиво будет отрицательное число, чтобы не складывать "отрицательные цифры"
                arr[i] = arr[i] * -1;
            }
            int numLength = (int) (Math.log10(arr[i]) + 1);
            for (int j = 0; j < numLength; j++) {
                int a = arr[i] % 10;
                sum += a;
                arr[i] = arr[i] / 10;
            }
        }
        System.out.println("Сумма всех цифр в массиве = " + sum);
    }

}

