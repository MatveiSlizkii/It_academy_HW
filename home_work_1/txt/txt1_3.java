package home_work_1.txt;

public class txt1_3 {
    public static void main (String[] args){
        int num1 = -42;
        int num2 = -15;

        int a = ~num1;                  //было  11010100
        System.out.println(a);          //стало 00101011
        a = ~num2;                      //было  11110111
        System.out.println(a);          //стало 00001000
        a = num1 & num2;                //было  11010100
        System.out.println(a);          //      11110111
                                        //стало 11010100
        //a = num1 &= num2;
        //System.out.println(a);
        a = num1 | num2;                //было  11010100
                                        //      11110111
        System.out.println(a);          //стало 11110111
        //a = num1 |= num2;
        //System.out.println(a);
        a = num1 ^ num2;                //было  11010100
                                        //      11110111
        System.out.println(a);          //стало 00100011
        //a = num1 ^= num2;
        //System.out.println(a);
        a = num1 >> 2;                  //было  11010100
        System.out.println(a);          //      на 2 вправо
                                        //      00110101

        a = num2 >> 2;                  //было  11110111
        System.out.println(a);          //      на 2 вправо
                                        //      00111101

        //a = num1 >>= num2;
        //System.out.println(a);
        a = num1 >>> 2;                 //было  11010100
        System.out.println(a);          //      на 2 вправо
                                        //      0011010100
        a = num2 >>> 2;                 //было  11110111
        System.out.println(a);          //      на 2 вправо
                                        //      0011110111
        a = num1 << 2;                  //было  11010100
        System.out.println(a);          //      на 2 влево
        //a = num1 <<= num2;            //      01010000
        //System.out.println(a);
        //a = num1 >>>= num2;
        //System.out.println(a);
        a = num2 << 2;                  //было  11110111
        System.out.println(a);          //      на 2 влево
                                        //      11011100

    }
}
