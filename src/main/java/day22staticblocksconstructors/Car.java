package day22staticblocksconstructors;

public class Car {
    /*
         Constructor nedir?
         Class dan obje uretmemize yarayan code block larıdır.

         Class oluşturdugumuzda java bıze otomatık olarak bıze bır consturactor verır.
         Ama bu constructor gözle gorulmez, gozle gorulmeyen otomatık olarak java
         trafından verılenbu contructorlara "default constructor" lar denır

         "default constructor"lar Car(){} seklindedir.

         siz kendı constructor ınızı olusturdugunuzda java default constructor ı sıler.

         Bir class ın içinde farklı parametreler kullanarak istediğiniz kadar constructor olustrubilirsiniz.

         Farklı constructorlar sayesınde bır class dan farklı farklı objeler oluşturabılırız.

         INTERWİEW SORUSU

         method ile constructor ın farkı var mıdır ?
         var sa nedır?

         CEVAP: meTHOD İLE CONSTRUCTOR FARKLI YAPILARDIR.
         1) Methodlarda return type vardır . contructor larda return type yoktur
         2) Methodların ısmı yaptıkları işe gore developerlar tarfından belırlenır.Constructorların
            ismi ise her zaman class ısmı ıle aynı olmalıdır.
     */

    //this.make bu class daki make i benim yaptigim make yap demek

String make="Honda";
String model= "Accord";
int year =2023;
boolean hybrid=true;

        Car(String make,String model,int year,boolean hybrid){
             this.make=make;
             this.model=model;
             this.year=year;
             this.hybrid=hybrid;

        }

        Car(String make, String model){
            this.make=make;
            this.model=model;
            if (year==2023){
                this.year=0;
            }
            if (hybrid==true){
                this.hybrid=false;
            }

        }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
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

