package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        System.out.println(calculator.fold(calculator.fold(4.1, calculator.multiply(15, 7)), calculator.exponentiation(calculator.divide(28, 5), 2)));
        System.out.println("Количество использований калькулятора = " + calculator.getCountOperation());
    }
}
