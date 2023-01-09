package day22staticblocksconstructors_tekrar;

public class StaticBlocks01 {
    static double pi;
    static  String shape;


    static {
        pi=3.14;
        System.out.println("static blok 1 ");
    }
    static {
        shape="circle";
        System.out.println("static blok 2" );
    }


    public static void main(String[] args) {
        pi = 3.14;
        System.out.println(pi);
        System.out.println("main method");
    }
}