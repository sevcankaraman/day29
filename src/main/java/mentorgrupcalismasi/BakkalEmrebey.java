package mentorgrupcalismasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalEmrebey {
    static List<String> days = new ArrayList<>();
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double ortalamaKazanc=0;

    public static void main(String[] args) {
        System.out.println("\u001B[36m");




        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */

        System.out.println(  "                        ==========================BAKKAL YONETIM SISTEMINE HOSGELDINIZ==========================");
        Scanner input = new Scanner(System.in);

        days.add("Pazartesi");
        days.add("Sali");
        days.add("Carsamba");
        days.add("Persembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");


        double kazanc;
        int i = 0;

        while (i < 7) {
            System.out.println("Lutfen " + days.get(i) + " gunku kazancinizi giriniz...  ");
            kazanc = input.nextInt();
            gunlukKazanclar.add(i, kazanc);
            i++;
        }

        getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftalik Ortalama Kazanciniz : " + ortalamaKazanc);
        getOrtalamaninUstundeKazancGünleri(gunlukKazanclar);
        getOrtalamaninAltindaKazancGünleri(gunlukKazanclar);

    }

    public static void getOrtalamaKazanc(List<Double> listName) {

        double sum = 0;
        for (double w : listName) {
            sum += w;
            ortalamaKazanc = sum / listName.size();
        }


    }

    public static void getOrtalamaninUstundeKazancGünleri(List<Double> listName) {

        List<String> ortalamaUzeriGunler = new ArrayList<>();
        double ort = ortalamaKazanc;
        int counter = 0;

        for (Double w : listName) {
            if (w > ortalamaKazanc) {
                ortalamaUzeriGunler.add(days.get(counter) + " = " + gunlukKazanclar.get(counter));
            }
            counter++;
        }
        System.out.println("Ortalamanin Uzerinde Kazandiğiniz gunler : " + ortalamaUzeriGunler);
    }

    public static void getOrtalamaninAltindaKazancGünleri(List<Double> listName) {

        List<String> ortalamaAltiGunler = new ArrayList<>();

        int counter = 0;

        for (Double w : listName) {
            if (w < ortalamaKazanc) {
                ortalamaAltiGunler.add(days.get(counter) + " = " + gunlukKazanclar.get(counter));
            }
            counter++;
        }
        System.out.println("Ortalamanin Altinda Kazandığınız Günler : " + ortalamaAltiGunler);
    }


}











