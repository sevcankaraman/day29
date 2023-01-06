package day21overloadingstatic;

public class M {
    static int counter = 0;

    int age = 0;



    public M() {

        counter++;

        age++;

    }



    public static void main(String[] args) {

        M obj1 = new M();

        M obj2 = new M();

        M obj3 = new M ();



        System.out.print(obj1.counter);

        System.out.print(obj2.counter);

        System.out.print(obj3.counter);



        System.out.print(" - ");



        System.out.print(obj1.age);

        System.out.print(obj2.age);

        System.out.print(obj3.age);

    }

}