package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*
           example 1 :asagıdaki kurallara göre kullanıcın girdiği passwordu kontrol ediniz.
                      i) en az 8 karakter olsun
                      ii) space karakteri password de olmasın
                      iii) en az bir tane büyük harf olsun
                      iiii) en az bir tane küçük harfe olsun
                      iiiii) en az bir tane sembol olsun
                      iiiiii) en az bir tane rakam olsun

         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen passwordunuzu girin...");
        String pwd = input.nextLine();

        //1) En az 8 karakter olsun
           boolean first = pwd.length()>7;
           System.out.println(first);
        //ii) space karakteri password de olmasın
        boolean second=!pwd.contains(" ");
        System.out.println(second);

        //iii) en az bir tane büyük harf olsun
        // Note : Büyük olmayanları sil,
        //         kalan karakter sayısına bak
        //         karakter sayısısıfır ise buyuk harf yok demektir
        //         sıfırdan büyükse buyuk harf var demektir

        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);
        // note : methodları aynı satırda yan yana kullanmaya "method chain" denir

        boolean fourth=pwd.replaceAll("[^a-z)]","").length()>0;
        System.out.println(fourth);

        // iiiii) en az bir tane sembol olsun

        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);//Ac123Sde

        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("password gecerli mi?"+(first && second && third && fourth && fifth && sixth));

    }
}
