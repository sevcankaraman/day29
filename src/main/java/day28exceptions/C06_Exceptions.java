package day28exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

        //String i ineger a cevırınız; İnteger i character sayısına bölünüz


        divideString(null);

    }

    public static double divideString(String str){
        int length=str.length();// nullPoınterException
        int length2=str.length();// numberFormatException
        int length3=str.length();// AritmetikException

        int i=0;
        double sonuc=0;


        try {
            length=str.length();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        i=Integer.valueOf(str);
        sonuc=i/length;
        return  sonuc;


    }
}
