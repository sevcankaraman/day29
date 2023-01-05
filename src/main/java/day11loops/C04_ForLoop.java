package day11loops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

      /*  //example : 1 den 100 e kadar 6 ile bölünenler hariç tüm tamsayıları ekrana yazdırın

        for (int i = 1; i <101 ; i++) {
            if(i%6==0){
                continue;
            }
            System.out.print(i+" ");

        }
*/

      //methodla çözümü:

       Scanner input = new Scanner(System.in);

        System.out.println("Lütfen baslangic ve bitis degerlerini giriniz...");
        int start = input.nextInt();
        int end = input.nextInt();

        altiyaBolunmeyen(start,end);
    }

    public static void altiyaBolunmeyen(int a, int b) {

        for (int i = a; i < b + 1; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }

        //interwiew sorusu
        // size verilen bir stringi ters ceviren kodu yazınız


        String str="Mustafa";
        String ters="";

        for (int i = str.length()-1 ; i >-1 ; i--) {
            char harf=str.charAt(i);
           // ters=ters+harf;
            ters+=harf; // tercih edilen bu koddur

            System.out.println(ters);// sekilli oldu soutu içine yazınca

        }
        System.out.println(ters);

    }
    }

