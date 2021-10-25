package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    //деление, умножение, вычитание, сложение
    //Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа


    public double divide(double x, double y) {
        return (x / y);
    } //деление


    public double multiply(double x, double y) {
        return (x * y);
    } //умножение


    public double substract(double x, double y) {
        return (x - y);
    } //вычитание


    public double fold(double x, double y) {
        return (x + y);
    } //сложение


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
