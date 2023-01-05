package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    // 10<sayı   Mantık Operatötü sayı<20;
    // == esittit içi == kullanılır= tek esittir atama (asiggment )yapar
    /*
    java uclu karsılastırmayı kabul etmez.
    ıkılı karsılastırmalar yapıp mantık operatörleriyle birleştirmeliyiz.

    &&==ve and  operatörü ||or operatörü veya demek

    &&  ve mukemmleiyetcidir

    cay ve limon
    +  &&   +    = true
    +  &&   -    = false
    -  &&   +    =false
    -  &&   -    = false

    && ile &

    && de boolean sonucta bir tane false bulunca kodun calışması durur.
    & de ise tüm saturu tarar sonra durur.
    bu da && nin & den daha hızlı caalışmasını saglar.



    || veya operarötöru polyannacıdır. en ufak bir poztiflikten true döner

    cay veya  limon
    +     ||   +    = true
    +     ||   -    = true
    -     ||   +    = true
    -     ||   -    = false



     */
    public static void main(String[] args) {

        System.out.println(5+2== 8);//false

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2 !=8;
        System.out.println(sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3== 9 && 5+2==7;
        System.out.println(sonuc2);//false

        int sayi1=15;
        System.out.println(10< sayi1 && sayi1< 20);//true

        int sayi2= 5;
        System.out.println(sayi2<10||sayi2>20);//true
    }



}
