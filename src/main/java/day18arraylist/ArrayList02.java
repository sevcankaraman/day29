package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // interwiew sorusu:
        //Verilen bir list teki elemanları tekrarsız olarak yazdırma.
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println("a = " + a);//a = [2, 3, 2, 2, 5]

        List<Integer> yeniList = new ArrayList<>();

        for (Integer w : a) {
            if(!yeniList.contains(w)){
                yeniList.add(w);
            }
            
        }
        System.out.println("yeniList = " + yeniList);
     
    }
}
