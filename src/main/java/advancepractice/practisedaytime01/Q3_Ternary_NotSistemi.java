package advancepractice.practisedaytime01;

import java.util.Scanner;

public class Q3_Ternary_NotSistemi {
    public static void main(String[] args) {
        /*
   Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)


    */

        Scanner input=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not =input.nextInt();

       String notHarf= not >100 ?
               "0 ile 100 arasında bir sayı giriniz : " : not>89 ?
               "A" : not >79 ?
               "B" : not>69 ?
               "C" : not>59 ?
               "D" : not>49 ?
               "E" : not>-1 ? "F" : "0 ile 100 arası bır not gırınız";
        System.out.println("notHarf  " +notHarf);
    }
}
