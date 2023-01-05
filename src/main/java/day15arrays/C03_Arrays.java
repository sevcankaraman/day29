package day15arrays;

import java.util.Arrays;

public class C03_Arrays {
    //interwiew sorusu ...süleyman hocanın
    //[0,2,3,0,12,0] sıfırları en sona yazdıran kodu  //[2,3,12,0,0,0]
    public static void main(String[] args) {

        int original[]={0,2,3,0,12,0};
        int yeni[]=new int[original.length];//[0,0,0,0,0,0]..stringler de null int lerde sıfır olıur
        int idx=0;

        for (int i = 0; i <original.length ; i++) {//original array için çalıştı
            if (original[i]!=0){
                yeni[idx]=original[i];
                idx++;//bir sonraki indekse gecer
            }


        }
        System.out.println(Arrays.toString(yeni));



    }
}
