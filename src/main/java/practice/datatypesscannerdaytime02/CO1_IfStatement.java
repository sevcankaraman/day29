package practice.datatypesscannerdaytime02;

import java.util.Locale;
import java.util.Scanner;

public class CO1_IfStatement {
    public static void main(String[] args) {
        /*
        kullanıcıcdan bir gün ismi alın
        eger gun cuma ise müslümanlar için kutsal gün
        eger cumartesi ise yahudiler için kutsal gün
        eger gun pazar ise hristiyanlar için kutsal gun
        yazdıran kodu olusturun.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String gun= input.next().toLowerCase();//kucuk harfe cevirdik

        if(gun.equals("cuma")){
            System.out.println("müslumanlar için kutsal gun");
        }else if(gun.equals("cumartesi")){
            System.out.println("yahudıler için kutsal gün");
        } else if (gun.equals("pazar")) {
            System.out.println("hristiyanlar için kutsal gün");
        }else{
            System.out.println("kutsal gun değil");
        }


    }
}
