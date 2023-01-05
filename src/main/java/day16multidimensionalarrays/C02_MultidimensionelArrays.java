package day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionelArrays {
    //example : //Bir tane integer multidimensional array olusturunuz
    ////Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
    public static void main(String[] args) {

        int arr[][] = {{2, 5, 1}, {32, 75}};
        int sum=0;
        System.out.println(Arrays.deepToString(arr));// [[2, 5, 1], [32, 75]]

        for (int[] w : arr) {// [[2, 5, 1], [32, 75]]
            for (int k : w) { // k artık array degıl arrayın ıcındekı ınteger deger
                sum=sum+k;

            }//each loop

        }// auter loop
        System.out.println(sum);//115

         //Multidimensional Array'i tek katli Array'e cevirme
        /*
        1)Once multidimensional array'in eleman sayisini bulun
        2)Yeni bir array almaliyim.
        Yeni olusturdugum bu arrayin buyuklugu; ilk multidimensional arrayin eleman sayisina
        esit buyuklukte olmali
         */

        int brr[][]={  {2,5,1} ,   {32,75}   };// 3+2 = 5 daire
        int toplam=0;

        for (int[] w : brr) { // brr multidimesionel arrayın içerisinden her bır w arrayını al
            System.out.println(Arrays.deepToString(brr));

                toplam=toplam+w.length;

            }
        System.out.println(toplam);// 5 ==> burada yenı oluşturacagımız arrayın buyuklugunu belırledık
        int idx=0;
        int crr[]=new int [toplam];
        for (int [] w : brr) {
            for (int k : w) {//w arrayinin icindeki her bir k degerini getir
                //yeni crr arrayinin icine idx'e gore yerlestir
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));//[2, 5, 1, 32, 75]
    }
}