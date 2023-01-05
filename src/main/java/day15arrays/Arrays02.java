package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a  - e - i - o - u - A - E - I - O - U
        // 1.yol
        String s="java brings you money";
        int  vowels=s.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println(vowels);

        //2.yol
        String letters []=s.split("");
        System.out.println(Arrays.toString(letters));
        int counter=0;
        for (String w:letters){
            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);

    }
}
