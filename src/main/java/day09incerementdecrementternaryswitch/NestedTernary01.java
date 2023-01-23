package day09incerementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //intervıew sorusu

        //example1 : verilen yılın "artık(leap year)" yıl olup olmadıgını kontrol eden kodu yazınız
        //1)yıl 100 e bolunurse 400 e de bolunmelidir
        //2)yıl 100 e bolunmuyorsa 4 e bolunmelıdır

        int yil=2023;
       String sonuc= yil%100==0 ? (yil%400==0 ? "Artik Yil" : "Artik Yil Değil"):(yil%4==0 ? "Artik Yil":"Artik yil değil");
        System.out.println(sonuc);





    }
}
