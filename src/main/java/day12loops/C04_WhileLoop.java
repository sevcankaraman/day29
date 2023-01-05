package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //3 ten 10 a kadar tam sayılaarı aynı satıra yazdıran kodu yazınız
        //1.yol
        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");
        }
        //2.yol
        System.out.println();

        int i = 3;//baslangıc degeri

        while ((i<11)){//bitiş değeri
            System.out.print(i+" ");
            i++;//arttıma while loop un {} içinde

        }
        //example : 17 den 4 e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yaznız
        System.out.println();

        int k=17;
        while (k>3){
            if(k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
    }
}
