package advancepractice.practisedaytime01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C01_Variable_Fahrenheit {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner scanner=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz");
        double f = scanner.nextDouble();
        double c= (f-32)*5/9;

        System.out.println("c = " + c);

        DecimalFormat format=new DecimalFormat("0.00");// vırgulden sonra kac basamak yazılacagını belırtıyoruz
       String formattedCelcius=format.format(c);

        System.out.printf("%.2f",c);// vırgulden sonra kac basak-mak olacagı baska bır yolu
        System.out.printf(" formatlı : "+ "%2.f",c);// boylede oluyor
    }
}
