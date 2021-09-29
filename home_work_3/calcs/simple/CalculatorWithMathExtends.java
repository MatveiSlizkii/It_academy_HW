package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

        public double exponentiation(double x, int y) {

                return (Math.pow(x, y));
        } //возведение в степень

        public double module(double x) {
                return Math.abs(x);
        } //модуль

        public double sqrt(double x) {
                return Math.sqrt(x);
        } //квадратный корень из числа


        }
