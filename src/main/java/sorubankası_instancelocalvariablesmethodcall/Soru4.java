package sorubankası_instancelocalvariablesmethodcall;

public class Soru4 {
    public static void main(String[] args) {
        updateWord("John","black");
    }
    public static void updateWord(String s, String t){
        s=s.substring(0,1).toUpperCase()+t.substring(2);
        System.out.println("s = " + s);
    }
}
