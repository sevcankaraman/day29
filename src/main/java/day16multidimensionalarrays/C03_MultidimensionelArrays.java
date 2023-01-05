package day16multidimensionalarrays;

import java.util.Arrays;
public class C03_MultidimensionelArrays {
    public static void main(String[] args) {
        // Soru 1 ) Asagidaki multi dimensional array'in
// tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
// { {1,2,3}, {4,5,6} }

//1.Yol:
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};

        int carpim = 1;
        System.out.println(Arrays.deepToString(arr));
        for (int[] w : arr) {
            for (int s : w) {
                carpim = carpim * s;
            }
        }
        System.out.println(carpim);//720

//2.Yol:
        int carp = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carp *= arr[i][j];
            }
        }
        System.out.println(carp);//720
    }}