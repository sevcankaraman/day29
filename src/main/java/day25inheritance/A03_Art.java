package day25inheritance;

public class A03_Art extends A04_Lessons{

    public A03_Art() {
        System.out.println("parametresiz art");
    }

    public A03_Art(String level) {
        super(level);
        System.out.println("parametreli art");
    }
}

