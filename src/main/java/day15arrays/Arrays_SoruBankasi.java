package day15arrays;

import org.openqa.selenium.json.JsonOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_SoruBankasi {
    public static void main(String[] args) {
        //Soru 1 :Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

        int[] a = new int[]{12, 5, 8, 13, 20, 30, 60, 2};
        Arrays.sort(a);
        if (a.length % 2 != 0) {
            Integer ortadakiEleman = a.length / 2;
            System.out.println("ortadakiEleman = " + a[ortadakiEleman]);
        } else {
            Integer ortadakiElaman = a.length / 2;
            Integer orta = (a[ortadakiElaman] + a[ortadakiElaman - 1]) / 2;
            System.out.println(orta);
        }
        //Soru 2:  String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli", "Can"};
        int min = b[0].length();

        for (String w : b) {
            min = Math.min(min, w.length());
        }
        for (String w : b) {
            if (min == w.length()) {
                System.out.println(w);
            }

        }
        //soru 3:Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int[] k = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(k);
        Integer minPozitif = k[k.length - 1];
        Integer maxNegatif = k[0];
        for (int w : k) {
            if (w >= 0) {
                minPozitif = Math.min(minPozitif, w);

            }
            if (w < 0) {
                maxNegatif = Math.max(maxNegatif, w);

            }
        }
        System.out.println("maxNegatif = " + maxNegatif);
        System.out.println("maxPozitif = " + minPozitif);


        //Soru4 :String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        String[] c = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Jackson", "Veli"};
        String isim = "";

        for (String w : c) {
            if (w.endsWith("n") || (w.endsWith("k"))) {
                isim = isim + w.substring(0, 1);
            }
        }
        System.out.println(isim);

        //Soru5:String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String[] r = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int toplam = 0;

        for (String w : r) {
            toplam = toplam + w.length();

        }
        System.out.println("toplam =" + toplam);

        //Soru 6:Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        String s = "Apex is an object oriented programming language";
        String[] arr = s.split("");
        int counter = 0;
        for (String w : arr) {
            if (w.startsWith("a") || w.startsWith("A")) {
                counter++;
            }
        }
        System.out.println(counter);

        //Soru 7:Verilen bir String'deki sesli harf sayısını bulunuz.

        String n = "Apex is an object oriented programming language";
        String[] arr1 = n.toLowerCase().split("");
        int counter1 = 0;

        for (String w : arr1) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter1++;
            }

        }
        System.out.println(counter1);

        //Soru 8 :İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız

        String[] arr2 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int size = arr2.length;
        for (int i = 0; i < size; i++) {
            String ilkKarakter = arr2[i].substring(0, 1);
            String sonKarakter = arr2[i].substring(arr2[i].length() - 1);
            if (ilkKarakter.equals(sonKarakter)) {
                System.out.print(arr2[i] + " , ");
            }

        }
        System.out.println();
        //Soru9: Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız

        String[] arr3 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String q = "an";
        int counter3 = 0;
        for (String w : arr3) {
            if (w.equalsIgnoreCase(q)) {
                counter++;
                System.out.println("var");
                break;
            }else{

            }
        }System.out.println(q + " arrayde yoktur");

        //bu soruya bır daha bak ... hatalı olabılır

        //Soru 10: Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.

        String[] arr4 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        Integer sum=0;
        for (String w : arr4) {
            sum=sum+w.length();
        }
        System.out.println(sum);

        //Soru 11 :Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr5 = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr = new Integer[arr5.length];

        int ilkindex=0;
        int sonindex=arr5.length-1;

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i]!=0){
                brr[ilkindex]=arr5[i];
                ilkindex++;
            }
            else{
                brr[sonindex]=0;
                sonindex--;
            }


        }
        System.out.println(Arrays.toString(brr));

        //Soru12:Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int uzunluk= scan.nextInt();

        int arr8[]=new int[uzunluk];

        System.out.println("girilen array elemanları:" + uzunluk);
        for (int i = 0; i <uzunluk ; i++) {
            arr8[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(arr8));

        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));

        int buyukVeKucuk=arr8[arr8.length-1]-arr8[0];
        System.out.println("en buyuk ve en kucuk deger arasındaki fark" + buyukVeKucuk);





        // soru 13:Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        //konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardı





    }
}