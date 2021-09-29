package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        System.out.println("CalculatorWithOperator");
    printResultCalculators(calculatorWithOperator);
        System.out.println("CalculatorWithMathCopy");
    printResultCalculators(calculatorWithMathCopy);
        System.out.println("CalculatorWithMathExtends");
    printResultCalculators(calculatorWithMathExtends);
}
/*
конструтор что ли
 */
    public static void printResultCalculators(ICalculator iCalculator) {

        CalculatorWithCounterAutoCompositeInterface calculatorWithCounterAutoCompositeInterface = new CalculatorWithCounterAutoCompositeInterface(iCalculator);

        double x1 = calculatorWithCounterAutoCompositeInterface.divide(28, 5);
        double x2 = calculatorWithCounterAutoCompositeInterface.exponentiation(x1, 2);
        double x3 = calculatorWithCounterAutoCompositeInterface.multiply(15, 7);
        double x4 = calculatorWithCounterAutoCompositeInterface.fold(4.1, x3);
        double x5 = calculatorWithCounterAutoCompositeInterface.fold(x4, x2);

        System.out.println(x5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoCompositeInterface.getCountOperation() + " операций");

    }
}