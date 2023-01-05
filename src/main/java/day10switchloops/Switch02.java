package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //example:kullanıcıdan ıkı sayı ve yapılacak işlemi alan ve +,-,/,* işlemlerini yapan kodu yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz...");
        double a= scan.nextDouble();
        double b= scan.nextDouble();

        System.out.println("yapılacak işlemi giriniz...");
        char opr=scan.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '%':
                System.out.println(a+"%"+b+"="+(a*b/100));
                break;
            default:
                System.out.println("bu işlem tanımlanmamıstır");


        }


    }
}
