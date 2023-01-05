package practice.datatypesscannerdaytime02.daytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //example: /* (interwiew sorusu)
        //
        //    Adada yalnız bir maymun var
        //    Her gün 4 muz yemesi gerekiyor
        //    o adada sadece 165 muz var
        //    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        //
        //    */

        int numberOfBananas=165;// 4 8 12.......164==>geriye 1 muz kaldı
        int survivaldays=1;     // 1 2 3........41==>42.gun oldu
        boolean monkeyALife=true;

        do {
            System.out.println("*************** maymunlar gunde 4 muz yer ********************");
            numberOfBananas-=4;//toplam muz sayisindan her gun 4 muz eksiltir
            System.out.println("Kalan muz Sayisi "+numberOfBananas);
            survivaldays++;
            if(numberOfBananas<4){
                monkeyALife=false;
                System.out.println("Bugun "+survivaldays+". gun yeterli muz kalmadi.Maymun rahmetli");
                System.out.println("Maymun "+survivaldays+ ". gun oldu");

            }else{
                System.out.println("Bugun "+survivaldays+" .gun; maymun hala yasiyor ");
            }

        }while (monkeyALife);//do while


    }
}
