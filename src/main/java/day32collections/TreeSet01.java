package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one =System.nanoTime();

        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        System.out.println(ts);//[3, 8, 12, 25, 32]
        long two=System.nanoTime();

        HashSet<Integer> hs =new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet <Integer> hts=new TreeSet<>(hs);

        System.out.println(hts);//Random(rastgele)

        long three=System.nanoTime();
        System.out.println("TreeSet in uygulama süresi:" +(two-one) );
        System.out.println("HashSet in uygulama süresi:" +(three-two) );

        //Note : "TreeSet" eleman eklemede cook yavastır."HashSet" ise cook hızlıdır
        //       "TreeSet" in bu negatif yönunden kurtulmak ıcın "HashSet" olusturur elemanları ekler ve sonra" HashSet" i
        //        "TreeSet" e ceviririz.

        int first =ts.first();
        System.out.println(first);//3

        int last =ts.last();
        System.out.println(last);//32

        int floor=ts.floor(15);
        System.out.println(floor);//12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

        //floor methodunda kullanabılcegınız sayı en kucuk elemandan az olamaz.
        int floor2=ts.floor(12);
        System.out.println(floor2);//12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi

       int ceiling1= ts.ceiling(15);
        System.out.println(ceiling1);//25==>15 elemanlardan biri değil o yuzden 15 den bir sonrakı eleman yazdırıldı

        //ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz
        int ceiling2= ts.ceiling(15);
        System.out.println(ceiling2);//25==> elemanlardan biri o yuzden direkt yazdırıldı

        SortedSet<Integer>tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>12 elemanlardan biri o yuzden 12 ve sonraki elemanlar bir Set icinde yazdirildi

        SortedSet<Integer>tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil o yuzden 15 den  sonraki elemanlar bir Set icinde yazdirildi

        NavigableSet<Integer> tailset3=ts.tailSet(12,false);
        System.out.println(tailset3);//[25,32]==> 12 elemanlardan biri normalde 12 ve sonrakı elemanlar
        // bır set ıcınde yazdırılırdı ama ıkıncı parametrede false kullandıgım ıcın 12 harıc tutuldu

        SortedSet<Integer>headSet1=ts.headSet(12);
        System.out.println(headSet1);//[3, 8]==>12 elemanlardan biri önceki elemanlar bir set içinde yazdırıldı 12 yazdırılmadı.

        SortedSet<Integer>headSet2=ts.headSet(12,true);
        System.out.println(headSet2);//[3, 8, 12]

        Integer higher1=ts.higher(12);
        System.out.println(higher1);//25 12 den bır sonrakı elemanı verır

        //generic method : normal methodlar parametrelerde belirtilen data tipleriyle calısırlar.
        //                 generic methodlar ise verilen her turlu data type ile çalısma becerisine sahiptirle
       // public E higher(E e) {
            //return m.higherKey(e);

        Integer lower1 =ts.lower(12);
        System.out.println(lower1);//8 ==>12 den bir onceki elemanı verir










    }
}
