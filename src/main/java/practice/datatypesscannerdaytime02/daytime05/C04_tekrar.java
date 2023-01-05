package practice.datatypesscannerdaytime02.daytime05;

import java.util.Arrays;
import java.util.Scanner;

public class C04_tekrar {
    public static void main(String[] args) {
         /*
            INTERWIEW QUESTIONS
            Kullanicidan bir String aliniz.
            String'de var olan her character'in sayisini ekrana yazdiriniz.
            Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                   abaa   ==> a=3  b=1
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str= scan.next();

        String arr[] =str.split("");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter=0;

        for (int i = 1; i <arr.length ;  i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni olanlar icin 1 artir

            }else{
                System.out.println(arr[i-1]+" karakterının sayısı "+(counter+1)+" kez tekrarlanmıstır");
                counter=0;
            }
            if (i== arr.length-1){
                System.out.println(arr[i]+" karakterının sayısı "+counter+1+" kez tekrarlanmıstır");
            }

        }
    }
}
