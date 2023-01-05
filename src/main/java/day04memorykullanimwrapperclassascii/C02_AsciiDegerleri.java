package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {

    /* ASCII= standart kodlama sıstemi uluslararası kabul görmus degerlerdir.
    klavyemizde kullandıgımız harf ve sembollerın matematikselkarsılıgı char
    data turunde işleme alınırsa o cahr degerin ASCII tabke dakı karsılıgını
    işleme alır.
    Harf ve sembollere deger atar.
    Karakterlerin cebirsel karsılıgını bulmak icin ortaya cıkmıstır.
    Çünkü bilgisayarda hersey 1010001 den olusur. Bu yapıya cevirebilmek
    için ASCII table olusturulmustur.
    Büyük harflerin ASCII degeri küçük harflerini ascii degerinden daha küçüktür
     */

    public static void main(String[] args) {

        // Bir tam sayı ile birharfi toplayınız

        int deger =20;
        char harf = 'a';

        // 1. yol

        int sum= deger + harf;
        System.out.println("bir tamsayı ile harfin toplamı="+sum);

        //2.yol
        System.out.println("2.yol toplam="+(deger+harf));
        
        
        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2='2';
        System.out.println("rakam2="+rakam2);

        char rakam3='3';
        System.out.println("rakam3="+rakam3);
        char rakam4 ='4';
        System.out.println("rakam4="+ rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 ASCII toplam="+(rakam1+rakam2+rakam3+rakam4));

        char kh='a';
        char bh='A';
        System.out.println("a nin ascii degeri="+(kh+0));//97
        System.out.println("A nın ascii degeri="+(bh+0));//65

        System.out.println("kh > bh==>"+ (kh>bh));//true karsılastırma işlemlerinin sonucu true yada false döner

        //herhangi bi karkterin ASCII degerini hesaplatalım

        //1.yol

        char space=' ';
        System.out.println("space in ascii degeri="+(space+0));//32

        //2.yol
        int hrf='m';


        //char data typelerinda java karaktere int deger de atanabilir. cünkü char data typelerin bir resimdegeri
        // bir de ascii den gelen int degeri vardır. bu sekilde ascii degerini bulabilirz.

        System.out.println("int harfin ascii degeri="+hrf);//109

        ///ASCII DEGERLERİNDEN YARARLANARAK KARRŞILASTIRMA YAPABİLİRİZ/

        byte b= 125;
        float f= 2.45648f;
        long l=5466788L;
        char ch= 'h';

        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(b<ch);//false
    }
}
