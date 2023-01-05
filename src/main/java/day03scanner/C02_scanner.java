package day03scanner;

import java.util.Scanner;

public class C02_scanner {

    // scanner class ı kullanıcı ile etkileşim kurmamızı sağlar
    //Scannebir Class tır. Java util kütüphanesinden getirildiği için import ister

    public static void main(String[] args) {

        // kullanıcıdan data almak için
        // 1. adım : Scanner Class ından Object oluşturun

        Scanner input = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);

        // 2. adım : kullanıcıya ne yapacağını söyleriz

        System.out.println("lütfen yasınızı girin");

        //3.adım  :kullanıcıdan aldığınız datayı variabke içine koyun

        byte age = input.nextByte();

        // örnek : kullanıcıya ad,memlekt,yas,boy,
        // yasadığı yeri sevip sevmediğini soran bir program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kullanıcı ismini girin");
        String isim = scan.nextLine(); // kullanıcıdan String bir değer istedik. tüm satırı alması için nextline sectik
        System.out.println("lütfen memleketinizi girin");
        String memleket = scan.nextLine();
        System.out.println("lütfen yaşınızı girin");
        int yas = scan.nextInt();
        System.out.println("lütfen boyunuzu girin");
        short boy = scan.nextShort();
        System.out.println("lütfen yasadığınız yeri sevip sevmediğinizi yazınız");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("isim="+ isim);
        System.out.println("memleket="+ memleket);
        System.out.println("yas="+ yas);
        System.out.println("boy="+ boy);
        System.out.println("seviyorMu=" + seviyorMu);
    }

}
