package day11loops;

public class C03_Tekrar {
    public static void main(String[] args) {

        // interwiew questions
        //String karakterleri teker teker yazdiran;
        //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle = "0grenmek yasamın tek kanıtıdır";

        for (int i = 0; i <cumle.length() ; i++) {    // i<=cumle.length()-1 olarak da calısır
            if(cumle.charAt(i)=='a'){
                break;
            }
            System.out.print(cumle.charAt(i)+" ");
        }

    }
}
