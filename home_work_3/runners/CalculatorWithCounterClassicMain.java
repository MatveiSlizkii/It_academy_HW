package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterClassic;

//4.1 + 15 * 7 + (28 / 5) ^ 2 31.36 = 140.45999999999998
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double x1 = calculator.divide(28, 5);
        calculator.incrementCountOperation();
        double x2 = calculator.exponentiation(x1, 2);
        calculator.incrementCountOperation();
        double x3 = calculator.multiply(15, 7);
        calculator.incrementCountOperation();
        double x4 = calculator.fold(4.1, x3);
        calculator.incrementCountOperation();
        double x5 = calculator.fold(x4, x2);
        calculator.incrementCountOperation();
        System.out.println(x5);
        System.out.println("Количество использований калькулятора = " + calculator.getCount());


    }
}
