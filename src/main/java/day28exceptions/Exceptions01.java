package day28exceptions;

public class Exceptions01 {


        //exception ==> umulmadık problem demek.
        //handal ==> elden gecırmek.ustesinden gelmek.

        /*
        1) beklenmedik problem demektir
        2) gercek hayatta karsılastıgımız beklenmedık problemler için çözüm yollarımız vardır.
           mesela benzın bıtınce yol yardımı ararız.aplicationlarda da beklenmedık problemler
           ıcın cozum yolları uretmelıyız,bu işleme "exception handling" denır.
        3) exceptıonalr temel olaak ıkıye ayrılırlar:
           1-Compile time Exceptionlar: siz code yazarkn farkedılır yazdıgınız kodun altı kırmızı cızgı ile cızılır
           2-Run Time Exception: siz code yazarken fark edılmez ama kodu calıstırdıgınızda konsolda hata alırsınız
        4) exceptionlar dısında "error" dıye adlandırdıgımız  "handle" edılemeyen problem vardır.
           gercek hayatta şöförun ölmesi gibi, handle edilemeyecek durumlar " error" dur.
           Applicationlarda "memory" nın dolması "error"dur.

           ıkı tur memory var :
            i) Stack memory dolarsa " StackOverFlow Error" alırsınız.
            ii) Heap Memory dolarsa "OutOfMemory Error" alırsınız.
        5) İNTERVİEW SORUSU :
            yazdıgınız kod calısmadıgında olusan problemı bulmak ıcın ne yaparsınız.?
            konsoldakı ."log" lara bakarım.
         6) if else kullanirsak olusacabilecek her problemi spesifik olarak  if parantezının ıcıne yazmamız gerekır.
            bu da cıddı bır matematık bılgısı gerektırır. ve yazacagımız kodu cok uzatır.
            Ama try catch'te java iligli Exceptıon ile alakalı olusabılecek butun problemlerı yakalar.

         /9


            // exceptıonu handle etmezsenız kod orda ölür.
            // java herhangı bır hata gordugunde dıger kodları calıstırmaz


         */

    public static void main(String[] args) {

        int a=12;
        int b=0;

      divide(a,b);
      divide2(a,b);

    }

    //Aritmetik işlemlerde yazdıgınız code da matematıksel işlem kullanıyorsanız alınabılecek bir exception'dır.
    //Nasıl handle edileceğini asağıda yazdık.

    public static void divide(int a, int b){
        try {
            System.out.println(a / b);
            System.out.println("ı am here");
        }catch (ArithmeticException e) {
          System.out.println("do not divide by zero");
        }
            System.out.println("you are here");
        }

        // "Exceptıon Handl"in de if else kullanılmaz.Bkz. 6

        public static void divide2(int a, int b){
        if (b==0) {
            System.out.println("do not divide by zero");
        }else{
            System.out.println(a/b);
        }
        }

    }
