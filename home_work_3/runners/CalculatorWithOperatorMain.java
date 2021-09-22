package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithOperator;

//4.1 + 15 * 7 + (28 / 5) ^ 2 31.36 = 140.45999999999998
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
    System.out.println(calculator.fold(calculator.fold(4.1, calculator.multiply(15, 7)), calculator.exponentiation(calculator.divide(28, 5), 2)));


    }
}
