package mentorgrupcalismasi;
import java.util.Scanner;
public class SwitchCase_Soru1 {

    // burc bulan program
    /*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
  */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("doğdugunuz ay..:");
        int ay=input.nextInt();
        System.out.println("doğduğunuz gun..:");
        int gun=input.nextInt();



        switch (ay){
            case 1:
                if (gun>=1 && gun<=31){
                    if(gun<22){
                        System.out.println(" oğlak burcu ");
                    }else {
                        System.out.println(" kova burcu ");
                }
                }else {
                    System.out.println("gecersiz bir gun girdiniz..!");
                }
                break;
            case 2:
                if (gun>=1 && gun<=28){
                    if(gun<20){
                        System.out.println(" kova burcu ");
                    }else {
                        System.out.println(" balık burcu ");
                    }
                }else {
                    System.out.println("gecersiz bir gun girdiniz..!");
                }
                break;
            case 3:
                if (gun>=1 && gun<=31){
                    if(gun<21){
                        System.out.println(" balık burcu ");
                    }else {
                        System.out.println(" koç burcu ");
                    }
                }else {
                    System.out.println("gecersiz bir gun girdiniz..!");
                }
                break;
            case 4:
                if (gun>=1 && gun<=30){
                    if(gun<21){
                        System.out.println(" koç burcu ");
                    }else {
                        System.out.println(" boğa burcu ");
                    }
                }else {
                    System.out.println("gecersiz bir gun girdiniz..!");
                }
                break;

            default:
                System.out.println("hatalı bir ay girdiniz");

        }






    }
}
