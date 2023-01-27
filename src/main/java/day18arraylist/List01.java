package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //Example 1: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Bu elemanlardan 12'yi siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);


        //Note: Siz Java'da tamsayi yazdiginizda, Java o tamsayinin data type'ini otomatik olarak "primitive int" kabul eder.
        //      Bu yuzden remove() method'unun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
        //      Tamsayi'yi eleman olarak gostermenin birkac yolu vardir.


        //1.yol :
        //Integer nonPrimitive=12;// yenı bır variable olusturdum.
        //ages.remove(nonPrimitive);

        //2.yol: recommend ==>tavsiye edilen
        //ages.remove((Integer)12);

        //3.yol:
        //ages.remove(Integer.valueOf(12));// 2 method kullanıldı

        //4.Yol:
        //ages.remove(ages.indexOf(12));// 2 method kullanıldı .indexof her zaman ılk görünümün indexini veriri
        System.out.println("ages = " + ages);

        //Example 2: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Tum 12'leri siliniz.
        //
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        System.out.println("nums = " + nums);

        List<Integer>silinecekler=new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);
        nums.removeAll(silinecekler);
        System.out.println("nums = " + nums);

        //removeAll() method'u List ile calisir.
        //removeAll() method'u bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir.

    }
}
