package day18arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        //******** INTERWIEW SORUSU***************
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        System.out.println("nums = " + nums);

        int minDiff=nums.get(1)-nums.get(0);

        for (int i = 1; i <nums.size() ; i++) {   //burda i yi 1 den baslattık cunku cıkartmaya 1. indexten basladık.
                                                     // farkı bulmak için bu sekılde yaptık.
                                                     // yanı 2. elemanla işleme basladığımız için
           minDiff= Math.min(minDiff, nums.get(i)- nums.get(i-1));
        }
        System.out.println("minDiff = " + minDiff);

        for (int i = 1; i <nums.size() ; i++) {
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i)+ " and " +nums.get(i-1));
            }
        }
    }
}
