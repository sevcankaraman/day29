package ssgnestedforloop;

public class NestedLoop01 {
    // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
    /*
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     */

    public static void main(String[] args) {
        System.out.println("1.yol nested loopsuz");
        for (int i = 1; i <=6; i++) {
            System.out.print("*"+" ");

        }
        System.out.println();
        for (int i = 1; i <=6; i++) {
            System.out.print("*"+" ");

        }
        System.out.println();
        for (int i = 1; i <=6; i++) {
            System.out.print("*"+" ");

        }
        System.out.println();
        for (int i = 1; i <=6; i++) {
            System.out.print("*"+" ");

        }
        System.out.println();

        //Nested for looplu

        System.out.println("2.yol nested for looplu");
        for (int i = 1; i <=4; i++) {
            System.out.print("*"+" ");
            for (int j = 1; j <=5 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }

    }

}
