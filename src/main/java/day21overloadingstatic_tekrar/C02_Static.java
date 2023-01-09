package day21overloadingstatic_tekrar;

public class C02_Static {

    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        System.out.println("sayi1 : "+sayi1);

        C02_Static obj1=new C02_Static();
        System.out.println("sayi2 : "+obj1.sayi2);

        sayi1++;
        System.out.println("sayi1 : " + sayi1);
        obj1.sayi2++;
        System.out.println("sayi2 : " + obj1.sayi2);

        C02_Static obj2=new C02_Static();
        System.out.println("sayi2 : "+ obj2.sayi2);
        System.out.println("sayi1 : "+ obj2.sayi1);


    }
}
