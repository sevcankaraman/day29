package day20passbyvalueoverloading;

public class C01_PassByValue {

    /*
    Pass By Value : Method a Value'nın bır kopyasını gönder demektir.
    Bu nedenle Pass by Valuda orjinal parametre değişmez.


    Java Pass By Value kullanır.
    1) Java variable'nin orjinal değerini korumak ister.
    2)Java variable'nin içindeki değeri kopyalar ve methodun içine kopya değeri gönderirir.
     Değer üzerinde yapılan değişiklikler orjinal parametreyi etkılemez

     Pass By Referance da ise referans kopyalanır ve method kullanılır.
     Yapılan değişiklilk orjınal parametreyi etkiler
     Bu tarz programlar değeri korumak istiyorsa isi developer a bırakmıstır.
     kendısı degeri değiştirir.
     */

    public static void main(String[] args) {


        int gomlek=100;
        System.out.println("gomlek = " + gomlek);//gomlek = 100
        ogrenciIndirimi(gomlek);
        System.out.println("gomlek = " + gomlek);//gomlek = 100

    }

    private static void ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrencıGomlegi = " + ogrenciGomlegi);//ogrencıGomlegi = 90
    }//ogrenci method
}