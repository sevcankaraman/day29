package day03scanner;

import java.util.Scanner;

public class Scanner03_Grup {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin

      Scanner scan=new Scanner(System.in);
        System.out.println("ÇİFT veya TEK’i kontrol etmek için bir tamsayı girin:");

        int sayi= scan.nextInt();

        if(sayi%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }


















    }
}
