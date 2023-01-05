package ssgnestedforloop;

public class Tekrar01 {

    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        System.out.println("nested for loopsuz cozumu");

        for (int i = 1; i <= 6; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            System.out.print("*" + " ");

        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            System.out.print("*" + " ");
        }

        System.out.println();
        System.out.println("------nested loopla  çözüm------");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 7; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
