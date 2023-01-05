package day05typecastinstringmanipulations;

public class TypeCasting01 {

        /* Numeric Primitive data tiplerinin birbibirine dönüştürülmesine "type castıng" denir.
            Numeric data typelar byte-short-int-long-float-double

            note1: kucuk data tiplerini buyuk data tiplerine cevirmeyı java otomatik olarak
                    yapabilir.
                   Bu işleme "AutoWidening" (otomatik genişletme) denir.

            note2: büyük data tiplerini küçük data tiplerine cevirmek riskli bi iştir.
                    java bu rsikli işi otomatik olarak yapmaz. bu işlemi kod yazanlar yapar.
                    bu işleme "ExlicitNorrowing"(acıktan daraltma) denir.
         */
        public static void main(String[] args) {

            // example : byte data tipini int data tipine ceviriniz.

            byte age = 13;
            int ageInt= age;// AutoWidening

            //example2: long data type ını short data type ına ceviriniz

            long weight= 234;
            short weightInt= (short) weight ;

            // int data taype ını float data type ına cevirin

            int population= 700000;
            System.out.println(population);

            float populationFloat = population;
            System.out.println(populationFloat);

          //double data type ını short data type ıma cevirin
            double number=12.934;
            System.out.println(number);

            short numberShort=(short) number;
            System.out.println(numberShort);

        // Dikkat: Dönusum yaptıgınız sayı(260), dönusecegınız data type ının sınırları dısında
            //  ise,,java kullandıgınız sayı ıle "mod" işlemi yapar ve mod işleminin sonucu sizin
            //  yeni degeriniz olur

            short num=260;
            System.out.println(num);

            byte numByte= (byte)num;
            System.out.println(numByte);

            //example:

            short n=1023;
            System.out.println(n);

            byte nByte = (byte) n;
            System.out.println(nByte);




        }

}
