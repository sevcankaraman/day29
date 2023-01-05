package whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin
        // carpim tablosunu olusturup console'a yazdiran kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("carpım tablusunu görmek ıcın bir sayı giriniz");
        int num= input.nextInt();

        int i=1;

        while(i<11){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }

        // verilen bir stringte her harfin sonrasına * sembolu ekleyınız
        // Java ==> J*a*v*a

        System.out.println("bir kelime giriniz");
        String word=input.next();
        String newWord="";

        int k=0;

        while (k<word.length()) {
            newWord=newWord+word.charAt(k)+"*";


            k++;
        }
        System.out.println(newWord);


    }
}
