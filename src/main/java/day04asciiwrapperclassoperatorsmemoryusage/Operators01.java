package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    public static void main(String[] args) {
        /*
        1) +, -,*,/ işlemleri java da matematik te kullanıldıgı gibi kullanılır.
        note : int/int ==> int olur
        note: double/int ==> double olur. cunku javada matemetiksel işlemlerde farklı data tipleri kullanılırsa sonuc buyuk data type ında olur.

        2) java da "logical operator" (mantık operatörleri) vardır
        AND ve OR işlemleri "logical operator" lardır.
            i)AND(&&) işleminden true alabilmek için her sey true olmalı
              AND işlemi perfectionisttir.mukemmeliyetçidir
              AND işleminde bir tane false sonucu false yapar

          ii) OR (||)işleminde bir tane true sonucu true yapmaya yeter
              OR işleminde sonucun false olması için hersey false olmalıdır.
              OR işlemi polyanna dır.

               iii) NOT Operatoru(!) true olani false, false olani true yapar.
                 !true = false
                 !false = true
                 !!true = true

         3)Comparison(Karsilastirma) Operators
                <, >, <=, >=, ==, !=
           Note: Karsilastirma operatorlerini kullandiginizda kesinlike boolean(true veya false) alirsiniz.

        Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
              Farklari nedir?
              "&&" kullanim ilk ifade "false" oldugunda digerle rini kontrol etmez dolayisiyla hizli calisir.
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
              Bu yuzden biz hep "&&" kullaniriz.


         */

        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;

        System.out.println(first + "-" + second+"-"+ third);
        System.out.println(first&&second);
        System.out.println(first||second||third);

    }
}
