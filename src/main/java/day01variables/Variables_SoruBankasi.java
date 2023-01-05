package day01variables;

import java.util.Scanner;

public class Variables_SoruBankasi {

    //1.soru:

    public static void main(String[] args) {

        double canta=120.99;
        double gozluk=199.99;
        double ceket=555.99;

        System.out.println("toplam= "+(canta+gozluk+ceket));

        //2.soru:

        float x=1234.4567f;
        long y=12345678890009888l;
        int z=34;

        System.out.println("carpim="+(x*y*z));

        //3.soru:

        int anapara=10000,oran=6,yİlDegeri=3;
        int basitFaiz=anapara*oran*yİlDegeri;
        System.out.println("basit faiz degeri="+basitFaiz);

        //4.soru:

        String s="sonuc=";
        long a=123L;
        long b=1234567890L;
        System.out.println(s+(a+b));
        System.out.println(s+(a*b));

        //5.soru:

        boolean d=true;
        boolean e=false;
        System.out.println(d+" "+e);

        //6.soru:

        long kitap=1000000l;
        long defter=1000000l;
        long laptop=1000000l;

        long toplamfiyat=(2*kitap)+(4*defter)+(3*laptop);
        System.out.println("toplam fiyat="+toplamfiyat);

        //7.soru:

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double n1= scan.nextInt();
        double n2=scan.nextInt();
        System.out.println(n1+" "+n2);

        double n3=n1;
        n1=n2;
        n2=n3;
        System.out.println(n1+" "+n2);





















    }
}
