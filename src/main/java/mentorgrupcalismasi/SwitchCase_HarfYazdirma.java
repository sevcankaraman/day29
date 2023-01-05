package mentorgrupcalismasi;

import java.util.Scanner;

public class SwitchCase_HarfYazdirma {

    //Example: Kullanıcıdan SDET kısaltmasındakı harflerden birini yazmasını isteyin.
    /*
    Kullanıcı "S" girerse "Software"
              "D" girerse "Developer"
              "E" girerse "Engineer"
              "T" girerse "In Testing"yazdırın
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String harf= input.next().toUpperCase();

        switch (harf){
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
