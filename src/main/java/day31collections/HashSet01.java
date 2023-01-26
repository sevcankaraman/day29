package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        //hash bır teknıktır bız bu teknıgı kullanarak unıq datalar uretırız.
        //datalar tekrarlı olabılır ama hash kodlar tekrarlı olamaz


        //"arraylıstler"de tekrar tekrar eleman koaybılırz
        //"lınkedlıst"te de tekrarlı eleman koyabılırım
        //"set "lerde  tekrarlı eleman koyamayız.


        /*
       1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
       2)"Set" tekrarsiz data depolamak icin kullanilam bir Collection'dir.
       3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
        "Set" ler 3'e ayrilir;
             i)HashSet: a) Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                           yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                        b) HashSetler tekrarlı elemana musade etmezler.
                        c) HashSetler sadece bir tane "null" ı eleman olarak kabul ederler.
             ii)LinkedHashSet: a) LinkedHashSet elemanları "insertion order"(veri girme sırası) a göre dizer.
                               b) LinkedHashSet elemanları sıralamakta zaman kaybettiği için ,"HashSet" e göre yavastır

             iii)TreeSet: a) TreeSet elemanları ""naturel order "(küçükten büyüğe veya alfebetik sıra) a göre dızer
                          b) TreeSet "naturel order" yaparken cok zaman harcar o yüzden en yavas "Set"tir.
                          c) TreeSet ler tekrarlı elemana musade etmezler


 */
        HashSet<Integer>hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78]==> gördüğünüz gibi elelamnlar rastgele sıralandı.
       int hc= hs.hashCode();
        System.out.println(hc);




    }
}
