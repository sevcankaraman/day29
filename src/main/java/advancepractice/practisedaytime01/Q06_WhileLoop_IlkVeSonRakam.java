package advancepractice.practisedaytime01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {
    public static void main(String[] args) {
        ////Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bır tamsayı gırınız");
        int sayi= input.nextInt();
        
        //1.yol
        int sonRakam=sayi%10;// sayının son rakamını verır
        System.out.println("sonRakam = " + sonRakam);
        int ilkRakam=sayi;
        while(ilkRakam>9){
            ilkRakam/=10;
            
        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("toplam : " + (ilkRakam+sonRakam));
        
        //2.yol:

        String sayiString=String.valueOf(sayi);
       int strIlkRakam=Integer.parseInt(sayiString.substring(0,1));
       int strSonRakam=Integer.parseInt(sayiString.substring(sayiString.length()-1));
        System.out.println("strSonRakam + İlkRakam = " +(strSonRakam+ilkRakam) );


        
        
        
        
        
    }
}
