package day06stringmanipulationsifstatement;

public class Interview_Sorusu {

    public static void main(String[] args) {

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //               "abbccdd" ==> b-> tekrarsiz a-> tekrarsiz  seklinde



        String t = "aabcde";

        char ch1 = t.charAt(0);

        if (t.indexOf(ch1) == t.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = t.charAt(1);
        if (t.indexOf(ch2) == t.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = t.charAt(2);
        if (t.indexOf(ch3) == t.lastIndexOf(ch3)) {
            System.out.println(ch3);
        }


    }


}
