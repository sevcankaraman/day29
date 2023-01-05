package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01_SoruBankasi {

    public static void main(String[] args) {

        // Soru 1:Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum = 0;
        for (Integer w : myList) {
            sum = sum + w;
        }
        System.out.println("sum = " + sum);

        //Soru 2:Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(12);
        myList1.add(31);
        myList1.add(7);
        myList1.add(13);
        myList1.add(10);

        int toplam = 0;

        for (Integer w : myList1) {
            if (w == 13) {
                break;
            }
            toplam = toplam + w;
        }
        System.out.println("toplam = " + toplam);

        //Soru3:Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz

        //1.yol:

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(10);

        int carp = 1;

        for (Integer w : myList2) {
            if (w % 2 != 0) {
                continue;
            }
            carp = carp * w;
        }
        System.out.println("carp = " + carp);

        //2.yol:
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(12);
        myList3.add(31);
        myList3.add(7);
        myList3.add(13);
        myList3.add(10);

        int carp1 = 1;
        for (Integer w : myList3) {
            if (w % 2 == 0) {
                carp1 = carp1 * w;
            }
        }
        System.out.println("carp1 =" + carp1);

        //Soru 4:Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.(PEK ANLAMADIM BIR DAHA BAKABILRSIN**)
        //Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        // (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır.

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();

        f.addAll(e);
        Collections.sort(f);

        System.out.println(e);
        System.out.println(f);

        int size = e.size();
        int flag = 0;

        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i))) {
                flag++;
            }
        }
        if (flag == size) {
            System.out.println("Azalan siradadir");
        } else {
            System.out.println("Azalan sirada degil");
        }

        //soru5:Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        //      Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43

        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        System.out.println("g = " + g);

        if (g.contains(15)) {
            for (Integer w : g) {
                if (w == 15) {
                    int idx = g.indexOf(15);
                    g.set(idx, 51);
                }

            }
            System.out.println("g = " + g);
        } else {
            System.out.println("liste 15 elemanı içermıyor");
        }

        // SORU 6: Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        System.out.println("h =" + h);
        if (!h.contains(15) && !h.contains(13)) {
            System.out.println("liste 13ve 15 içermıyor");
        } else {
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i) == 15) {
                    int idx1 = h.indexOf(15);
                    h.remove(idx1);
                    i--;
                }
                if (h.get(i) == 13) {
                    int idx2 = h.indexOf(13);
                    h.remove(idx2);
                    i--;
                }
            }
            System.out.println("h =" + h);
        }

        // SORU 7 : Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> s = new ArrayList<>();
        s.add(12);
        s.add(31);
        s.add(15);
        s.add(13);
        s.add(54);

        Collections.sort(s);
        int minDeger = s.get(2) - s.get(1);
        for (int i = 1; i < s.size(); i++) {
            minDeger = Math.min(minDeger, s.get(i) - s.get(i - 1));
        }
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i) - s.get(i - 1) == minDeger) {
                System.out.println(s.get(i) + " and " + s.get(i - 1));
            }
        }

        //soru 8:Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //       Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer>p= new ArrayList<>();
        p.add(12);
        p.add(31);
        p.add(7);
        p.add(13);
        p.add(10);
        System.out.println("p = " + p);

        for (Integer w: p) {
            if (w==7 || w==10){
               continue;
            }
            p.set(p.indexOf(w),w+2);
        }
        System.out.println("p = " + p);

        //soru 9: String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList0 = new ArrayList<>();
        myList0.add("$12.99");
        myList0.add("$23.60");
        myList0.add("$54.45");
        double sum1=0;
        for (String w : myList0) {

            Double urun=Double.valueOf(w.replace("$",""));
            sum1=sum1+urun;
        }
        System.out.println(sum1);

        //soru 10 :Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.7

        // soru hatalı olabılır

        //Soru 11: Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        //olup olmadığını kontrol ediniz

        List<Integer> myList6 = new ArrayList<>();
        myList6.add(10);
        myList6.add(31);
        myList6.add(15);
        myList6.add(7);
        myList6.add(15);
        myList6.add(23);
        int counter=0;
        for (Integer w : myList6) {
            for (Integer x : myList6) {
                if (w==x){
                    counter++;
                }
            }

        }
        if(counter==myList6.size()){
            System.out.println("tekrarlanan öğe yoktur");
        }else{
            System.out.println("en az bır tane tekrarlanan öğe vardır");
        }

        //soru 12 : mountain array sorusu yasın hocayla cözüldü
    }
}