package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {
        //bir ögretmenin okulundakı ögrencilerin isimlerini
        // applıcationa yuklemesini saglayan kodu yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("kac öğrenci ismi gireceksiniz");
        int numOfStd=input.nextInt();

        String names[]=new String[numOfStd];
        System.out.println("cıkmak istiyorsanız lutfen Q harfine basınız");

        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("lutfen" + i + ".öğrencinin ismini giriniz");
            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")) {
            break;
        }
            names[i-1]=stdName;
            System.out.println(Arrays.toString(names));
        }
    }
}
