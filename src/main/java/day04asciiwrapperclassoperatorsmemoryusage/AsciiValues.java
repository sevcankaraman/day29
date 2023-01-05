package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    //Java da her karakterin sayisal bir degeri vardir.
    //Bu degerler ASCII Deger'ler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.

    public static void main(String[] args) {

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.

        int ch= 'A';
        System.out.println(ch);

        int unlem= '!';
        System.out.println(unlem);

        int c1 ='K';
        int c2='?';

        // java da charları matematiksel işlemlerde kullanırsanız.java o charların ASCII degerlerini kullanır

        System.out.println(c1+c2);

    }
}
