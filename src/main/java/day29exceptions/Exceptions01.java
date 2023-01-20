package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        //Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda casting yapabilir.
        // Ama Non-primitivleri ceviremez.
        //Bunu yapmaya calisirsaniz ClassCastException (Run Time Exception) alirsiniz.

        Object obj = 70;
        String str = "";

        try {
            str = (String) obj;//bırbırıne donusturulemeyecek data tiplerini dönusturmkete ısrar edersenız
            // java "ClassCastException" atar .bu  "run tıme exceptıon"dur
        } catch (ClassCastException e) {
            System.out.println("her data type ı her data type ına cevrılmez");
        }
    }
}