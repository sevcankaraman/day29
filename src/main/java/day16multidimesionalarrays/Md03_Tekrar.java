package day16multidimesionalarrays;

import java.util.Arrays;

public class Md03_Tekrar {
    public static void main(String[] args) {
        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int a[][] = { {2, 62, 82}, {3, 13} };

        int toplam=0;

        for (int[] w : a) {
            for (int i : w) {
                toplam=toplam+i;

            }

            }
        System.out.println(toplam);//2.62.82.3.13
        }

    }

