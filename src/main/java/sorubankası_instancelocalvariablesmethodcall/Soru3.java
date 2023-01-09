package sorubankası_instancelocalvariablesmethodcall;

public class Soru3 {
    public static void add(int num1,int num2){
        System.out.println(2+num1+num2);

    }
    public static void add(double num1,double num2) {
        System.out.println(3+num1+num2);

    }

    public static void main(String[] args) {
        add(3,5);
        add(3.1,5.2);
        add(3.1,5);
    }

}
