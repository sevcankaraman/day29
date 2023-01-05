package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru5_IfStatment {

    //kullanıcıdan sayı alınız ve sayının tek mi çift mi oldugunu belirten kodu yazınız

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double sayi1=scan.nextDouble();

        if(sayi1%2==0  ){
            System.out.println("çift sayıdır");
        }else if(sayi1%2!=0) {
            System.out.println("tek sayıdır");
        }else{
            System.out.println("gecersiz sayi");
        }






    }





}
