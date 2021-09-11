package home_work_2.txt;

public class txt_1_5_multiplication_table_dinosaur {
    public static void main(String[] args) {
        System.out.println("#####   #     ####     #     #   # #  #       #");
        System.out.println("  #    # #    #       # #    #  ## #  #      # #");
        System.out.println("  #   #####   ###    #   #   # # # #  #     #####");
        System.out.println("  #  #     #  #  #  #     #  ##  # #  #    #     #");
        System.out.println("  # #       # ###  #       # #   # ###### #       # ");
        System.out.println("                                        #");
        for (int a = 1; a < 11; a++) {
            for (int i = 2; i < 6; i++) {
                if (i * a < 10) {
                    System.out.print(i + " x " + a + "  = " + i * a + "    "); //if сделан с целью несмещения из-за того
                } else if (a == 10) {                                          //что в ответах ответ состоит из 2 цифр
                    System.out.print(i + " x " + a + " = " + i * a + "   ");

                } else {
                    System.out.print(i + " x " + a + "  = " + i * a + "   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("                                   ########");
        System.out.println("                                  ####### ##");
        System.out.println("                                  ##########");
        System.out.println("                                  ##########");
        System.out.println("                                  ##########");
        System.out.println("                                       #####");
        System.out.println("                                    ########");
        System.out.println("                                        #####       #");
        System.out.println("                                        ######      #");
        System.out.println("                                      #########    ##");
        System.out.println("                                      # ########  ###");
        System.out.println("                                        #############");
        System.out.println("                                        #############");
        System.out.println("                                         ###########");
        System.out.println("                                          #########");
        System.out.println("                                           #######");
        System.out.println("                                           ## ###");
        System.out.println("                                           #   ##");
        System.out.println("                                           #    #");
        System.out.println("                                          ##   ##");
    }
}
