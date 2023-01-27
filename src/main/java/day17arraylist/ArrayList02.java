package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class  ArrayList02 {
    public static void main(String[] args) {

        //ArrayList olustuturken sag tarafa Array List yazmak zorundasınız.
        //Ama sol tarafa ister "ArrayList" yazın isterseniz de "List"yazın ikiside calısır

        List<Character> initials=new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

      //  Array--->length()
      //  List--->size()

        //Bir List'te kac eleman oldugunu nasil anlariz? size methodu
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4
        // Bir Listten istenen bir eleman nasıl alınır? get methodu
        char u =initials.get(2);
        System.out.println(u);

      //Example=  verilen bir string listteki tüm elemanların toplam karakter sayılarını bulan kodu yazınız.

        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.yol: bu tavsiye edılır. recommend

        int sum=0; //
        for(String w:cities){
            sum=sum+w.length();
        }
        System.out.println(sum);//26


//2.YOL:
        int toplam = 0;
        for (int i=0; i< cities.size(); i++){
            toplam = toplam + cities.get(i).length();
        }
        System.out.println(toplam);//26

        //Bir Lİst teki istenen bir elemanı nasıl değiştirebiliriz.? set methodu


        cities.set(0,"New York");
        System.out.println(cities);

        //Example 2: Maas list i olusturunuz ve maaslara yuzde 20 zam yapınız

        List<Double>salary=new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);//[19500.25, 8500.75, 32500.5]

        //1.yol
        int idx = 0; // for each de ındex olmadıgı ıcın ==>int idx=0; olusturduk
        for (Double w : salary){
            salary.set(idx, w*1.20);
            idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

        //2.yol
        for (int i = 0; i <salary.size() ; i++) {
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);
    }
}





