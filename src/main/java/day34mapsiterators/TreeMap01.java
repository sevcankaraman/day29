package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*

    1) TreeMap entry leri "key" lere göre "naturel order" a koyar
    2) TreeMap coook yavastır. Çunku" naturel order" yapmak cook zaman ıster.
    3) TreeMap "thread-safe" ve "synchronized" değildir.
    4) TreeMap'lerin "key "lerinde "null" kullanılamaz.Ama value larda istediğiniz kadar kullanabılırsınız

     */
    public static void main(String[] args) {

        long one =System.nanoTime();

        TreeMap<String,Integer> stdAges = new TreeMap<>();
        stdAges.put("Ali",21);
        stdAges.put("Kemal",19);
        stdAges.put("Ayşe",25);
        stdAges.put("Murat",22);

        // "key"lere göre alfebetik sıra yaptı
        System.out.println(stdAges);

        long two=System.nanoTime();

        HashMap<String,Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali",21);
        stdAges2.put("Kemal",19);
        stdAges2.put("Ayşe",25);
        stdAges2.put("Murat",22);

        System.out.println(stdAges2);

        long three = System.nanoTime();

        HashMap<String,Integer> stdAges3 = new HashMap<>();
        stdAges3.put("Ali",21);
        stdAges3.put("Kemal",19);
        stdAges3.put("Ayşe",25);
        stdAges3.put("Murat",22);

        TreeMap<String, Integer> stdAges4=new TreeMap<>(stdAges3);
        System.out.println(stdAges4);
        long four = System.nanoTime();

        System.out.println("treemap : "+ (two-one));
        System.out.println("hashmap : "+ (three-two));
        System.out.println( "hasmap -->treemap : " + (four-three));

    }
}
