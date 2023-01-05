package mentorgrupcalismasi;

import java.util.Scanner;

public class IfSorusu {
    public static void main(String[] args) {
        /* Kullanıcıdan bir sayi alin,
            i) Sayı 1 ve 100 arasinda olmalıdır...
           ii) Bu sayı tek ise "tuhaf" yazdirin...
          iii) Sayı çift ve 2 ile 5 arasinda ise "tuhaf degil" yazdirin...
           iv) Sayı çift ve 6 ile 20 arasinda ise "tuhaf" yazdirin...
            v) Sayı çift ve 20'den büyükse "tuhaf degil" yazdirin...

        */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=input.nextInt();

        if(sayi>=1 && sayi<=100){

        }else if(sayi%2!=0) {
            System.out.println("tuhaf");
        }
    }
}
