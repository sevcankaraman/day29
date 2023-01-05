package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("kısa kenar");
        int kisa=input.nextInt();

        System.out.println("uzun kenar");
        int uzun=input.nextInt();

        if (kisa==uzun){
            System.out.println("bu bir karedir");
        }else{
            System.out.println("bu bir dikdortgendir");
        }


    }
}