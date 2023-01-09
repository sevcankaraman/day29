package sorubankası_instancelocalvariablesmethodcall;

public class Soru6 {
    public static void main(String []args){
        add(3.2,4.8);// output A
        add(5,7.3);// output B
        add(5,7); // output C
        add(5.3,7); // output D

    }

    public static void add(double v, double n1 ){
        System.out.println(n1+v);
    }
   /* public static void add(int n1 + double v ){
        System.out.println(n1+v);
    }
    public static void add(int n1 + int  ){
        System.out.println(n1+v);
    }
  */ // compli time erordur veriyor anlaömadım
}
