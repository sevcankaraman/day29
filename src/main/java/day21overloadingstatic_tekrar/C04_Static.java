package day21overloadingstatic_tekrar;

public class C04_Static {
    public static void main(String[] args) {
        System.out.println(C03_StaticDepo.okulismi);


        C03_StaticDepo obj1=new C03_StaticDepo();
        System.out.println(obj1.ogrenciGul);

        C03_StaticDepo.okulismi="Mine Okulları";
        System.out.println(C03_StaticDepo.okulismi);

        C03_StaticDepo obj2=new C03_StaticDepo();
        obj2.ogrenciGul="Zeynep Karagöl";
    }
}
