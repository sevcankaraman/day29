package day25inheritance;



public class Honda extends Car {

 public Honda(){
     this("R8",2023);

     System.out.println("honda 1"  );
 }
    public Honda(String model, int year){
     super();//super () yazmasanızda ay ı işi görür.parantezin içine bir sey koyacaksanız yazmanız gerekıyor.
        System.out.println("Honda 2: " + model + " - " + year);
    }

}