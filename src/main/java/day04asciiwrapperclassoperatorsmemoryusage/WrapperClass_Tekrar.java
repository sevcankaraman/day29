package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass_Tekrar {
    public static void main(String[] args) {

      //example:short data type ının minimum ve maxsimum değerlerinikod yazarak bulunuz

        short max=Short.MAX_VALUE;
        short min=Short.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        //example:int data type'inin minimum degeri ile byte data type'inin
        // maximum degerinin toplamini bulunuz.

        int intMin=Integer.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;

        System.out.println(intMin+byteMax);

        // example : i) primitive int i Wrapper Integer a ceviriniz(Autoboxing)

        int num=22;
        Integer wrapperNum=num;
        System.out.println(wrapperNum);

       // ii)Wrapper Byte ı primitive byte a ceviriniz(Unboxing)

        Byte k=43;
        byte primitiveK=k;
        System.out.println(primitiveK);

         // example 4 :i)primitive char i Wrapper Character a ceviriniz(Autoboxing)
        //            ii)Wrapper Boolean ı primitive boolena  a ceviriniz(Unboxing)

        char harf='a';
        Character wrapperHarf=harf;
        System.out.println(wrapperHarf);

        Boolean yasliMı=false;
        boolean primitiveBoolean=yasliMı ;
        System.out.println(primitiveBoolean);

        //example= size string olan verilen ıkı fiyatın toplamını ekrana yazdırın

        String shirt = "2300";
        String shoes= "5200";

        // java da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi olur.
        //java da "+" sembolu ıkı string arasında veya bir string ve bir sayı arasında kullanılırsa
        // "cancatenation işlemi" olur."concatenion işlemi" birleştirme yapar.
        // Note : Concatenation işlemlerinde java matematikteki işlem önceliği kurallarını kullanır.
        //işlem önceliği kuralları:
         //  1)önce uslu sayılar
        //    2) parantez içi işlemler
        //    3) carpma ve bölme
        //    4) toplama ve cıkarma

        System.out.println(shirt+shoes);//23005200
        int toplamFiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //example :size string olarak verilen iki fiyatın toplamını ekrana yazdırınız
        //note : eger valueOf() methodu kullanılırken Stringin içine rakam olmayan bir karakter koyarsanız hata alırsınız.
        //bu hatayı duzeltmeyi daha sonra öğreneceğiz


        String tv = "11000";
        String radio= "3000";

        System.out.println(tv+radio);

        int totalprice=Integer.valueOf(tv)+Integer.valueOf(radio);


        String str1="Java";
        String str2= "Guzel";
        int sayi1= 5;
        int sayi2= 4;

        System.out.println(str1+str2+sayi1+sayi2);
        System.out.println(str1+sayi1+str2);
        System.out.println(str1+ (sayi1+sayi2)+sayi2);
        System.out.println(str1+(sayi1-sayi2)+(sayi1+sayi2));


        System.out.println(""+sayi1+sayi2+str2);// 54Güzel

        //












        }


    }

