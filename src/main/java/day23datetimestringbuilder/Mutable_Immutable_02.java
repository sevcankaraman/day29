package day23datetimestringbuilder;

public class Mutable_Immutable_02 {
    public static void main(String[] args) {
        String str1=new String("sevcan");
        String str2=new String("sevcan");
        System.out.println("new== "+(str1==str2));
        System.out.println("new equlas "+ (str1.equals(str2)));

        String str3="Sevcan";
        String str4="Sevcan";

        System.out.println("klasik== "+ (str3==str4));
        System.out.println("klasik equals "+ (str3.equals(str4)));
    }
}
