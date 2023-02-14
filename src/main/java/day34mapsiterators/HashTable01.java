package day34mapsiterators;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {
    /*
    1) HashTable "thread-safe" ve "synchronized"dir
    2) HashTable entr'leri rastgele sıralar.
    3) HashTable'lar HashMap'lere göre daha yavastır
    4) HashTable'lar "key"lerde ve "value "lerde "null" kullanılmasına musade etmezler

    Note: i) "multı thread " ve "synchronization" kullanmanız gerekırse ;
         ii) "key"lerde ve "value"lerde "null" kulanmak yasak ıse ; "HashTable" kullanmak gerekır

     */

    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht=new Hashtable<>();

        ht.put(1,2);// 1 in kac bölenı var => 1 ve -1
        ht.put(2,4);// 2 nin kac bölenı var => 1 , -1 , 2 , -2
        ht.put(6,8);// 6 nın kac bölenı var => 1,2,3,6,-1,-2,-3,-6

        System.out.println(ht);


    }
}
