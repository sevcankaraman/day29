package day12loops;

import java.util.Scanner;

public class C03_NestedLoop_BosUcgen {

    public static void main(String[] args) {
        /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5

*/

        for (int i = 1; i <6; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"  ");

            }
            System.out.println();

        }
        System.out.println();

       /*

        Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
 */

        for (int i = 4; i >0; i--) { //satır kontrolu
            for (int j = i; j >0; j--) {//yıldız kontrolu
                System.out.print("* ");//yıldızı yazdırır

            }
            System.out.println();//asagı atar


        }

        //example 3: satır sayısını kullanıcıdan alarak asagıdaki sekli yazdırınız
        //
        //         *
        //        * *
        //       *   *
        //      *     *
        //     * * * * *
        //
        //
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();


        for (int i = 1; i <=row ;  i++) {//satir kontrol
            for (int bosluk = row; bosluk >= i; bosluk--) {// bosluk kontrol
                System.out.print("o");

            }
            for (int yildiz = 1; yildiz <= i; yildiz++) {//* kontrol

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt *
                } else
                    System.out.print("  ");//3. ve 4.satir
            }
            System.out.println();

        }
    }//main
}//class







