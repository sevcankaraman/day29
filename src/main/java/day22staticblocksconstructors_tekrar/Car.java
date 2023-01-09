package day22staticblocksconstructors_tekrar;

public class Car {
    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid = true;
    Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }
    Car(String make,String model){
        this.make=make;
        this.model=model;
        if(year==2023){
        this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }
    }



    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
