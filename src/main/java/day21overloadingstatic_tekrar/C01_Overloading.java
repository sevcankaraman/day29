package day21overloadingstatic_tekrar;

public class C01_Overloading {
    public static void main(String[] args) {
        toplama(3, 5);
        toplama(3.6, 5);
        toplama((float) 3.69, 5);
        cikarma(40, 10);
        cikarma(40, 10, 5);
        carpma(5, 2.8);
        carpma(5.9, 2);
    }//main
    private static void  carpma(int a,double b){
        System.out.println("int ile double carpma: "+ (a*b));
    }
    private static void carpma(double a,int b){
        System.out.println("double ile int carpma: "+(a*b));
    }
    private static void cikarma(int a,int b){
        System.out.println("iki int ile cıkarma: "+ (a-b));

    }
    private  static void cikarma(int a,int b , int c){
        System.out.println("üç int cıkarma: "+(a-b-c));
    }
    private static void toplama(int a,int b){
        System.out.println("iki int ile toplama: "+(a+b));

    }
    private  static void toplama(double a,int b){
        System.out.println("double ile int toplama: "+ (a+b));

    }
    private static void toplama(float a,int b){
        System.out.println("float ile int toplama: "+(a+b));
    }
}
