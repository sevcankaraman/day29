package day16multidimensionalarrays;

import java.util.Arrays;

public class C02Md_Tekrar {
    public static void main(String[] args) {

        //example : //Bir tane integer multidimensional array olusturunuz
        ////Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{3, 2, 2}, {8, 1}};
        int sum = 0;
        for (int[] w : arr) {
            for (int i : w) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        //Multidimensional Array'i tek katli Array'e cevirme

        int brr[][]={{1,2,3},{4,5,6},{7,8}};
        int toplam=0;

        for (int[] w : brr) {
            System.out.println(Arrays.deepToString(brr));
            toplam=toplam+w.length;
        }
        System.out.println(toplam);//8
        int idx=0;
        int crr[]=new int[toplam];

        for (int[] w : brr) {
            for (int i : w) {
              crr[idx]=i;
              idx++;
            }

        }
        System.out.println(Arrays.toString(crr));
    }


}