package practice.datatypesscannerdaytime02.daytime03;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        int a=12;
        int b=a++;
        System.out.println("b="+b);
        System.out.println("a="+a);

        int x=15;
        int y=x--;//post increment

        System.out.println("x="+x);
        System.out.println("y="+y);

        int m=21;
        int n=++m;//pre increment

        System.out.println("m="+m);
        System.out.println("n"+n);

        int t=32;
        int u=--t;

        System.out.println("u = " + u);
        System.out.println("t = " + t);

    }
}
