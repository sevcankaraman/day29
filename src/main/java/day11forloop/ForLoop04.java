package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        //example 1: 5 den 8 e kadar tam sayıların toplamını veren kodu yazınız.(interwiew sorusu)
       //            5+6+7+8 =26   (önemli)

        int sum=0;

        for (int i = 5; i < 9; i++) {
            sum=sum+i;

        }System.out.println(sum);//26

        //example 2: 7 den 9 e kadar tam sayıların toplamını veren kodu yazınız
        //           7*8*9 ==> 504

        int carp=1;

        for (int i = 7; i < 10; i++) {
            carp=carp*i;

        }System.out.println(carp);


    }
}
