package day28exceptions;

public class Exceptions05 {

    //try ın ıcınde sorun cıkmazsa catchler kullanılmaz.
    public static void main(String[] args) {
        int a =16;
        int b=2;
        String  s ="My Java";
        getCharFromString(s,a,b);


        }
    // try kisminda birden fazla Exception olusturma ihtimali olan kod varsa, coklu "catch" kullanabilirsiniz.

//  Coklu "catch" kullandiginizda exception class'lar arasinda "Parent-Child" iliskisi yoksa , catch'lerin sirasi
// onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir

   //  Coklu "catch" kullandiginizda exception class'lar arasinda "Parent-Child" iliskisi varsa , catch'lerin sirasi
// onemlidir. child olan class ustte olmalıdır.

    //Exceptions classlarda "parent-chıld" ilişkisi varsa ,ya chıld class i uste yazarak child ve parent classlar
    // için özelleştirilmiş kodlar yazarsınız(hırsız ıcın 155, hasta için 122 gibi)
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.
    // (Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s,int a,int b){

        try {

        int idx=a/b;
        char ch=s.charAt(idx);
        System.out.println(ch);

    }catch(ArithmeticException e){
            System.out.println("do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan ındeks kullandınız");
        }
    }
}
