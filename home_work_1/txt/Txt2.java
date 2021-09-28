package home_work_1.txt;

public class Txt2 {
    public static void main(String[] args) {
        int num = 8;
        int num1 = 2;
        int a = 5 + 2 / num; //деление потом сложение получается 5
        System.out.println(a);
        int b = (5 + 2) / num; //сначало то что в скобках потом деление получается 0
        System.out.println(b);
        int c = (5 + num1++) / num; //сначала ++ потом скобки и потом деление получается (5+7)/8 = 0
        System.out.println(c);
        int d = (5 + num1++) / --num; // (5+2)/7 = 1 сначала ++ и -- потом по накатанной
        System.out.println(d);
        int e = (5 * 2 >> num1++) / num; //(10>>2)/8 = 2/8=0
        num1 = 2;
        System.out.println(e);
        int test = 10 >> 2;
        System.out.println("тест " + test);
        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> num1++) / --num; //(5 + 7 > 20 ? 68 : 22 * 2 >> 2) / 7; потом (12 > 20 ? 68 : 44 >> 2) / 7 потом (12 > 20 ? 68 : 44 >> 2)/7 потом  (false ? 68 :11)/7 потом 11/7 b  и у меня получается 1
        int test1 = 44 >> 2;
        System.out.println("тест " + test1);
        System.out.println(f);
        //int g = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> num1++) / --num; //ошибка компиляции тк булевое значение нельзя поделить на число
        boolean g1 = 6 - 2 > 3 && 12 * 12 <= 119; //4 > 3 && 24 <=119 потом true && 144 <=119 потом true && false потом false
        System.out.println(g1);
        boolean k = true && false; //false
        System.out.println(k);

    }
}
