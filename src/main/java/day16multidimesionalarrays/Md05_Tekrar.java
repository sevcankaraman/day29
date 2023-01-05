package day16multidimesionalarrays;

public class Md05_Tekrar {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz

        int a[][] = { {2, 5}, {4, 7, 11} };

        int carpim=1;

        for (int[] w : a) {
            for (int i : w) {
                carpim=carpim*i;

            }
            System.out.println(carpim);
        }
    }
}
