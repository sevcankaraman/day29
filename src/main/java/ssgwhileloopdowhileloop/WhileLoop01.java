package ssgwhileloopdowhileloop;

public class WhileLoop01 {
    // Kullanicidan bir sayi alin ve
    // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
    //6 1 / 2 / 3 6
    public static void main(String[] args) {
        int input=6;
        int bolen=1;
        int sayac=0;

        while(bolen<=input){
            if (input%bolen==0){
                System.out.println(bolen+" ");
                sayac++;
            }

        }
    }
}
