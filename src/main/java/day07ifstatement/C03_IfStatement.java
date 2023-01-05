package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        /*
        ıkı tane datanın birbirineesit olup olmadıgınıanlamak için "==" deği; equals()kullnırız.

       i) equals() ==> büuük kucuk harf önemser
       ii)equalsIgnorCase() ==> büyük küçük harf önemsemez.

         */
    //ex) kullanıcıdan gun isimlerini alınız. hafta ici mi hafta sonumu oldugunu yazdıran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir gun ismi giriniz : ");
        String gunismi= input.next();

        if (gunismi.equalsIgnoreCase("cumartesi") || gunismi.equalsIgnoreCase("pazar")){
            System.out.println("haftasonu");
        }else if (gunismi.equalsIgnoreCase("pazartesi")||
                gunismi.equalsIgnoreCase("sali")||
                gunismi.equalsIgnoreCase("carsamba")||
                gunismi.equalsIgnoreCase("persembe")||
                gunismi.equalsIgnoreCase("cuma")){
            System.out.println("haftaiçi");
        }else {
            System.out.println("gecerli bir gün giriniz");
        }//else body

        //2.yol
        boolean haftaici = gunismi.equalsIgnoreCase("Pazartesi") ||
                gunismi.equalsIgnoreCase("Sali") ||
                gunismi.equalsIgnoreCase("Carsamba") ||
                gunismi.equalsIgnoreCase("Persembe") ||
                gunismi.equalsIgnoreCase("Cuma");

        boolean haftasonu = gunismi.equalsIgnoreCase("Cumartesi") ||
                gunismi.equalsIgnoreCase("Pazar");

        if(haftaici){
            System.out.println("Hafta ici");
        }else if(haftasonu){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

            }//main
}//class

