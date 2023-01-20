package day28exceptions;

public class Exceptions03 {

   // StringIndexOutOfBoundsException==>String de indeks kullanırken sınırların dısına cıkma hatası

    // Stringlerde var olamyan ındeksler kullanıldıgında java StringIndexOutOfBoundsException atar.
    public static void main(String[] args) {
        String s= "Java";
        getCharFromString( s,2);
        getCharFromString( s,4);

    }

    //

    public static void getCharFromString(String s, int idx){

        try {
           char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan ındeks kullanm hatası....."+e.getMessage());

            System.out.println(e.getCause());
            e.printStackTrace();// hatanın seceresını dokuyor

        }


    }
}
