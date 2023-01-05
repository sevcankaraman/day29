package day07ifstatement;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

         /* kullanıcıdan yas degerini alan ve yasın hangi evrede oldugunu
         asagıdaki tabloya göre yazdıran kodu olusturunuz

         note: if else de sıralama onemlidir


   0-4==> bebek
   5-12==> cocuk
   13-20==> genc
   21-30==> yetişkin
   tanımlanmamış evre
   hata mesajı olarak "gecerli bir yas giriniz" yazdırınız
*/
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas= input.nextInt();

        if (yas<0){
            System.out.println("geçerli bir yaş giriniz");
        }else if(yas<5){
            System.out.println("bebek");
        } else if (yas<13){
            System.out.println("cocuk");

        } else if (yas<21) {
            System.out.println("genc");

        } else if (yas<31) {
            System.out.println("yetişkin");

        }else {
            System.out.println("tanımlanmamış yaş...");
        }
    }
}
