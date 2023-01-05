package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    /*

 1) ArrayList'ler çoklu data depolamak için kullanılır.
 2) ArrayList'ler non- primitive data type'indeki çoklu dataları depolamak için kullanılır.
 List'ler non-primitive data kabul ederler, "Array"ler ise primitive data veya reference kabul ederler.
 3) ArrayList'leri(List) oluştururken içine koyacağınız eleman sayısını başta söylemeye gerek yoktur.
 4) List'ler eleman sayısında "flexible" dırlar ama Array'ler "flexible" değildirler
 5) Madem "Array"ler eleman sayısında flexible değil niçin java arrayleri iptal etmedi?
   i) Eleman sayısı belli olan daataları depolamamk için Arrayler tercih edilir.
   ii)Array'ler cok hızlı calısır
   iii)Arrayler memory de cok az yer kaplar.
  */
    /*
    Array ile ArrayList'in farki nedir?

1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
  soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
  cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
  Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
  Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
  Array kullanma riskini almayin
     */
    public static void main(String[] args) {

        // List nasıl olusturulur?
        ArrayList<Integer>ages=new ArrayList<>();
        System.out.println(ages);

        //Listlere eleman nasıl eklenır?
        //List e eleman eklemek icin add metodunu kullanırız.
        // Add() metodu elemanları sizin verdiğiniz sırada list e ekler.(insertion order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);

        //List e coklu eleman nasıl eklenır? veya list e baska bır lıst nasıl eklenır?
        //Bir List coklu eleman eklemek, o elemanları once bır lıstın ıcıne koymalısınız

        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //toArray() metodu: eleman sayisini degistirmeyecegimizden
        // eminsek array' ye cevirip memory kullnimini azaltabiliriz
        //toClear() medodu: Bir List'teki tum elemanlari siler.

        // Bir Listteki tüm elemanları nasıl sılerım?(clear metodu ile)

        //ages.clear();
        //System.out.println(ages);

        //Bir elemanın list te var olup olmadıgını nasıl kontrol ederiz?(contains)

       boolean r=ages.contains(656);
        System.out.println(r);

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?equals

        ArrayList<String>names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String>names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s=names1.equals(names2);
        System.out.println(s);//false

        //equals() methodu: Bir List'in baska bir List 'le ayni olup olmadigini kontrol eder. Boolean dondurur.
        //iki List'in esit olmasi icin ayni index te ayni eleman olmalidir.

        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer> yas1=new ArrayList<>();
        yas1.add(1);
        yas1.add(2);
        yas1.add(3);
        yas1.add(4);

        ArrayList<Integer>yas2=new ArrayList<>();
        yas2.add(2);
        yas2.add(1);
        yas2.add(3);
        yas2.add(4);

        Collections.sort(yas1);//her ıkı lıst ı bu methodla kucukten buyuge dızdık
        Collections.sort(yas2);

        boolean t=yas1.equals(yas2);
        System.out.println(t);//true





    }

}
