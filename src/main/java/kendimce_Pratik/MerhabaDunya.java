package kendimce_Pratik;

public class MerhabaDunya {
    public static void main(String[] args) {

        String t = "Merhaba Dünya!";


        int sonAHarfi = t.lastIndexOf('a');
        String b ="";

        for (int i = t.length()-1; i >sonAHarfi ; i--) {

            b = b+t.charAt(i);
        }
        System.out.println(b);


    }
}
