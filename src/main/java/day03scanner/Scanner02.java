package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz");
        String firstName = input.next();

        System.out.println("soy isminizi girin");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);

    }
}

