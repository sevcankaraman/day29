package kendimce_Pratik;

import java.util.Scanner;

public class SwitchAlistirma3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String harf=input.next();

        switch (harf.toUpperCase()){
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("gecerli bir harf giriniz");

        }


    }

}
