package day25inheritance;



public class Car extends Vehicle {

    public int price = 11000;

    public void engine(){
        System.out.println(   "car engine" );
    }

    public Car(){
        super();
        System.out.println("car 1 ");
    }
    public Car(String make){
       this();

        System.out.println("Car 2: " + make);
    }

    }



