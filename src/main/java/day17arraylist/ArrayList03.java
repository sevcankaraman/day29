package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        System.out.println(cities);

        //remove() methodu index ile kullanılırsa o index teki elemanı siler
        // remove() methodu index ile kullanılırsa size sildiği elemanı verir.
        // remove(index)-->sildigi elemanı döndürür

        String n=cities.remove(1);
        System.out.println(n);
        System.out.println(cities);

        //remove() methodu eleman ile kullanılırsa ılk görünümü siler.
        // remove() methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade edebn true veya false verir.
        //Eğer eleman listte yok ise o elemanı silemediğinden size false verir.
        // Remove(o:) methodu eleman ile kullanılırsa ilk görünümü siler.
        // remove(eleman ismi)-->true false döner

        boolean p= cities.remove("Kayseri");
        System.out.println(cities);
    }
}
