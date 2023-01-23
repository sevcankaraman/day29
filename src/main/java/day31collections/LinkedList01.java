package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
   /*
 1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
 2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
 3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
 sonra kullanilamaz.
 4)class --> class ==> extends
   class --> interface ==> implements
   interface --> interface ==> extends
   interface --> class ==> Bu mumkun degildir
 5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
 yapilacaksa ArrayList kullanmak tavsiye edilmez.
 6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
 leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
 durumlarda LinkList kullanmak tavsiye edilir.
 7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
 8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
 bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.


     */


    public static void main(String[] args) {

        List<String> cityNames=new LinkedList<>(); // bu sekılde de olusturulur


        LinkedList <String> names=new LinkedList<>();
        names.add("ali");
        names.add("eslem");
        names.add("can");
        names.add("han");
        names.add("ayse");

        names.addFirst("sevcan");
        System.out.println(names);

        names.addLast("eslem");//addLast() "method is equivalent to "add()".==> add metoduyla aynı
        System.out.println(names);

        names.add(3,"sevcankaraman");//sen burda index kullandıgını zannedıyorsun ama arkada oyle salısmıyor.aslında 3.node dan soraya koyuya
        System.out.println(names);

        names.remove("eslem");// soldan saga gider ilkni siler ve loopu kırar
        System.out.println(names);

        names.remove(4);
        System.out.println(names);

        names.add("sevcan");
        System.out.println(names);

        String r1=names.remove();//Retrieves and removes the head (first element) of this list.//ilk elemanı siler
        System.out.println(r1);
        System.out.println(names);

        names.removeFirstOccurrence("can");//ilk görünümünü siler
        System.out.println(names);

        names.removeLastOccurrence("ayse");//son görünümünü siler
        System.out.println(names);

        //getlast() ilk elemanı getirir.

        //ilk elemanı silmeden size verir =peek
        //remove ilk elemanı siler ve size verir

        // remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez

        String r2=names.peek();
        System.out.println(r2);
        System.out.println(names);


        //remove() boş lınklistte kullanılırsa "hata verır ".poll() boş linl listte kullsnılırsa "null" verir
        names.poll();

        names.pop();

        //


















    }
}
