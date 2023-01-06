package day21overloadingstatic;

public class C02_Static {
    static int sayi1; // statik varible
    int sayi2;// STatik olmayan variable =instance
    public static void main(String[] args) {//protokol
        System.out.println("sayi1 = " + sayi1);//0

        C02_Static obj1=new C02_Static();

        System.out.println("sayi2 = " + obj1.sayi2);
        sayi1++;














    }
}
