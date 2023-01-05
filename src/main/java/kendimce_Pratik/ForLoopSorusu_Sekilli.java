package kendimce_Pratik;

public class ForLoopSorusu_Sekilli {
    public static void main(String[] args) {
        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        int i, k;
        int sembol = 1;

        for (k = 0; k < 9; k++) {
            for (i = 0; i < sembol; i++) {
                System.out.print(" * ");
            }
            System.out.println("");
            sembol++;
        }
        for (k = 0; k < 10; k++) {
            for (i = 0; i < sembol; i++) {
                System.out.print(" * ");
            }
            System.out.println("");
            sembol--;
        }
        for (k = 20; k < 1; k++) {
            for (int bosluk = k; bosluk >= k; bosluk++) {// bosluk kontrol
                System.out.print("o");
                for (i = 20; i < sembol; i--) {
                    System.out.print(" * ");
                }
                System.out.println("");
                sembol++;
            }
        }
    }
}