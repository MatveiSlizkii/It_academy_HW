package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
    CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
    /*
    7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
	7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
     */
    public double fold (double x, double y){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.fold(x, y);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.fold(x, y);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.fold(x, y);
        }
        calculatorWithCounterClassic.incrementCountOperation();
    return result;
    } //сумма

    public double substract (double x, double y){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.substract(x, y);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.substract(x, y);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.substract(x, y);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //вычитание

    public double divide (double x, double y){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.divide(x, y);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.divide(x, y);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.divide(x, y);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //деление

    public double multiply (double x, double y){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.multiply(x, y);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.multiply(x, y);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.multiply(x, y);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //умножение

    public double exponentiation (double x, int y){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.exponentiation(x, y);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.exponentiation(x, y);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.exponentiation(x, y);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //возведение в степень

    public double module (double x){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.module(x);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.module(x);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.module(x);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //модуль

    public double sqrt (double x){
        double result = 0;
        if (calculatorWithOperator != null){
            result = calculatorWithOperator.sqrt(x);
        } else if (calculatorWithMathCopy != null){
            result = calculatorWithMathCopy.sqrt(x);
        } else if (calculatorWithMathExtends != null){
            result = calculatorWithMathExtends.sqrt(x);
        }
        calculatorWithCounterClassic.incrementCountOperation();
        return result;
    } //корень

    public long getCountOperation(){
        return calculatorWithCounterClassic.getCount();
    }




}
