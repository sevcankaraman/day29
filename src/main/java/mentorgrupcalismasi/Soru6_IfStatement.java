package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru6_IfStatement {
    public static void main(String[] args) {
//Kullanicinin kilo ve boyunu isteyip vucut kitle endeksini hesaplayan kodu yaziniz.
        //Vucut kitle endeksi 30'dan buyukse obez,
        //25-30 arasi kilolu
        //20-25 arasi normal
        //20'den kucukse zayif yazdirin...

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen sirayla önce kilonuzu sonra boyunuzu giriniz...");
        double kilo = input.nextDouble();
        double boy = input.nextDouble();

        double vke = kilo*10000/(boy*boy);
        System.out.println(vke);


        if (kilo<=0 || boy<=0){
            System.out.println("Lutfen gecerli bir deger giriniz...");
        } else if (vke<20) {
            System.out.println("Cok zayifsiniz...");
        } else if (vke<25) {
            System.out.println("Normalsiniz sıkıntı yok...");
        } else if (vke<30) {
            System.out.println("Artık Yeme!...");
        }else{
            System.out.println("Vay Maşallahhhh.....");
        }


    }
}