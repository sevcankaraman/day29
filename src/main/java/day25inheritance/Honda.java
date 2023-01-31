package day25inheritance;



public class Honda extends Car {

     public  int price= 10000;

    public void engine(){
        System.out.println(   " honda engine" );
    }

 public Honda(){

     this("R8",2023);

     System.out.println("honda 1"  );
 }
    public Honda(String model, int year){
     super("audı");//super () yazmasanızda ay ı işi görür.parantezin içine bir sey koyacaksanız yazmanız gerekıyor.
        System.out.println("Honda 2: " + model + " - " + year);
    }

}