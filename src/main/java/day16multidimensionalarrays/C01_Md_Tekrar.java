package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_Md_Tekrar {
    public static void main(String[] args) {

        // Multidimensional arrayler nasıl olusturulur?
        int arr[][]=new int[3][2];
        System.out.println(Arrays.toString(arr));//[[I@799f7e29, [I@4b85612c, [I@277050dc]
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        int arr2 [][]={{2,3},{9},{78,6,4,5}};
        System.out.println(Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println(Arrays.toString(arr2[2]));//[78, 6, 4, 5]
        System.out.println(Arrays.toString(arr2[0]));//[2, 3]
        System.out.println(Arrays.toString(arr2[1]));//[9]

        //String bir multidimensional array oluşturun
        //içerisine dataları ekleyın
        //toplam eleman sayısını ekrana yazdırın

        String brr[][]=new String[3][2];
        brr[0][0]="a";
        brr[0][1]="b";

        brr[1][0]="c";
        brr[1][1]="d";


        brr[2][0]="e";
        brr[2][1]="f";

        System.out.println(Arrays.deepToString(brr));

        //toplam kac eleman oldugu bilgisi

        int toplam=0;
        for (String[] w : brr) {
            toplam=toplam+w.length;
        }
        System.out.println(toplam);

    }
}
