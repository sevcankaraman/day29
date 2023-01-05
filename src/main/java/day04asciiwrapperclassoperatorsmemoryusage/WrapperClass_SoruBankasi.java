package day04asciiwrapperclassoperatorsmemoryusage;

import java.nio.ByteBuffer;

public class WrapperClass_SoruBankasi {
    public static void main(String[] args) {

        //1.Soru:

        byte min= Byte.MIN_VALUE;
        short max=Short.MAX_VALUE;
        System.out.println(("max="+max)+("\nmin="+min));
        System.out.println("max ve min toplamı ="+(max+min));

        //2.soru:

        byte sayi1=Byte.valueOf("103");
        short sayi2=Short.valueOf("2351");
        System.out.println(sayi2-sayi1);



    }
}
