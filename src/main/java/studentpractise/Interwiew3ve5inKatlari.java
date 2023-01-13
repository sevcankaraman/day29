package studentpractise;

import java.util.Scanner;

public class Interwiew3ve5inKatlari {
    public static void main(String[] args) {
        //  Q04_Interview_3Ve5Katlari
        /*

 Interview Question
      Kullanicidan 100’den kucuk bir tamsayi isteyin.
      1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
      - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
      - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.

 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i% 3 == 0 && i % 5 == 0) {
                System.out.println( " ** Java Guzeldir ** ");

            } else if (i % 3 == 0) {
                System.out.println( " Java");

            } else if (i % 5 == 0) {
                System.out.println(" Guzeldir");

            } else
                System.out.println(i+"");

        }

    }

}