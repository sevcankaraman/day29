package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<Double> half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);

        List<String> list = new ArrayList<>();

        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinc( list);
        System.out.println();
       // printAllSortWithLastCharUpperDistinc(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //removeElementIfTheLengthGreaterThanFive(list);
        System.out.println();
       // removeElementIfStartsWithAorEndsWithd(list);
        System.out.println();
        printLengthSquare(list);
        System.out.println(printElementsLengthEven(list));





    }

    // 1) Create a method to find the half of the elements greaterthan 5,distinc , in reverse order a list.
    //Bir listede 5'ten büyük öğelerin yarısını farklı, ters sırada bulmak için bir yöntem oluşturun.

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz


    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //Example 3: Tum list elemanlarini küçük harfle alfabetik siranın tersinde tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Tum list elemanlarini büyük harfle uzunluklarına gore artan sırada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinc(List<String> list) {
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t -> System.out.print(t + " "));

    }
    //Example 5: Tum list elemanlarini büyük harfle uzunluklarına gore artan sırada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinc1(List<String> list){

        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//t->t.charAt(t.length()-1) => bu ifade lambda expression olarak adlandırılır
                forEach(t-> System.out.print(t + " "));

    }

    public static void printAllSortWithLastCharUpperDistinc2(List<String> list){

        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//t->t.charAt(t.length()-1) => bu ifade lambda expression olarak adlandırılır
                forEach(t-> System.out.print(t + " "));

    }

    //Example 6: Tum list elemanlarini büyük harfle uzunluklarına göre artan sırada tekrarsiz olarak yazdiriniz
    //uzunlukları aynı olan elemanlar alfabetık sırada olsunlar

    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){

        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase) yapısına "method reference denır
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//system outa gıt ordakı println ı kullan dedım

    }

    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz
    // static List<String>removeElementIfTheLengthGreaterThanFive(List<String>list){
      //  list.removeIf(t->t.length()>5);
      //  return list;

    //}
    //Example 8: "A" ile baslayan veya "d" ile biten elemanlari siliniz

    public static List<String>removeElementIfStartsWithAorEndsWithd(List<String>list){
        list.removeIf(t->t.startsWith("A") || t.endsWith("d"));
        //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
        //"removeIf()" methodunda olduğu gibi.

       //Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
       //ulasiriz, distinct() methoduna ulaştığımız gibi.

       // sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz
        return list;
    }

    //Example 9:List elemanlarini karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
   // public static List<Integer>printLengthSquare(List<String>list){
    //    return list.stream().map(t->t.length()*t.length()).collect(Collectors.toList());

  //  }
    //Utils = Kullanilacak Seyler Demek = Bu classin icine tekrar tekrar lazim olacak methodlari koyariz

    public static List<Integer>printLengthSquare(List<String>list){
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());

    }

    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz

    public static List<String>printElementsLengthEven(List<String>list){

            return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
        }
    }
     //UtilsClass tekrar tekrar kullanilacak methodlarda kullanilir
     // tek sefer kullanilacak methodlarda kullanmamiza gerek yoktur.

//Lambda ile kod yazarken once Javanin bize verdigi methodlari method reference icinde
// kullanmamiz tavsiye edilir
//Eger method reference yetmiyorsa Util Class a koyup oradan kullaniriz
//Util tekrar tekrar kullanacagimiz methodlarda kullanilir. Surekli kullanmayacagimiz
// methodlar kullanilarak Util i kalabaliklastirmak iyi degildir
//Birseyi Util'e koydugumuzda bu herkesin isine yarayacak mi diye dusunmeliyiz!!










