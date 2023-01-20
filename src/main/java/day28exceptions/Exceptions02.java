package day28exceptions;

public class Exceptions02 {

    //butun exceptıonlar Class dır
    public static void main(String[] args) {
        String s="1234";
        convertStirngToInt(s);

        String t = "1a2b";
        convertStirngToInt(t);// sayı formatı hatası verır. NumberFormatExceptıon

    }

    // içinde rakamlar dısında character olan bir String'i sayıya cevırmak ıstersenız Java "NumberFormatExceptıon" atar.

 public static void convertStirngToInt(String s){
        int intS =0;
        try {
            intS = Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println("bir string in sayıya donusturubılmek ıcın rakam dısı characgter ıcermemesı gerekır");
            System.out.println(e.getMessage());
        }
        System.out.println(intS+1);

 }

}
