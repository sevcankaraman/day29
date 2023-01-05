package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru3_IfStatement {
    public static void main(String[] args) {
        /*
        öğrenciden notu alınıaz
        not 0-20 arasındaysa kötü not
        20-40 arasındaysa zayıf not
        40-60 arasındaysa orta not
        60-85 arası iyi not
        85-100 arası çok iyi not

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not = input.nextDouble();
        if (not<0){
            System.out.println("geçersiz deger");

        }else if (not>0 && not<21){
            System.out.println("kötü not");


        } else if (not<41) {
            System.out.println("zayıf not");

        } else if (not<61) {
            System.out.println("orta not");

        } else if (not<86) {
            System.out.println("iyi not");

        } else if (not<101) {
            System.out.println("çok iyi not");

        }else{
            System.out.println("geçerli bir not aralığı giriniz");

        }


    }
}