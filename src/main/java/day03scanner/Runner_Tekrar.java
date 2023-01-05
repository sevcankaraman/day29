package day03scanner;

public class Runner_Tekrar {

    public static void main(String[] args) {

        // object nasıl olusturulur?

         Car01_Tekrar myCar= new Car01_Tekrar();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);

        myCar.hareket();
        myCar.dur();

        Students_Tekrar sevcan= new Students_Tekrar();
        System.out.println(sevcan.isim);
        System.out.println(sevcan.sinif);
        System.out.println(sevcan.adres);

        sevcan.ogrenci();
        sevcan.beslenme();

    }
}
