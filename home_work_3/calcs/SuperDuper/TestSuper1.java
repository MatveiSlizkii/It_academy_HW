package home_work_3.calcs.SuperDuper;

import java.util.Arrays;

public class TestSuper1 {
    public static void main(String[] args) {
        CalculationLowPriority calculationLowPriority = new CalculationLowPriority();
        CalculationMediumPriority calculationMediumPriority = new CalculationMediumPriority();
        String[] testExpression = {"5","+","8", "-","5","+","15", "*", "2", "/", "3"};//18
        calculationMediumPriority.calculationMediumPriority(testExpression);
        System.out.println(calculationLowPriority.calculationLowPriority(testExpression));



    }
}

