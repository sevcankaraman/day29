package day10switchloops;

import java.util.Scanner;

public class Switch02_Tekrar {
    public static void main(String[] args) {

        //example:kullanıcıdan ıkı sayı ve yapılacak işlemi alan ve +,-,/,* işlemlerini yapan kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();

        System.out.println("yapılacak işlemi giriniz.+,-,/,* dan birini giriniz");
        char islem=input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case '%':
                System.out.println(a+"%"+b+"="+(a*b/100));
                break;
            default:
                System.out.println("bu işlem tanımlanmamıstır");


        }
    }
}
