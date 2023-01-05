package day20passbyvalueoverloading;

public class PassByReference {
    public static void main(String[] args) {
        int gomlek=100;

        System.out.println("gomlek = " + gomlek);//100

        // ogrenciIndirimi(gomlek);
        // System.out.println("gomlek = " + gomlek);//gomlek = 100
        gomlek= ogrenciIndirimi(gomlek);
        System.out.println("atamadan sonra maindeki gomlek = " + gomlek);

    }//main

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//ogrenciGomlegi = 90
        return  ogrenciGomlegi;
    }//ogrenciInd Meth
}

