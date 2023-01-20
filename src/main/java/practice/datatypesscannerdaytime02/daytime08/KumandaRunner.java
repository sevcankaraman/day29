package practice.datatypesscannerdaytime02.daytime08;

public class KumandaRunner {
    public static void main(String[] args) {
        Kumanda tv=new Kumanda(11.5,7,9.8);
        tv.gucDugmesi();
        System.out.println(tv.kanalDegistirme(2));
        System.out.println(tv.sesArttirma());
        System.out.println(tv.sesAzaltma());

    }//main

}
