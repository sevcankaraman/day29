package day25inheritance;

public class  Vehicle {

     /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.

     */
      public int price =120000;
      public void engine(){
          System.out.println(   "vehicle engine" );
      }

    public Vehicle(){
        System.out.println("vehicle 1");

    }


    public Vehicle(int price){

        System.out.println("Vehicle 2: " + price);
    }

    }
