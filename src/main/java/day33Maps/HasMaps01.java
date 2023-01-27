package day33Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMaps01 {
    public static void main(String[] args) {

        /*
  1)  1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
  2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
  3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
  4) "Map'"lerde depoladıgınız her bır data ya "Entry" denır "Eleman" denmez
  5) "Entry"ler "unique"dir çünkü key kısımları "unique" oldugundan herbir "Entry" diğerlerinden farklıdır
  6) "HasMap" cok hızlıdır cunku "HashMap'"ler sıralama ile ugrasmazlar.
  7) "HashMapler"de bir tane key i null yapabılırsınız
  8) "HashMapler"de bırden fazla "value" yı "null" yapabılırsınız.
  9) "HashMap"ler "multi thread" için kullanılmaz ve "synchronization" yoktur.


         sozluk yapisi map'a benzer
solda kelime, sagda aciklamasi vardir
soldakiler tekrarli olamaz sagda tekrar olabilir
map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir
de olmayapilir repeatedly (tekrarli) olabilir
cat = evcil hayvan
dog = evcil hayvan
crocodile = timsah
tiger = kaplan
solda data sagda data
map deyince sozluk akla gelsin
sola unique lere key tekrarli olabilen sagdaki data lara value denir

map te bir data stractir dir
depolarken bu yapiya ihtiyac varsa map kullaniriz
mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique
 sag tekrarli olabilir burda map kullaniriz
mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz
 sol unique sa[ tekrarli olabilir burda map kullanilmalidir
         */


/*
1) Map'ler "USA =400,000,000" seklinde data depolamak gerektiginde kullanilir
2)"USA =400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve "key" ler "unique"  dir
3)"USA =400,000,000 datasinin "400,000,000"  kismi "value" olarak adlandirilir ve "value"lar tekrarli olabilir
4)Map'lerde depoladiginiz her bir depoya "Entry" denir eleman denmez.
5)"Entry"ler "unique" dir cunku key kisimlari unique oldugundan her bir entry digerlerinden farklidir.
6)"Hashmap"ler cok hizlidir cunku "HashMap'ler" "entry"leri siralama ile ugrasmazlar
7)"HashMap"ler de bir tane "key"i "null" yapabilirsiniz.
8) "HashMap"lerde birden fazla value yi "null" yapabilirsiniz.
9)HashMap'ler "multi Thread" icin kullanilamaz. (ayni anda bircok isi yapmak)ve
"synchronization" yoktur bircok isin siraya konmasi
 */
            //HashMap nasil olusturulur
            HashMap<String, Integer> hm = new HashMap<>();// kucuk int kabul etmez, sagdaki yere string ve Integer yazmaya gerek yok
            System.out.println(hm);//{}
            //HashMaplere nasil enry eklenir?
            hm.put("USA", 400000000);
            hm.put("Germany", 83000000);
            hm.put("Albenian", 3000000);
            //Ayni key'i kullanarak yeni bir "entry" eklerseniz var olan "value"u update etmis olursunuz
            hm.put("Albenian", 2800000);//digerinin uzerine yazar ama en son verileni girer
            hm.put(null, 12000000);
            System.out.println(hm);//{null=12000000, USA=400000000, Albenian=2800000, Germany=83000000} random atar
            hm.put(null, 1000000);
            System.out.println(hm);//{null=1000000, USA=400000000, Albenian=2800000, Germany=83000000}
            hm.put("Mynmar", null);
            hm.put("Bhutan", null);
            System.out.println(hm);//{null=1000000, USA=400000000, Bhutan=null, Albenian=2800000, Mynmar=null, Germany=83000000}
            //HashMap"ler sadece "key"leri almak istiyorum
            Set<String> hmKeys = hm.keySet();
            System.out.println("hmKeys = " + hmKeys);//hmKeys = [null, USA, Bhutan, Albenian, Mynmar, Germany]
            //HashMap"ler sadece "value"lari almak istiyorum
            //Example: hm Mapindeki ulkelerin toplam nufusunu bulunuz.
            Collection<Integer> hmValues = hm.values();
            int sum = 0;
            for (Integer w : hmValues) {
                if (w != null) {// null i toplayamayacagi icin hata verir null degilse topla dedik.
                    sum = sum += w;
                }
            }
            System.out.println(sum);
//"HashMap"lerde belirli bir key'in value'sini nasil aliriz?
            Integer usaPopulation = hm.get("USA");
            System.out.println(usaPopulation);//usa nin populationunu verir  400000000)
            hm.replace("Bhutan", 35000000);//replace() methodu varolan bir "key"in value"sini degistirmek icin kullanilir
            System.out.println(hm);//{null=1000000, USA=400000000, Bhutan=35000000, Albenian=2800000, Mynmar=null, Germany=83000000}
            hm.putIfAbsent("USA", 700000000);//yoksa koyar varsa var olana dokunmaz
            hm.putIfAbsent("India", 700000000);
            System.out.println(hm);//{null=1000000, USA=400000000, Bhutan=35000000, Albenian=2800000, Mynmar=null, Germany=83000000, India=700000000}
            //Example: yeni ogretmenin maasi standart ucretten 1000tl fazla, eski ogretmenin maasi standart ucretten 2000tl fazla olsun
            HashMap<String, Integer> salaries = new HashMap<>();
            salaries.put("Ali", 8000);
            salaries.put("Ayse", 5000);
            salaries.put("Veli", 9000);
            salaries.put("Tom", 9900);


//        String teacherName = "Kemal";
//        if (salaries.keySet().contains(teacherName)) {
//            salaries.put(teacherName, 12000);
//        } else {
//            salaries.putIfAbsent(teacherName, 11000);
//        }
//               System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
            String teacherName = "Tom";
            if (salaries.keySet().contains(teacherName)) {
                salaries.put(teacherName, 12000);
            } else {
                salaries.putIfAbsent(teacherName, 11000);
            }
            System.out.println(salaries);//{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}
        }
    }
