package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    private long countOperation;

    ICalculator iCalculator;

    public long getCountOperation() {

        return countOperation;
    }

    public ICalculator getICalculator() {

        return iCalculator;
    }

    public void incrementCountOperation() {

        countOperation++;
    }

    public CalculatorWithCounterAutoCompositeInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;

    }

    public double divide(double x, double b) {
        incrementCountOperation();
        return iCalculator.divide(x, b);
    }

    public double multiply(double x, double b) {
        incrementCountOperation();
        return iCalculator.multiply(x, b);
    }

    public double subtract(double x, double b) {
        incrementCountOperation();
        return iCalculator.substract(x, b);
    }

    public double fold(double x, double b) {
        incrementCountOperation();
        return iCalculator.fold(x, b);
    }

    public double exponentiation(double x, int b) {
        incrementCountOperation();
        return iCalculator.exponentiation(x, b);
    }

    public double module(double x) {
        incrementCountOperation();
        return iCalculator.module(x);
    }

    public double sqrt(double x) {
        incrementCountOperation();
        return iCalculator.sqrt(x);
    }
}
