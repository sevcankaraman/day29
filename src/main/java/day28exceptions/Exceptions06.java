package day28exceptions;

public class Exceptions06 {
    public static void main(String[] args) {
        String s="Java";
        getNumberOfChars(s);

        String t="";
        getNumberOfChars(t);

        String u=null;
        getNumberOfChars(u);

    }
    //stringin degeri null oldugunda strıng class dakı bazı methodları kullanamazyız
    // kullanırsak java NullPointerException atar
    public static void getNumberOfChars(String s){

        try {
            int numOfChars = s.length();
        } catch (NullPointerException e) {
            System.out.println("null degerı ıcın bazı methodlar kullanılmaz");
        }

    }
}
