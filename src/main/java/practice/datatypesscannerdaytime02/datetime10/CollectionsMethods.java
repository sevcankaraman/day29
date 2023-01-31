package practice.datatypesscannerdaytime02.datetime10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethods {

    // Kullanıcıdan 5 sayıdan olusan
// bir liste isteyin.
// listeyi sirala ve tersten yazdir
// listeyi karıştırin ve yazdırin
// 3'er sağa kaydirin ve yazdırin

    // //maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    //// tüm maksimum sayıların yerine minimum sayıyi yazdir

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());


        }
        System.out.println(arrList);//[5, 6, 7, 8, 3]
      // listeyi sirala ve tersten sırala

        arrList.sort(Collections.reverseOrder());

        System.out.println("tersten arrlist  "+arrList);// arrlist  [8, 7, 6, 5, 3]

        // listeyi karıştırin ve yazdırin

        Collections.shuffle(arrList);// shuffle(arrlist) rastgele karıstır.
        System.out.println("rastegele arrlist " +arrList);

        // 3'er sağa kaydirin ve yazdırin

        Collections.rotate(arrList,3);//rotate arrList verilen listeyi distance mesafe kadar saga kaydırır
        System.out.println("3 er sağa arrlist" + arrList);

       Integer max= Collections.max(arrList);
       Integer min= Collections.min(arrList);
        System.out.println("max "+ max+" "+ "min "+min  );

        Collections.replaceAll(arrList,max,min);
        System.out.println(arrList);

    }
}