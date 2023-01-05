package day03scanner;

import java.util.Scanner;

public class Scanner02_Grup {
    public static void main(String[] args) {
        // Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
        //Ali Mert Can
        //kkno:12345678

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen adınızı giriniz");
        String ad= input.next();


        System.out.println("lutfen ıkıncı ısmınızı giriniz");
        String ikinciIsim= input.next();

        System.out.println("lutfen soyad giriniz");
        String soyad= input.next();


        System.out.println("lutfen kimlik kartınızı  giriniz");
        int kkno= input.nextInt();

        System.out.println(ad+" "+ikinciIsim+" "+soyad+" ");
        System.out.println("kkno"+kkno);




    }
}
