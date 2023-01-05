package advancepractice.practisedaytime06_yasinhoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_EkleCikar_Tekrar {
    public static void main(String[] args) {
        //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut
        // bir elementi o sayı ile güncelleyen bir kod yazınız.


        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("sayı eklemek için add giriniz : \n" +
                    "sayıyı guncellemek için set giriniz : \n+" +
                    "sayı sılmek için remove giriniz : \n" +
                    "cıkmak için break yazınız");
            String komut = input.next();

            if (komut.equalsIgnoreCase("add)")) {

                System.out.println("eklemek istediğiniz tamsayıyı giriniz");
                int ekleneceksayi = input.nextInt();
                list.add(ekleneceksayi);

            } else if (komut.equalsIgnoreCase("set")) {

                System.out.println("guncellemek istediğiniz sayıyı giriniz");
                Integer guncelleneceksayi = input.nextInt();
                int guncellenecekindex = list.indexOf(guncelleneceksayi);

                System.out.println( "yerine eklemek istediğiniz sayıyı giriniz");
                int yenisayi=input.nextInt();
                list.set(guncellenecekindex,yenisayi);

            } else if (komut.equalsIgnoreCase("remove")) {

                System.out.println("silmek istediğiniz sayıyı giriniz");
                Integer sayi= input.nextInt();
                list.remove(sayi);
            }else if(komut.equalsIgnoreCase("break")){
                System.out.println("cıkmak için break giriniz");
                break;
            }else {
                System.out.println("gecerli bir komut giriniz");
            }
            System.out.println(list);


        }

    }
}
