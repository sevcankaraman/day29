package ssgnestedforloop;

public class Tekrar05 {
    public static void main(String[] args) {
        // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int a=6;

        for (int i = 1;  i <=a ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (int i = 1;  i <=a ; i++) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }




        }
    }

