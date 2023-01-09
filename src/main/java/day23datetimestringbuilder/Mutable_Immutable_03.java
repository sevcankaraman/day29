package day23datetimestringbuilder;

public class Mutable_Immutable_03 {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;
        System.out.println(a);
        if (a=="2cfalse") System.out.println("==");
        if (a.equals(("2cflase"))) System.out.println("equals");
        }
    }


