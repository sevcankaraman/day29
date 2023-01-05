package day16multidimesionalarrays;

public class Star {
    public static void main(String[] args) {
         /*
            Asagidaki sekli cizen kodu yaziniz
                                *
                               * *
                              *   *
                             *     *
                            * * * * *
         */

        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = i; j < row; j++) {
                System.out.print(" ");

            }
            for (int m = 1; m <= 2 * i - 1; m++) {

                if (i == row || m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}