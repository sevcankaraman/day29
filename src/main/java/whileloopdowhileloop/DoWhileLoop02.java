package whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
     //kullanıcıdan bir tamsayı alınız tam sayı 100 den kucuk ıse kullanıcıya "kaybettınız"
        // mesajı vererek oyunu sonlandırınız . tam sayı 100 ve 100 den buyuk ıse
        // "kazandınız" mesajı vererek oyuna devam ettiriniz

        /*
       scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
        (kirmizi renk olur)
       dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while'da hata verir
       */

        Scanner input = new Scanner(System.in);
        int num=0;


        do {
            System.out.println("Bir sayı giriniz");
            num=input.nextInt();

            if (num>=100){
                System.out.println("kazandınız");
            }

        }while(num>=100);
        System.out.println("kaybettınız ");
    }
}
