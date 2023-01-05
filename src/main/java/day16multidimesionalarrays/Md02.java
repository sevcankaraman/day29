package day16multidimesionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Toplam eleman sayisini console'a yazdiriniz

        int a[][] = { {13, 213, 4}, {12, 87}, {4, 7, 1, 9}, {99} };

        int sum=0;
        for (int[] w : a) {
            sum=sum+w.length;
        }

        System.out.println(sum);
    }
}
