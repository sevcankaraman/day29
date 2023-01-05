package day11loops;

public class C04_Tekrar {
    public static void main(String[] args) {

         //example 1 :
        // 1 den 100 e kadar 6 ile bölünenler hariç tüm tamsayıları ekrana yazdırın

        for (int i = 1; i <101 ; i++) {
            if(i%6==0){
                continue;

            } System.out.print(i+" - ");

        }
        System.out.println("");

        //interwiew sorusu
        //example 2:
        // size verilen bir stringi ters ceviren kodu yazınız

        String str="bugun hava kapalı";
        String ters="";

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            ters+=harf;

        }
        System.out.println(ters);
    }
}
