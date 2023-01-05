package day15arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        // bir arrayın içerisinde  her hangi bir elemanın olup olmadıgını kontrol
        // eden ve kaç kere tekrarlandıgını gösteren kodu yazınız

        int arr[] = {5, 1, 5, -3};
        int eleman=90;
        int sayac=0;
        for (int w : arr) {
            if (w==eleman){
                sayac++;
            }//if

        }//for

        if (sayac>0){
            System.out.println(eleman + " Arrayde " +sayac+ "defa var");
        }else
            System.out.println(eleman + " Arrayde yok");
    }
}
