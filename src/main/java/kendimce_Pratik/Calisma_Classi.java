package kendimce_Pratik;

import java.util.Scanner;

public class Calisma_Classi {

    public static void main(String[] args) {

        String isim= "sevcan";
        String soyisim="karaman";
        System.out.println("isminiz:"+isim+" "+"\nsoyisminiz:"+soyisim);

        int sayi1=5;
        int sayi2=6;
        int toplam=sayi1+sayi2;


        System.out.println("birinci sayi="+sayi1+" "+"\nikinci sayi="+sayi2);
        System.out.println("toplam="+(sayi1+sayi2));

        int s1=10;
        double s2=2.0;
        double top=s1+s2;

        System.out.println("toplam="+(s1+s2));

        char harf='s';
        System.out.println("harf="+harf);

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        double sayi=scanner.nextDouble();
        System.out.println(sayi*sayi);







    }
}
