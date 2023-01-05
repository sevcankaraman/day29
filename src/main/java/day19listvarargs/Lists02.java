package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {

        /*
    Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */

        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        System.out.println("databaseIsim = " + databaseIsim);
        //databaseIsim = [AYSE, AHMET, SERDAR, OKAN, BETUL]

        Scanner input=new Scanner(System.in);
        System.out.println(" lütfen kullanıcı adınızı giriniz...");
        String username= input.nextLine().toUpperCase().trim();

        //1.yol:
        //int random= (int)(Math.random()*100);

        //2.yol:
        int random=new Random().nextInt(100);

        while (databaseIsim.contains(username+random)); // boyle de olur
               random=(int)(Math.random()*100);


        if (databaseIsim.contains(username)){
            System.out.println("bu username database de var ,tekrar kullanılmaz");
            databaseIsim.add(username+(int)(Math.random()*100));


        }else {
            System.out.println("bu username kullanılabılır");
            databaseIsim.add(username);
        }
        System.out.println(databaseIsim);
    }
}
