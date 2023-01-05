package day02datatypesmethodcreation;

public class day02odev {

    public static void main(String[] args) {

        int dAlan = dikdortgeninAlani(5,4);
        System.out.println(dAlan);

        int dCevre = dikdortgeninCevresi(5,4);
        System.out.println(dCevre);

        double alanDaire = daireninAlani(3.14,3);
        System.out.println(alanDaire);

        double cevreDaire = daireninCevresi(2,3.14,6);
        System.out.println(cevreDaire);
    }
    public static int dikdortgeninAlani(int a,int b){
        return a*b;
    }
    public static int dikdortgeninCevresi(int a, int b){
        return (a+b)*2;
    }
    public static double daireninAlani (double pi, int r){
        return pi*r*r;
    }
    public static double daireninCevresi(int a,double pi,int r){
        return a*pi*r;
    }
}

