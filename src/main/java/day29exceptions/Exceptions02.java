package day29exceptions;

public class Exceptions02 {

    /*    ............ INTERVIEWDE SORULMUS...............

   "throw" ile "throws" keyword'leri arasindaki fark nedir?
1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
  "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
  "throws" dan sonra sadece Exception Class ismi yazilir
4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.



     */
    public static void main(String[] args)  throws IllegalArgumentException{
        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            //her zaman try cathc ı applıcatıon donmasın dıye yaparız
        }
       // try {
        //    getMark(-900);
       // }catch (IllegalArgumentException e){
        //    System.out.println(e.getMessage());
     //   }

        getMark(-90);
    }
    //"throw" keyword bir methodun body sı ıcınde ıstedıgımız yerde ıstedıgımız kosullar,
    // istediğimiz kadar exceptıon atmamızı saglar
    //"throw" keywor yazıldıktan sonra bır exceptıon class objectı olusturulur
    //Exceptıon Class constructor ının parantezı ıcıne ıstedıgınız Exceptıon mesajını yazabılırsınız

    // IllegalArgumentException
    //bellı sartlar altında bız kendımız exceptıon atabılırız.
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negatıve");
        } else {
            System.out.println(age);
        }
    }

    //ögrencı notları gırısı yapan ve notu konsola yazdıran bır method olusturunuz.

    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");

        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }
    }
}