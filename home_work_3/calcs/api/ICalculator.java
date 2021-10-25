package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * деление
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    double divide(double x, double y);
    /**
     * умножение
     * @param x первый множитель
     * @param y второй множитель
     * @return произведение
     */
    double multiply(double x, double y);
    /**
     * вычитание
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return разность
     */
    double substract(double x, double y);
    /**
     * сложение
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма слагаемых
     */
    double fold(double x, double y);
    /**
     * возведение в степень
     * @param x возводимое число
     * @param y степень
     * @return возведенное число в степень
     */
    double exponentiation(double x, int y);
    /**
     * возведение в модуль
     * @param x вводимое число
     * @return модуль числа
     */
    double module(double x);

    /**
     * квадратный корень числа
     * @param x число которое нужно возвести под корень
     * @return возведенное число под корнем
     */
    double sqrt(double x);
}
