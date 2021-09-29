package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    /*
    поля
     */
    private long countOperation;

    private CalculatorWithOperator calculatorWithOperator;

    private CalculatorWithMathCopy calculatorWithMathCopy;

    private CalculatorWithMathExtends calculatorWithMathExtends;
/*
гетер счетчика
 */
public long getCountOperation() {
    return countOperation;
}
/*
метод увеличивает счетчик
 */

    public void incrementCountOperation() {
        countOperation++;
    }
/*
конструкторы три штуки
 */
public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
    this.calculatorWithOperator = calculatorWithOperator;
}

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
        return result;
    } //корень




}
