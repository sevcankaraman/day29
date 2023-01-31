package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olustudugunuzda deger atamazsaniz o variable'i "initialize" etmediniz demektir.
    // Static variable'lar static block'lar icinde initialize edilirse o class'in icinde her sey'den
    // once hazir hale getirilmis olur.
    //Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir.
    // bu yuzden static block'lar kullanilir

    // main method'u en yukari koysakta ilk once static block'lar calistirilir.

    //Note 1: "static block" lar static variable'lari initizalize etmek icin kullanilirlar
    //Note 2: "static block" lar class icinde "herseyden once" calistirilirlar

    static double pi;
    static String shape;

    static{
        pi = 3.14;
        System.out.println("Static block 1");
    }

    static{
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }

}
