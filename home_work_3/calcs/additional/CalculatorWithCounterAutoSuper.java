package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long count = 0;

    public long getCount() {
        return count;
    }

    public double divide(double x, double y) {
        count++;
        return (x / y);
    } //деление

    public double multiply(double x, double y) {
        count++;
        return (x * y);
    } //умножение

    public double substract(double x, double y) {
        count++;
        return (x - y);
    } //вычитание

    public double fold(double x, double y) {
        count++;
        return (x + y);
    } //сложение

    public double exponentiation(double x, int y) {
        count++;
        return (Math.pow(x, y));
    } //возведение в степень

    public double module(double x) {
        count++;
        return Math.abs(x);
    } //модуль

    public double sqrt(double x) {
        count++;
        return Math.sqrt(x);
    } //квадратный корень из числа
}
