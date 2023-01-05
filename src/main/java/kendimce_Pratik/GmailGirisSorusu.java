package kendimce_Pratik;

import java.util.Scanner;

public class GmailGirisSorusu {
    public static void main(String[] args) {
        		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen email adresinizi giriniz");
        String email= input.next();

        if (!email.contains("@")){
            System.out.println("gecerli bir email girin");
        }else if(email.endsWith("@gmail.com")){
            System.out.println("email onaylandı");
        } else if (email.contains("@") && !email.endsWith("@gmail.com")){
            System.out.println("lütfen gmail hesabınızı girin");

        }
    }
}
