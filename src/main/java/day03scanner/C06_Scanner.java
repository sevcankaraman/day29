package day03scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz seki ile asagidaki gibi bir gorsel olusturunuz
   /*
          A
         A A
        A A A
 */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        System.out.println("\t\t"+ch+"\t\t");
        System.out.println("\t"+ch+"\t\t"+ch+"\t");
        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);



    }
}
