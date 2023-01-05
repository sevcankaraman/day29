package ssgnestedforloop;

public class NestedForLoop02 {
    public static void main(String[] args) {
        /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz
                . . . .1
                . . . 2
                . . 3
                . 4
                5
                -1*i+5
                */
/*
        for (int i = 1; i <6 ; i++) {

            for (int j = i; j <5 ; j++) {// nokta
                System.out.print(".");
            }
            for (int j = i; j < i+1; j++) {
                System.out.print(i);
            }
            System.out.println();

 */
        System.out.println();

        for (int line = 1; line <=5 ; line++) {
            for (int j = 1; j <= (-1*line+5) ; j++) {
                System.out.print("."+ " ");
            }
            System.out.println(line);
        }

    }
}