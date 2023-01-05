package kendimce_Pratik;

import java.util.Scanner;

public class SwitchAlistirma4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen günü giriniz...");
        String gun=input.next();

        switch (gun.toLowerCase()){
            case "pazartesi":
                System.out.println("Hafta İçi");
                break;
            case "sali":
                System.out.println("Hafta İçi");
                break;
            case "carsamba":
                System.out.println("Hafta İçi");
                break;
            case "persembe":
                System.out.println("Hafta İçi");
                break;
            case "cuma":
                System.out.println("Hafta İçi");
                break;
            case "cumartesi":
                System.out.println("Hafta Sonu");
                break;
            case "pazar":
                System.out.println("Hafta Sonu");
                break;

            default:
                System.out.println("gecerli bir giriş yapınız");
        }
    }
}
