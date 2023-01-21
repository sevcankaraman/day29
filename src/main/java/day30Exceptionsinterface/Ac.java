package day30Exceptionsinterface;

public interface Ac {


    //"interface "lerin içine "concrete "method konulamaz.cunku concrete methodlarda body vardır ve body o methodun
    //    işi nasıl yapacagını belirtir.işin nasıl yapılacagı bircok detay içerır ve bu child classlarda kafa karısıklıgına
    //    sebep olur.halbukı sadece yapılması gerekn ısı soyleyıp nasıl yapılacagını chıld class a bırakırsanız
    //    chıld class ın kafa karısıklıgını engellemiş olursunuz.
    //"Inteface "lerdeki tum methodlar otomatik olarak "public" dir,"Abstract"dır,"static" değildir.
    //"Interface" ler concrete method içeremezler,dolayısıyla "interface" ın içindeki hiçbirsey isteğe bağlı değildir,
    //    hersey "child class" lar için mecburidir. Bu yuzden "interface" lere "todo list" de denır

   // interfacelerdeki variableler otomatik olarak "public" tir,"static" dir,"final" dır
   //interface ın içincekı degerler değiştirelemezler.


   void cool();
   void run();

   int price =2000;
   String model ="Mitsubishi";



    //Java çoklu parent yaptığında sadece methodun ne yapılması gerektiğini ister
}
