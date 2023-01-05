package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //bir stringdeki sesli harflerin sayısını bulan kodu yazınız.
        // a-e-ı-o-u-A-E-I-O-U

        String str="Java ogrenince para kazanmak ne kolay, ogrenmeyince ne kadar zor.";
        str=str.toLowerCase();
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));

        int counter=0;
        //iter== for each loop

        for (String w : harfler) {
            switch (w){
                case "a":
                case "e":
                case "ı":
                case "o":
                case "u":
                    counter ++;

            }

        }//for each
        System.out.println(counter);
    }

}
