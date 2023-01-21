package day05typecastinstringmanipulations;

public class SwapValues {

    // Swap: Yer değiştirmek.1.kapta patates var2.kapta domates var.==>1.kapta domates var
    // 2.kapta patates
    public static void main(String[] args) {

        int a=12;
        int b=5; //Swaptan sonra bu olmalı a=5 b=12 (interwiew sorusu)
        int temp=0;

        System.out.println("a:"+a);//12
        System.out.println("b:"+b);//5

        //1.yol:
        //1.adım:
        temp=a;

        //2.adım:
        a=b;

        //3.Adım:
        b=temp;

        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

        //2.Yol: (intervievde bu yolu isterler)

        int x=12;
        int y=5;

        x=x+y;//12+5=17
        y=x-y;//17-5=12
        x=x-y;//17-12=5

        System.out.println("x"+x);
        System.out.println("y"+y);


    }
}
