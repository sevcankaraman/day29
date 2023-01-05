package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru7_IfStatement {
    public static void main(String[] args) {


     /*
        Asagıdaki seçenekler dogrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Subat için "Kıs"
b) Mart, Nisan, Mayıs için "Ilkbahar"
c) Haziran, Temmuz, Agustos için "Yaz"
d) Eylül, Ek!m, Kasım için "Sonbahar"
e) Digerleri için "Geçersiz ay adı"
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay adi giriniz,,,");
        String ay = input.next();

        if (ay.equalsIgnoreCase("aralik ") || ay.equalsIgnoreCase("ocak") || ay.equalsIgnoreCase("subat")) {
            System.out.println("Kis");
        } else if (ay.equalsIgnoreCase("mart") || ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("mayis")) {
            System.out.println("Ilkbahar ");
        } else if (ay.equalsIgnoreCase("Haziran") || ay.equalsIgnoreCase("Temmuz") || ay.equalsIgnoreCase("Agustos")) {
            System.out.println("Yaz");
        } else if (ay.equalsIgnoreCase("Eylul") || ay.equalsIgnoreCase("Ekim") || ay.equalsIgnoreCase("Kasim")) {
            System.out.println("Kis");
        } else {
            System.out.println("Gecersiz ay...");
        }


    }


}
