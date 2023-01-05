package day20passbyvalueoverloading;

public class C06_PassByeValue {

    public static void main(String[] args) {

        // 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan bir method olusturunuz

        int fiyat=100;

        indirimyap25(fiyat);
        System.out.println("main içinde methoddan sonra fiyat :"+ fiyat);//100

        fiyat=indirimYap10(fiyat);
        System.out.println(" main içinde methoddan sonra fiyat = " + fiyat);//90

    }//main

    private static int indirimYap10(int fiyat) {
        fiyat*=0.90;
        return fiyat;
    }


    private static void indirimyap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("yüzde 25 indirimli fiyat = " + fiyat);//75

    }
}
