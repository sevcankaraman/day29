package day09incerementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

       // example1
        int a =10;
        int b=20;
        int r1=a<b ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        // example 2:
       // verilen bir sayının mutlak degerini hesaplayan kodu yazınız
        //          -4==>-1*-4   4==>4 0==>0

        int c=-4;
        int r2=c<0 ? -1*c : c;
        System.out.println(r2);

        // 2 sayının işareti aynı ise bu sayıları carpan
        //işsretleri farklı ise "farklı işaretli sayıları carpamıyurum"mesajı veren kodu yazınız

        int m=5;
        int n=-6;

        // object java da butun Non Primitive  data tiplerinin ortak parrent(baba) sı dır.
        //object ın parrent ı yoktur.
        //farkli data typlari iiçin ortak bir variabkeolusturmak istediğimizde data type olarak
        // object kullanablirsiniz.
        //java da object insanlık aleminde hz adem e benzer

        Object r3=(m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı işaretli sayıları carpmıyorum";
        System.out.println(r3);

        //example 4: size verilen sayının uc basamaklı olup olmadıgını kontrol eden kodu yazınız.

        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -436;

        int r = Math.abs(p);

        String r4 = r>99 && r<1000 ? p + " uc basmaklidir" : p + " uc basmakli degildir";
        System.out.println(r4);





    }
}
