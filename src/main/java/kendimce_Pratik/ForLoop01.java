package kendimce_Pratik;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

     //kullanıcıdan bir string isteyin ve tersten yazdırın(interwiev sorusu)

            Scanner scanner = new Scanner(System.in);
            System.out.print("BİR YAZI GİRİNİZ: ");
            String input = scanner.nextLine();

            for (int i = input.length()-1; i>=0; i--) {
                System.out.print(input.charAt(i));
            }





    }
}


