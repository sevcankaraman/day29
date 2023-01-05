package mentorgrupcalismasi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjeSorusu_Slackten {

    public static void main(String[] args) {
        /*
     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 manav,
        2 sarkuteri,
        3 market
        secime gor ,
        4-urunleri listele ve
        5-fiyatlari gelsin
     *
     * Basrili Market alış-veriş programı.
        1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

            No   Ürün    Fiyat
             ===== ======= ========
        00 Domates 2.10 TL ,
        01 Patates 3.20 TL ,
        02 Biber 1.50 TL ,
        03 Soğan 2.30 TL  ,
        04 Havuç 3.10 TL
        05 Elma 1.20 TL
        06 Muz 1.90 TL
        07 Çilek 6.10 TL
        08 Kavun 4.30 TL
        09 Üzüm 2.70 TL
        10 Limon 0.50 TL
     *
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
     * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
     * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
     * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Marketimize hosgeldiniz, ürünlerimizi gormek icin lutfen; " +
                "\n1)Manav," +
                "\n2)Sarkuteri" +
                "\n3)Market," +
                "\n kategorilerinden birini seciniz.");

        List<String> urunler =new ArrayList<>();
        urunler.add("Domates"); urunler.add("Patates"); urunler.add("Biber");urunler.add("Sogan"); urunler.add("Havuc");
        urunler.add("Elma"); urunler.add("Muz"); urunler.add("Cilek"); urunler.add("Kavun"); urunler.add("Uzum"); urunler.add("Limon");

        List<Integer> urunNo=new ArrayList<>();
        urunNo.add(0); urunNo.add(1); urunNo.add(2); urunNo.add(3); urunNo.add(4); urunNo.add(5); urunNo.add(6); urunNo.add(7);
        urunNo.add(8); urunNo.add(9); urunNo.add(10);

        List<Double> fiyat=new ArrayList<>();
        fiyat.add(2.10); fiyat.add(3.20); fiyat.add(1.50); fiyat.add(2.30); fiyat.add(3.10); fiyat.add(1.20); fiyat.add(1.90);
        fiyat.add(6.10); fiyat.add(4.30); fiyat.add(2.70); fiyat.add(0.50);
        int listeSecim = input.nextInt();

        while (true) {
            if (listeSecim == 1) {
                System.out.println("Manav reyonuzmdaki urunlerimiz ve fiyatlari su sekildedir;" +
                        "\n Urun No   Urun Adi   Fiyat" +
                        "\n =======   =======    =====" +
                        "\n    " + urunNo.get(0) + "      " + urunler.get(0) + "    " + fiyat.get(0) + " TL" +
                        "\n    " + urunNo.get(1) + "      " + urunler.get(1) + "    " + fiyat.get(1) + " TL" +
                        "\n    " + urunNo.get(2) + "      " + urunler.get(2) + "      " + fiyat.get(2) + " TL" +
                        "\n    " + urunNo.get(3) + "      " + urunler.get(3) + "      " + fiyat.get(3) + " TL" +
                        "\n    " + urunNo.get(4) + "      " + urunler.get(4) + "      " + fiyat.get(4) + " TL" +
                        "\n    " + urunNo.get(5) + "      " + urunler.get(5) + "       " + fiyat.get(5) + " TL" +
                        "\n    " + urunNo.get(6) + "      " + urunler.get(6) + "        " + fiyat.get(6) + " TL" +
                        "\n    " + urunNo.get(7) + "      " + urunler.get(7) + "      " + fiyat.get(7) + " TL" +
                        "\n    " + urunNo.get(8) + "      " + urunler.get(8) + "      " + fiyat.get(8) + " TL" +
                        "\n    " + urunNo.get(9) + "      " + urunler.get(9) + "       " + fiyat.get(9) + " TL" +
                        "\n   " + urunNo.get(10) + "      " + urunler.get(10) + "      " + fiyat.get(10) + " TL");
                break;
            } else if (listeSecim == 2) {
                System.out.println("Sarkuteri reyonumuz aktif degildir, lutfen yeniden secim yapiniz; " +
                        "\n1)Manav," +
                        "\n2)Sarkuteri" +
                        "\n3)Market,");
                listeSecim = input.nextInt();
            } else if (listeSecim == 3) {
                System.out.println("Market reyonumuz aktif degildir, lutfen yeniden secim yapiniz; " +
                        "\n1)Manav," +
                        "\n2)Sarkuteri" +
                        "\n3)Market,");
                listeSecim = input.nextInt();
            } else {
                System.out.println("Yanlis numara girdiniz, lutfen tekrar deneyiniz " +
                        "\n1)Manav," +
                        "\n2)Sarkuteri" +
                        "\n3)Market,");
                listeSecim = input.nextInt();
            }
        }
        System.out.println("Lutfen listeden urun seciniz...");
        List<String> sepet=new ArrayList<>();
        double odeme=0;
        while (true){
            int secim= input.nextInt();
            System.out.println("Lutfen kac kilo alacaginizi giriniz");
            double kilo= input.nextDouble();
            if (secim == 0) {
                sepet.add(urunler.get(0));
                odeme+=fiyat.get(0)*kilo;
            } else if (secim==1) {
                sepet.add(urunler.get(1));
                odeme+=fiyat.get(1)*kilo;
            } else if (secim==2) {
                sepet.add(urunler.get(2));
                odeme+=fiyat.get(2)*kilo;
            }else if (secim==3) {
                sepet.add(urunler.get(3));
                odeme+= fiyat.get(3) * kilo;
            }else if (secim==4) {
                sepet.add(urunler.get(4));
                odeme+= fiyat.get(4) * kilo;
            }else if (secim==5) {
                sepet.add(urunler.get(5));
                odeme+= fiyat.get(5) * kilo;
            }else if (secim==6) {
                sepet.add(urunler.get(6));
                odeme+= fiyat.get(6) * kilo;
            }else if (secim==7) {
                sepet.add(urunler.get(7));
                odeme+= fiyat.get(7) * kilo;
            }else if (secim==8) {
                sepet.add(urunler.get(8));
                odeme+= fiyat.get(8) * kilo;
            }else if (secim==9) {
                sepet.add(urunler.get(9));
                odeme+= fiyat.get(9) * kilo;
            }else if (secim==10) {
                sepet.add(urunler.get(10));
                odeme+= fiyat.get(10) * kilo;
            }else System.out.println("Yanlis urun no girdiniz");
            System.out.println("Sepetinizde mevcut olan urunler:" +
                    "\n"+sepet+"" +
                    "\n Mevcut tutar: "+odeme+" TL" +
                    "\n\n Alisverise devam etmek icin 'D' tusuna basiniz, cikmak icin 'Q' tusuna basiniz");
            String karar=input.next();
            while (true) {
                if (!(karar.equalsIgnoreCase("d")) && !(karar.equalsIgnoreCase("q"))) {
                    System.out.println("Yanlis tercih yaptiniz, lutfen tekrar deneyin");
                    karar = input.next();
                } else if ((karar.equalsIgnoreCase("d"))||(karar.equalsIgnoreCase("q"))) {
                    break;
                }
            }
            if(karar.equalsIgnoreCase("d")){
                System.out.println("Lutfen listeden urun seciniz"+
                        "\n Urun No   Urun Adi   Fiyat" +
                        "\n =======   =======    =====" +
                        "\n    "+urunNo.get(0)+"      "+urunler.get(0)+"    "+fiyat.get(0)+" TL"+
                        "\n    "+urunNo.get(1)+"      "+urunler.get(1)+"    "+fiyat.get(1)+" TL"+
                        "\n    "+urunNo.get(2)+"      "+urunler.get(2)+"      "+fiyat.get(2)+" TL"+
                        "\n    "+urunNo.get(3)+"      "+urunler.get(3)+"      "+fiyat.get(3)+" TL"+
                        "\n    "+urunNo.get(4)+"      "+urunler.get(4)+"      "+fiyat.get(4)+" TL"+
                        "\n    "+urunNo.get(5)+"      "+urunler.get(5)+"       "+fiyat.get(5)+" TL"+
                        "\n    "+urunNo.get(6)+"      "+urunler.get(6)+"        "+fiyat.get(6)+" TL"+
                        "\n    "+urunNo.get(7)+"      "+urunler.get(7)+"      "+fiyat.get(7)+" TL"+
                        "\n    "+urunNo.get(8)+"      "+urunler.get(8)+"      "+fiyat.get(8)+" TL"+
                        "\n    "+urunNo.get(9)+"      "+urunler.get(9)+"       "+fiyat.get(9)+" TL"+
                        "\n   "+urunNo.get(10)+".      "+urunler.get(10)+"      "+fiyat.get(10)+" TL");
            } else if (karar.equalsIgnoreCase("q")) {
                break;
            }
        }
        System.out.println("Marketimizi tercih ettiginiz icin tesekkür ederiz. Almis oldugunuz urunler;" +
                "\n"+sepet+
                "\nToplam ödeyeciginiz tutar= "+odeme+" TL"+
                "\nIyi gunler dileriz...");


    }
}