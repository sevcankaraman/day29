package ssgnestedforloop;

public class NestedLoop03 {
    public static void main(String[] args) {
        /*
​
        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
​
         *
         * *
         * * *
         * * * *
         * * * * *
​
​
         =========
         *******
         *******
         *******
         *******
            // nested for loop ya diktorgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

         */

        int input =6;

        for (int i = 1; i <input ; i++) { // dis loop == outer loop
            for (int j = 1; j <=input ; j++) {
                System.out.print("*" + " ");
            }// ic loop== inner
            System.out.println("");
        }
/*
        System.out.println("=======");

        int input1 =6;

        for (int i = 1; i <input1 ; i++) { // dis loop == outer loop
            for (int j = 1; j <=input1 ; j++) {
                System.out.print("*" + " ");
            }// ic loop== inner
            System.out.println("");
        }


 */

    }
}
