package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
                CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
                CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

                CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite1 = new CalculatorWithCounterAutoComposite(calculatorWithOperator);
                double x1 = calculatorWithCounterAutoComposite1.divide(28, 5);
                double x2 = calculatorWithCounterAutoComposite1.exponentiation(x1, 2);
                double x3 = calculatorWithCounterAutoComposite1.multiply(15, 7);
                double x4 = calculatorWithCounterAutoComposite1.fold(4.1, x3);
                double x5 = calculatorWithCounterAutoComposite1.fold(x4, x2);

                System.out.println(x5);
                System.out.println("Было выполнено " + calculatorWithCounterAutoComposite1.getCountOperation() + " операций");

                CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite2 = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
                x1 = calculatorWithCounterAutoComposite2.divide(28, 5);
                x2 = calculatorWithCounterAutoComposite2.exponentiation(x1, 2);
                x3 = calculatorWithCounterAutoComposite2.multiply(15, 7);
                x4 = calculatorWithCounterAutoComposite2.fold(4.1, x3);
                x5 = calculatorWithCounterAutoComposite2.fold(x4, x2);

                System.out.println(x5);
                System.out.println("Было выполнено " + calculatorWithCounterAutoComposite2.getCountOperation() + " операций");

                CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite3 = new CalculatorWithCounterAutoComposite(calculatorWithMathExtends);
                x1 = calculatorWithCounterAutoComposite3.divide(28, 5);
                x2 = calculatorWithCounterAutoComposite3.exponentiation(x1, 2);
                x3 = calculatorWithCounterAutoComposite3.multiply(15, 7);
                x4 = calculatorWithCounterAutoComposite3.fold(4.1, x3);
                x5 = calculatorWithCounterAutoComposite3.fold(x4, x2);

                System.out.println(x5);
                System.out.println("Было выполнено " + calculatorWithCounterAutoComposite3.getCountOperation() + " операций");
    }
}
