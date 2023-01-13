package day24accessmodifiersinheritiance;

public class Vehicle {

     /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.

     */

    public String type;

    public Vehicle(){

    }


    public Vehicle(String type){
        this.type=type;
        System.out.println("Vehicle Constructor");


    }
}
