package day18arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {

        //ArrayList nasıl olusturulur?

        List<Integer>nums=new ArrayList<>();

        //2) ArrayListler nasıl yazdırılır?

        System.out.println(nums);// []

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);

        System.out.println("nums = " + nums);//nums = [37, 38, 39, 40, 41, 42]
        
        //3) ArrayList in boş olup olmadıgını nasıl anlarız?
        
        boolean bosmu1=nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1);

        List<Integer>ages=new ArrayList<>();
        boolean bosmu2=ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
       // artirdiktan sonra ekrana yazdiriniz
        //nums = [37, 38, 39, 40, 41, 42]

        for (Integer w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.lastIndexOf(w), w + 11);

            }
        }// for
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 52, 42]
        nums.add(52);
        nums.add(36);
        nums.add(52);

        //4) Listlerden eleman nasıl silinir?

        //Example :nums  ArrayList inden 52 elemanın ilk görünümünü siliniz
        // ilk görünümü demek ilk indeksi demektir.


        System.out.println("nums = " + nums);  //nums = [48, 38, 50, 40, 52, 42, 52, 36, 52]

        // nums.remove(52);   //Hatali Kod
        //System.out.println("nums = " + nums);
        /*

        /*
        remove() methodunun icerisine tamsayi yazarsaniz;
        Java bunu indeks kabul eder.Silinecek eleman olarak algilamaz.
        Tum tamsayilar aksi belirtilmedigi surece primitive int 'tir.
        Primitive Data Type'lari da ArrayLst'lerin elemani olamazlar.
        Primitive Data Type'larini Wrapper class'a cevirmeliyiz
         */
        Integer sayi=52;
        nums.remove(sayi);
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 42, 52, 36, 52]

        
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names);//names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> emekliOlacaklar = new ArrayList<>();

        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");

        names.removeAll(emekliOlacaklar);// topluca sılmek ıstedıklerımız için removeAll() methodunu kullanırız.

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);
        System.out.println("names = " + names);

        //Example: a Listesindeki shoes elemaninin ilk gorunumunu siliniz

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);//a = [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        a.remove("Shoes");
        System.out.println("a = " + a);//a = [TV, Radio, Laptop, Shoes, Book, Shoes]
        
        //5) ArrayListimizde coklu data olup olmadıgını nasıl gösteririz?
        
        //containsAll() ==>True veya false döndurur
        //containsAll() : Bir listin içinde coklu elamanın olup olmadıgını kontrol 
        // eder. hepsi varsa true ; en az bir tanesi yoksa false verir.
        
        //example myNames listesinin içinde burcu,can,gul varmı?

        List<String> myNames = new ArrayList<>();
        
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zişan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gül");
        System.out.println("myNames = " + myNames);//myNames = [Burcu, Can, Zişan, Emre, Bilal, Gül]
        
        List<String>varMi=new ArrayList<>();
        varMi.add("Burcu");
        varMi.add("Gül");
        varMi.add("Can");
        varMi.add("Ebubekir");
        System.out.println("varMi = " + varMi);

        boolean sonuc=myNames.containsAll(varMi);//birden fazla liste için containsAll
        System.out.println("sonuc = " + sonuc);

        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("Atki");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println(c);//[A, K, R, S]

        String urun ="";
        do {
            System.out.println("Lutfen istediginiz urunun  giriniz");
            urun= input.next().substring(0,1);

            if(c.contains(urun)){
                c.set(c.indexOf(urun),"Ayrildi");

            }else if(!urun.equals("Q")){
                c.add(urun);
            }
            System.out.println(c);

        }while (!urun.equals("Q"));//geridön demek// oyunlarda bu kod kalıbı cok kullanılır.
    }
}

