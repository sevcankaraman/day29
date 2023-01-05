package day11loops;

import java.util.Scanner;

public class C07_Tekrar {
    public static void main(String[] args) {

        /*
        Sor1: Type code to print the following image on the console
              asagıda gördüğünüz sekli konsolda yazdıran kodu olusturunuz


        X X X X X
        X X X X X
        X X X X X

        */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen satır ve sutun bilgisini giriniz");
        int satir=scan.nextInt();
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            String str="";
            for (int j = 1; j <=sutun ; j++) {
                str=str+"X";

            }
            System.out.println(str);

        }
        }

    }

