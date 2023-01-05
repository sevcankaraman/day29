package kendimce_Pratik;

import java.util.Scanner;

public class SwitcAlistirma2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("10,100,1000 giriniz...");
        int sayi=input.nextInt();

        switch(sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;

            default:
                    System.out.println("girdiğiniz sayiyi degistirin");


        }
    }
}
