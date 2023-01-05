package day06stringmanipulationsifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Alistirmalar {

    public static void main(String[] args) {

        String isim= "TechProeDucatIon guzel";

        System.out.println(isim.charAt(3));
        System.out.println(isim.toUpperCase());
        System.out.println(isim.toLowerCase());
        System.out.println(isim.length());

        char ilkHarf=isim.charAt(0);
        System.out.println(ilkHarf);

        char bastanikinci=isim.charAt(2);
        char sondanikinci=isim.charAt(14);
        System.out.println(" "+bastanikinci+" "+sondanikinci);

        int karakterS=isim.length();
        System.out.println(karakterS);

        String ilkDort=isim.substring(0,4);
        System.out.println(ilkDort);

        String pro=isim.substring(4,7);
        System.out.println(""+pro);

        String education=isim.substring(7,16);
        System.out.println(education);

        String s=isim.substring(4);
        System.out.println(s);

        System.out.println(isim.contains("a"));
        System.out.println(isim.contains("x"));
        System.out.println(isim.contains("Tech"));

        boolean a=isim.contains("e");
        System.out.println(a);

        boolean b=isim.startsWith("Tech");
        System.out.println(b);

        boolean d=isim.startsWith("r",5);
        System.out.println(d);

        boolean f=isim.endsWith("a");
        System.out.println(f);

        System.out.println(isim.endsWith("n"));

        String c=isim.replace("a","x");
        System.out.println(c);

        System.out.println(isim.replace("e","1"));

        String g=isim.replace("guzel","beatiful");
        System.out.println(g);

        String h=isim.replace("e","");
        System.out.println(h);

        String t= "Ali 13 yasindadir...!";

        String t1=t.replaceAll("[0-9]","*");
        System.out.println(t1);

        String t2=t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        String t3=t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        String t5=t.replaceAll("[^ ]","+");
        System.out.println(t5);

        String t6=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t6 );

        Scanner input=new Scanner(System.in);
        System.out.println("kısa kenarı giriniz..=");
        int kisaKenar= input.nextInt();














































    }
}
