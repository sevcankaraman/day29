package kendimce_Pratik;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int uzunluk= scan.nextInt();

        int arr8[]=new int[uzunluk];

        System.out.println("girilen array elemanları:" + uzunluk);
        for (int i = 0; i <uzunluk ; i++) {
            arr8[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(arr8));//[5, 6, 7, 1, 9]

        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));//[1, 5, 6, 7, 9]

        int buyukVeKucuk=arr8[arr8.length-1]-arr8[0];
        System.out.println("en buyuk ve en kucuk deger arasındaki fark =" + buyukVeKucuk);//en buyuk ve en kucuk deger arasındaki fark8





    }


}

