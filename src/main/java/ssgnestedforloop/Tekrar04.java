package ssgnestedforloop;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {
     /*Soru 3) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
i
        1
        22
        333
        4444
        55555

        */

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);

            }
        }
            System.out.println();

            Scanner input=new Scanner(System.in);
            System.out.println("bir rakam giriniz");
            int sayi= input.nextInt();

            for (int i = 1; i <= sayi; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);

                }
                System.out.println("");

            }

        }
    }
