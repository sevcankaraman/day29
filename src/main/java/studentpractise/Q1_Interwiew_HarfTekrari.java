package studentpractise;

import java.util.Scanner;

public class Q1_Interwiew_HarfTekrari {
    public static void main(String[] args) {



    Scanner input=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle=input.nextLine().toLowerCase();

        System.out.println("bir harf girin");
        char harf=input.next().toLowerCase().charAt(0);
        int counter=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf){
                counter++;
            }
        }
        System.out.println("girdiğiniz cumlede " + harf + " harfi "+counter+ " kere kullanılmıstır");
}
}