package day11loops;

public class C06_Tekrar {
    public static void main(String[] args) {
        /*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....

         */

        for (int i = 1; i < 4; i++) {
            System.out.println("week: "+i);
            for (int j =1; j <4 ; j++) {
                System.out.println("day:  "+j);


            }System.out.println(".......");
        }

    }
}
