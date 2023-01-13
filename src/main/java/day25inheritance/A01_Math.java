package day25inheritance;

public class A01_Math extends A04_Lessons {

       public A01_Math(){
           super("str");//babaya gıt
           System.out.println("Math Constructor");

}

public A01_Math(int a){
           this();//ayni class ın içindeki
             //const. calısmasını saglar
    System.out.println("parametreli math cons.");

}

}
