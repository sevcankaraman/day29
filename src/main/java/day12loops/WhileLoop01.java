package day12loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //example 1: 3 ten 6 a kadar tamsayıları konsala yazdırınız.

        //1.yol:for -loop

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        //2.yol: while-loop

        int i = 3;
        while (i < 7) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        //example 2: 23 ten 12 ye kadar cıft tamsayıları konsala yazdırınız.

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();

        //example 3: verilen bir tamsayının rakamları toplamını konsola yazdıran kodu yazınız
        //(interwiew de sorulur)

        //1.yol while - loop
        int num =578;
        int sum=0;
        num=Math.abs(num);
        while(num>0){

            sum=sum+num%10;
            num/=10;
        }
        System.out.println(sum);

        //2.yol for-loop

        int a=6841;
        int toplam=0;

        for( int m=a; m>0 ; m/=10 ){
            toplam=toplam+m%10;

        }
        System.out.println(toplam);

    }
}
