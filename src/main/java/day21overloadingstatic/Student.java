package day21overloadingstatic;

public class Student {

   /*
   1) static variable veya static methodlar(class member) tum objectler için ortak elemandır.
   2) static class memberlar uzerınde yapılan tum değişiklikler tüm objectleri etkiler.
   3) static class memberlar class'a non static objectlere monte edilir.
      Mesela; bir class dan 100 tane object olusturdugunuzda non static olanlar  100 kere olusturulur,
      ama static olanlar object sayısından bagımsız olarak bir kere olusturulur.
    4)static class memberlara ulasmak için object olusturmaya gerek duyulmaz,
      ama non static class memberlara ulaşmak için  object olusturmak sarttır.
    5) static variable'ların diğer adı "class variable"dir.
       non-static variable'ların diğer adı "İnstance variable" veya "object variable" dir.

    */
   public static String stdName = "Tom Hanks";
   public int age = 13;

   //öğrenci isminin ilk harflerini veren methodu olusturunuz.
   public static String getInitial(String name) {

      String first = name.substring(0, 1);
      String second = name.split(" ")[1].substring(0, 1);
      return first + second;
   }

   //öğrenci ismindeki sesli harfleri (a,e,i,o,u) sayan bir method olusturunuz.

   public int countVowels(String name) {

      int counter = 0;

      int i;
      for (i = 0; i < name.length(); i++) {
         char ch = name.toLowerCase().charAt(i);
         switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

               counter++;
               break;
         }
      }
      return counter;
   }
}

