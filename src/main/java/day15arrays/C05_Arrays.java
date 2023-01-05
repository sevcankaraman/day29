package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {

        // İNTERWIEW SORUSU

        //Arama motorunda "guzel isimler" adlı bir application icin
        // isimleri kucukten buyuge sıralayan kodu yazınız

        String arr[]={"Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Tom", "Ali", "Cin","Cuneyt", "Cem" };
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //String array elemanlarını karakter sayısına göre ve aynı karakter sayısına ise naturel order
        // (alfabetik sıraya göre) tersten buyukten kucuge sıralayınız.

        String brr[]={"Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Tom", "Ali", "Cin","Cuneyt", "Cem" };
        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));

    }
}
