package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        bir Array ın içindeki data yine bir Array ise buna multidimensional Array denir
         */

        // Multidimensional arrayler nasıl olusturulur?

        int arr [][]=new int [3][2];// Auter Array  3

        //inner Array =2 olan bir multidimensional array oluşturduk.
        //bu yöntemle inner arrayler sabıt olmak zorunda

        System.out.println(Arrays.toString(arr));// [[I@799f7e29, [I@4b85612c, [I@277050dc]
        //içindeki data non primitive data oldugu için adresleri görürüm.

        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[2]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));// MULTIDIMENSIONAL ARRAYLER BU SEKILDE YAZDIRILIR.
        //[[0, 0], [0, 0], [0, 0]]

        //Arraylere eleman eklemenın ıkıncı yöntemı ile
        //hem declare edip hemde değer atama yöntemi

        int arr2 [][]={{2,3},{9},{78,6,4,5}};
        System.out.println("hem declare hem de değer ataması ile"+Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("hem declare hem de değer ataması ile 2. indek"+Arrays.toString(arr2[2]));
        System.out.println("hem declare hem de değer ataması ile 0. index"+Arrays.toString(arr2[0]));
        System.out.println("hem declare hem de değer ataması ile 1. index"+Arrays.toString(arr2[1]));

        //Multidimesional Arraylere eleman nasıl eklenır?

        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6,18]
        System.out.println(arr[1][0]);//6

        //String bir multidimensional array oluşturun
        //içerisine dataları ekleyın
        //toplam eleman sayısını ekrana yazdırın

        String brr[][]=new String[3][2];
        brr[0][0]="a"; // kat 1 daire 1
        brr[0][1]="b"; // kat 1 daire 2

        brr[1][0]="c";// kat 2 daire 1
        brr[1][1]="d";// kat 2 daire 2

        brr[2][0]="e";// kat 3 daire 1
        brr[2][1]="f";// kat 3 daire 2

        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f]]

        int sum=0; //topplam kac daire oldugu bilgisi

        for (String[] w : brr) { // tasklerde w =each (her bir ) olarak da görulur w=Array
            sum=sum+w.length;
        }//for
        System.out.println(sum);//6





    }
}
