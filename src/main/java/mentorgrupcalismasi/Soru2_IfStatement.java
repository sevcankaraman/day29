package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru2_IfStatement {

    //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
    //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char ch=input.next().charAt(0);

        if(ch>='A'&& ch<='Z'){
            System.out.println("Büyük Harf");
        } else if (ch>='a'&& ch<='z') {
            System.out.println("Küçük Harf");
        }else{
            System.out.println("harf değil");
        }
    }


}
