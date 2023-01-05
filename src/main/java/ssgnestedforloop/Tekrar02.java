package ssgnestedforloop;

public class Tekrar02 {
    public static void main(String[] args) {
        /*
        1)  Asagidaki sekil cizen kodu yaziniz
                . . . .1
                . . . 2
                . . 3
                . 4
        */

        for (int i = 1; i <6 ; i++) {

            for (int j = i; j <5 ; j++) {// nokta
                System.out.print(".");
            }
            for (int j = i; j < i+1; j++) {
                System.out.print(i);
            }
            System.out.println();




        }
        System.out.println();


        }
    }
