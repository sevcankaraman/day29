package advancepractice.practisedaytime01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {
    public static void main(String[] args) {
        //hipotenus hesaplayan kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen 1. dik kenar uzunlugunu gırınız");
        int a=input.nextInt();
        System.out.println("lütfen 2. dik kenar uzunlugunu gırınız");
        int b =input.nextInt();
        
        double hipotenus=Math.sqrt(a*a+b*b);
        System.out.println("hipotenus = " + hipotenus);
        
    }
}
