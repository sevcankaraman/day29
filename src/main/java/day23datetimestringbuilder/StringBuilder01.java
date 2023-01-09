package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
    buılder yapıcı demek. string inşa eden demektir.

    Note : javada "string class "kullanılarak veya "strıng buılder class "
    kullanılarak olusturulabılır.

      *)"String class" kullanarak urettiğiniz stringler inmutable(değiştirilemez)dir
      *)"String buılder class" kullanarak urettiğiniz stringler mutable(değiştirilir)dir



     */
    public static void main(String[] args) {
        //Immutable

        String s="java";
        String t=s+"!";
        String w=t+"?";

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.

        String a="Money";
        a=a+"More";

        //mutable
        //1.yol String Buılder Kullanarak String uretmenın 1.yolu:
        StringBuilder sb1=new StringBuilder("Python");
        System.out.println(sb1);
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);

        // append stringi stringe yapıştırıyor.concat gibi yapıyor

        //2.yol String Buılder Kullanarak String uretmenın 2.yolu:
        StringBuilder sb2=new StringBuilder();//burda boş bır string buılder oluşturuyoruz

        System.out.println(sb2.length());//0

        //String buılder kullandıgınızda baslangıc kapasitesi 16 dır.
        //Kapasite asıldıgında varolan kapasitenin ıkı fazlası kadar varolan kapasıteye ekleme yapılır.
        //16==> 16*2+2 - 34==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");

        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34=16*2+2= var olan kutu sayısının ıkı katından ıkı fazla olarak geldı kapasitesi

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 ==> 34*2+2 kapasite asımında her zaman bu sekılde olur.

        //3.yol String Buılder Kullanarak String uretmenın 3.yolu:

        StringBuilder sb3=new StringBuilder(2);// 2 kutu verdı Fl yazdı

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");//Flxxxxxxo
        System.out.println(sb3);

        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir


        //toString metodu strıng buılder ı strınge cevırır.
        //String class da var olan ama strıng buılder class da var olmayan splıt() method gıbı methodlara ıhtıyac
        // duydugumuzda to string methodunu kullanarak strıng class a gecer ve o methodları kullanırız.

        sb3.toString().split("l");

        //STringi tekrar String buılder a cevirebilirz
        StringBuilder sb4= new StringBuilder();

         // reverese() methodu Stringleri ters cevirir
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxxlF
        //deleteCharAt(); istenen indexteki characteri siler

        //indeks 1 dekı karakterden ındeks 5 dekı(6 dahıl olmadıgı ıcın 5 yazdım) karakterekadar tum karakterlerı sıler

        sb3.delete(1,6);//ilk indeks dahıl ıkıncı ındeks harıc oluyor
        System.out.println(sb3);//olF

        StringBuilder sb5= new StringBuilder("Kava");
        StringBuilder sb6= new StringBuilder("Java");

        //compareTo alfebetik olarak karsılastırma yapar
        //sb5.compare To (sb6)methodu sb5 ıle sb6 yı alfebetik olarak sıralama olarak karsılasıtrır.
        //sb5 alfabetık sıralamada once ıse sonucu negatif olur,sonra ıse sonucu pozıtıf olur

        System.out.println(sb5.compareTo(sb6));//1


        //setChar(2,'m');index 2 dekı karakteri m ye cevırır

        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama

        //replace() methodu: verilen index araligina [1 3) verilen String degerini koyar.

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza

        //StringBuılder class da kullanmamıza ızın verilen substring() method gibi bazı strıng class methodları vardır.
        //bu method'ları StringBuılder ustunde kullanınca StringBuılder ın orjınal degerı degışmez.




        String s7=sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza



























    }
}
