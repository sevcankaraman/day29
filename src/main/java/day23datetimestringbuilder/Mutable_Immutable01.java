package day23datetimestringbuilder;

public class Mutable_Immutable01 {
    public static void main(String[] args) {

        String str="";
        for (int i = 0; i < 100; i++) {
            str=i+".değer";
            System.out.println(str);

        }
        System.out.println("son değer : "+str);

    }
}
