package day03scanner;

import java.sql.SQLOutput;

public class Car {
    public String model = "Coralla"; //pasif ozellikler variable
    public int fiyat = 4000000;

    public static void main(String[] args) {

       // class ismini yazın     #objeye isim verin    = new keywordunu kullanın   class ismini ()
            Car                      myCoralla         = new                           Car();
        System.out.println(myCoralla.fiyat);
        System.out.println(myCoralla.model);
        myCoralla.hareket();
        myCoralla.dur();


    }//main 'in body si

    public void hareket () { // aktif özellikler methodlar

        System.out.println("toyata hızlı hareket eder");
    }

    public void dur() {

        System.out.println("toyata güvenle durur");
    }


}//class body'si
