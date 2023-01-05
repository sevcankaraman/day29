package day05typecastinstringmanipulations;

public class StringManipulation_SoruBankasi {
    public static void main(String[] args) {

        //1.soru:

        String sehir="kocaeli";
        String a=sehir.toUpperCase();
        a=a.substring(0,1).toUpperCase()+a.substring(1);
        System.out.println(a);

        //2.soru:

       String isim1="ali can";
       String isim2="aliye canan";
       String isim3="aliye can cananov";

       int c1=isim1.replaceAll("\\s","").length();
       int c2=isim2.replaceAll("\\s","").length();
       int c3=isim3.replaceAll("\\s","").length();

        System.out.println("toplam="+(c1+c2+c3));

        //3.soru:

       // String="Miami 33018" ise konsolda 10 yazdırın

        String s ="Miami 33018";
        int karaktersayisi=s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("toplam"+karaktersayisi);

        //4.soru:

        String g="2a3B4?-!...";
        int rakamolmayankarakterler=g.replaceAll("[0-9]","").length();
        System.out.println(rakamolmayankarakterler);

        //5.soru:

        String q= "Miami    ";
        int boslukolmayan=q.trim().length()-1;
        String sonHarf=q.substring(boslukolmayan,boslukolmayan+1);
        System.out.println(sonHarf);

        //6.soru:

        String w="Sevcan";
        int sonIndex=w.length()-1;
        int ilkAscii=w.charAt(0);
        int sonAscii=w.charAt(sonIndex);
        System.out.println("toplam="+(ilkAscii+sonAscii));

        //7.soru

       String c= "sevcan";
       String ilkKarakterHaric=c.substring(1);
        System.out.println(ilkKarakterHaric);

        //8.soru:

        String m="sevcan";
        int sonKarakter=m.length()-1;
        String sonKarakterDisindakiler=m.toUpperCase().substring(0,sonKarakter);
        System.out.println(sonKarakterDisindakiler);

        //9.soru

        String j= "java";
        int sonKarakterIndex=j.length()-1;
        String sonchDisindakiler=j.substring(1,sonKarakterIndex).toUpperCase();
        System.out.println(sonchDisindakiler);

        //10.soru
        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.

              Örnek:‘Ali Can’ için konsolda false yazmalıdır.
                    ‘ Ali Can ’ için konsolda false yazmalıdır.
                    ‘ Ali Can ’ için konsolda false yazmalıdır.
                    ‘Ali Can’ için konsolda true yazmalıdır.
         */

        String z="sevcan karaman";
        String trimli=z.trim();
        String hicBoslukYok=trimli.replaceAll("\\s","");
        Boolean boslukVarmi=trimli.length()-hicBoslukYok.length()==1;
        System.out.println("ortada tek boşluk var "+boslukVarmi);

        //11.soru Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.

        String d= " sevcan ";
        String trimlenmis=d.trim();
        boolean sonuc=d.equals(trimlenmis);
        System.out.println("basında ve sonunda boşluk var mı "+ !sonuc);

        //12.soru Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        //yazınız























    }
}
