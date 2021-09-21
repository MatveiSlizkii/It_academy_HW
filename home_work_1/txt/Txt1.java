package home_work_1.txt;

public class Txt1 {
    public static void main (String[] args){
        int num1 = 42;
        int num2 = 15;

        int a = ~num1;                  //было  00101010
        System.out.println(a);          //стало 11010101
        a = ~num2;                      //было  00001111
        System.out.println(a);          //стало 11110000
        a = num1 & num2;                //было  00101010
        System.out.println(a);          //      00001111
                                        //стало 00001010
        //a = num1 &= num2;
        //System.out.println(a);
        a = num1 | num2;                //было  00101010
                                        //      00001111
        System.out.println(a);          //стало 00101111
        //a = num1 |= num2;
        //System.out.println(a);
        a = num1 ^ num2;                //было  00101010
                                        //      00001111
        System.out.println(a);          //стало 00100101
        //a = num1 ^= num2;
        //System.out.println(a);
        a = num1 >> 2;                  //было  00101010
        System.out.println(a);          //      на 2 вправо
                                        //      00001010

        a = num2 >> 2;                  //было  00001111
        System.out.println(a);          //      на 2 вправо
                                        //      00000011

        //a = num1 >>= num2;
        //System.out.println(a);
        a = num1 >>> 2;                 //было  0101010
        System.out.println(a);          //      на 2 вправо
                                        //      000101010
        a = num2 >>> 2;                 //было  00001111
        System.out.println(a);          //      на 2 вправо
                                        //      0000001111
        a = num1 << 2;                  //было  00101010
        System.out.println(a);          //      на 2 влево
        //a = num1 <<= num2;            //      10101000
        //System.out.println(a);
        //a = num1 >>>= num2;
        //System.out.println(a);
        a = num2 << 2;                  //было  00001111
        System.out.println(a);          //      на 2 влево
                                        //      00111100

    }
}
