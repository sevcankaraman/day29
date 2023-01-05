package day18arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Tekrar {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);

        System.out.println("nums = " + nums);

        boolean a = nums.isEmpty();
        System.out.println("a = " + a);

        List<Integer> ages = new ArrayList<>();
        boolean b = ages.isEmpty();
        System.out.println("b = " + b);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz
        //nums = [37, 38, 39, 40, 41, 42]

        List<Integer> nums1 = new ArrayList<>();

        nums1.add(37);
        nums1.add(38);
        nums1.add(39);
        nums1.add(40);
        nums1.add(41);
        nums1.add(42);

        System.out.println("nums1 = " + nums1);

        for (Integer w : nums1) {
            if (w % 2 != 0) {
                nums1.set(nums1.lastIndexOf(w), w + 11);
            }
        }
        System.out.println("nums1 = " + nums1);

        nums1.add(52);
        nums1.add(36);
        nums1.add(52);

        //Example :nums  ArrayList inden 52 elemanın ilk görünümünü siliniz
        // ilk görünümü demek ilk indeksi demektir.

        System.out.println("nums1 = " + nums1);

        Integer sayi = 52;
        nums1.remove(sayi);
        System.out.println("nums1 = " + nums1);

        //Bir gup datayı silmek için :::

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);

        List<String> names1 = new ArrayList<>();
        names1.add("Thomas");
        names1.add("Tahsin");
        names1.add("Trump");
        System.out.println("names1 = " + names1);
        names.removeAll(names1);
        System.out.println("names = " + names);

        //Example: a Listesindeki shoes elemaninin ilk gorunumunu siliniz

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("Laptop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");
        System.out.println("c = " + c);//c = [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        c.remove("Shoes");
        System.out.println("c = " + c);

        //example myNames listesinin içinde burcu,can,gul varmı?

        List<String> myNames = new ArrayList<>();

        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zişan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gül");
        System.out.println("myNames = " + myNames);

        List<String> myNames1 = new ArrayList<>();
        myNames1.add("Can");
        myNames1.add("Zişan");
        myNames1.add("Emre");
        myNames1.add("Bilal");

        boolean m = myNames1.containsAll(myNames);
        System.out.println("m = " + m);

        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]



    }
}
        
        
        
        
        
        
        
        
        
        
        
