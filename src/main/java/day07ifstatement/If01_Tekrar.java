package day07ifstatement;

import java.util.Scanner;

public class If01_Tekrar {
    //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
    //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf=input.next().charAt(0);

        if (harf>='A'&& harf<='Z'){
            System.out.println("büyük harf");
        }else if(harf>='a'&& harf<='z'){
            System.out.println("küçük harf");
        }else{
            System.out.println("harf değil");
        }
    }
}
