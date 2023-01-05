package practice.datatypesscannerdaytime02;

public class C02_MethodCreatio {


    //dikdörtgenin alanını hesaplayan methodu olusturunuz ve kulllanınız

    public static void main(String[] args) {

        // protokol alanı
        System.out.println(dikdortgeninAlani(5, 10));


    }//main in boyd si

    /*
       Acess modifier    Static     Data Type    Method Adı (parametreler)
     */


    public static int dikdortgeninAlani(int a, int b){

        // main method static oldugu için main içindeki herseyin static olması gerekır
        //method adı Camel Case küçük harf baslar sonraki her kelimenin ilk harfi büyük olur

        return a*b; // carpmanın sonucunu kullanıcıya ver




    }
}//class  ın bodys
