package day16multidimensionalarrays;

import java.util.Arrays;

public class C03Md_Tekrar {
    public static void main(String[] args) {
        // Soru 1 ) Asagidaki multi dimensional array'in
// tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
// { {1,2,3}, {4,5,6} }

//1.Yol:
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};

       int carpim=1;
        for (int[] w : arr) {
            for (int i : w) {
                carpim=carpim*i;
            }
            System.out.println(carpim);
        }

        //2.yol

        int carp = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carp *= arr[i][j];
            }
        }
        System.out.println(carp);//720
    }}