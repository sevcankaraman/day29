package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //// 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz
        //5,6,7,8,9,10

        int sum=0;

        for (int i = 5; i < 11; i++) {
            sum +=i;

        }
        System.out.println(sum);


        //6 dan 3e kadar tamsayalrın carpımlarını bulan kodu yazınız

        int carp=1;
        for (int i = 6; i >2; i--) {
            carp=carp*i;

        }
        System.out.println(carp);

        //Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int sayi=input.nextInt();
        sayi=Math.abs(sayi);

        int sonuc=0;

        for (int i = sayi; i >0 ; i=i/10) {
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);




    }
}
