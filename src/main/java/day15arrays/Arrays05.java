package day15arrays;

import com.beust.ah.A;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //example 1: String Array elemanlarının uzunluklarına göre kucukten buyuge sıralayınz.
        // //        ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[]={"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));

        //Example 2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
//          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas","Cüneyt" "Ajda", "Tom"]

        String brr[]={"Michael", "Ajda", "Thomas", "Tom","Cuneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3://Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        ////           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        ////          ["Michael", "Ajda", "Reyhane", "Gabriel", Thomas,"Tom", "Ali", "Cin", "Cem"]
        ////          [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]
        //         { "Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin", "Cem" };

        String crr[]={ "Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Tom", "Ali", "Cin","Cuneyt", "Cem" };
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //burdaki arr comparator'u sort kismindan cektik
//yukardaki kodun son kisminda ise string'e gir lenght'ini al dedik
//::==> bunun anlami "method referance" yani bir metodu kullan
//::==>bununla birlikte farkli methodlarda kullanabiliriz
//:: ==> kutuphanenin kapisini aciyor
//karakter sayilarina gore siralayacagimiz icin comparator.int kullandik
//comparator ==> karsilastir demek


        //fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
//fonctional programing==lampda
//reversed==> buyukten kucuge diz
//thencomparing==> iceri gir iceriyi de duzenle
//Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
// hem buyukler hemde kucukler icin ayri ayri siralama yapti

    }
}
