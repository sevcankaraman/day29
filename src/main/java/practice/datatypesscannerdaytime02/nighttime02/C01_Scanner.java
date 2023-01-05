package practice.datatypesscannerdaytime02.nighttime02;

import java.util.Scanner;

public class C01_Scanner {

    /*

TechProEd spor salonu icin isim; soyisim; yas;
kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
olarak toplam ucreti yazdiriniz

 */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("techpro spor salonuna giriniz..");
        System.out.println("lütfen isminizi giriniz..");
        String isim= input.nextLine();

        System.out.println("lütfen yasınızı girin");
        Byte yas= input.nextByte();

        System.out.println("lütfen kilonuzu girin");
        double kilo= input.nextDouble();

        System.out.println("lütfen boyunuzu giriniz");
        double boy=input.nextDouble();

        int aylikucret=20;
        System.out.println("aylik ücret="+aylikucret);

        System.out.println("lütfen kac ay devam edeceğininizi giriniz");
        int ay= input.nextInt();
        int toplam_tutar=aylikucret*ay;

        System.out.println("toplam_tutar+\"$\" = " + toplam_tutar+"$");

        System.out.println("isim"+isim+"\nyas"+yas+"\nkilo"+kilo+"\nboy"+boy+"\ntoplam_tutar"+toplam_tutar+"$");
        


    }


}
