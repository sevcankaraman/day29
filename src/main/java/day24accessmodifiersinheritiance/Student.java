package day24accessmodifiersinheritiance;

public class Student {

    /*
   Access Modifier
   1)public     2)protected
   3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)
   yazarsan kizar
   4)private


   Note: Access Modifier'lari birer birer aciklayiniz
         public olanlar her class'dan kullanilabilir
         protected olanlar baska package'lerden kullanilamaz
         ancak baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
         private olanlar sadece olsturulduklari Class icinde kullanilabilirler
   Note: "protected" ile "default" un farkini soyleyiniz.
         protected olanlar baska package'lerden kullanilamaz ancak
         baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
   Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
         public, default kullanilir ama protected ve private kullanilamaz

         1)Access modifier'lar genis'den dara; public > protected > default > private
                2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
                3)Access Modifier'lar ne ise yarar?
                        Variablelara methodlara classlara ulasmayi duzenler.
                4)Kac tane access modifier var ?
                        public > protected > default > private
                        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
                        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
                        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
                        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
                        v) "protected" ile "default"un farki nedir ?
                           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
         */

// public her class dan kullanılabılır
    public String stdName = "Ebubekir Can";

    //protected olanlar baska pacekage dan sadece child class lardan görülür
    protected String adress = "İstanbul";

    //default olanlar baska package den kullanılmazlar iş yeri emaili gibi.

    String email = "asadad@gmail.com";
    //private olanlar sadece olusturuldukları class içinde kullanılabılırler
    private String tcNo = "152849622";
}








