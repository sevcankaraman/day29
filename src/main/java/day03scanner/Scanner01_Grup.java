package day03scanner;

import java.util.Scanner;

public class Scanner01_Grup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen uzunlugu girin");
        double length = input.nextDouble();
        System.out.println("lütfen genişliği girin");
        double weight = input.nextDouble();
        System.out.println("lütfen yuksekliği girin");
        double height = input.nextDouble();

        System.out.println("dikdörtgenin hacmi" + length * weight * height);
        System.out.println("dikdörtgenin hacmi" + length * weight * height);




        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

    }
        public static double DikdortgenHacmi(double length, double weight, double height) {
        return length*weight*height;
    }






}