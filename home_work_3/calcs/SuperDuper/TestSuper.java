package home_work_3.calcs.SuperDuper;


import java.util.Arrays;

public class TestSuper {
    public static void main(String[] args) {
        String[] expressionArray = {"5", null, "3", null, "5", "-", "10"};

        int countNull = 0;
        for (int i = 0; i < expressionArray.length; i++) {
            if (expressionArray[i] == null) {
                countNull++;
            }
        }
        String[] newExpressionArray = new String[expressionArray.length - countNull];
//        int temp = 0;
//        for (int i = 0; i < expressionArray.length; i++) {
//            if (expressionArray[i] == null) {
////              newExpressionArray[temp] = expressionArray[i];
////              temp++;
//            }
            System.out.println(Arrays.toString(newExpressionArray));


            System.out.println(Arrays.toString(expressionArray));


        }
    }


