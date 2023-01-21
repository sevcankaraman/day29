package practice.DTNT.practise07;

public class C01_Exceptions {
    //verilen ıkı stringin uzunluk acısından birbirinin kac katı oldugunu veren kodu yazınız

    public static void main(String[] args) {


        double r1= karakterSayisiniKarsilastir("tester","developer");
        System.out.println(r1);

        double r2= karakterSayisiniKarsilastir("tester","");
        System.out.println(r2);

        double r3= karakterSayisiniKarsilastir(null,"sevcan");
        System.out.println(r3);

    }//main


    private static double karakterSayisiniKarsilastir(String str1, String str2) {
        double result=0;

        try {
           result=str1.length()/str2.length();
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("payda sıfır olamaz..." + e.getMessage());

        }    catch (NullPointerException e) {
                System.err.println("length methodu null ile hata verır..."+e.getMessage());

        } finally {
            System.out.println("database ile bağlantı kesılsın...");
        }
        return result;

        //arac cubuklarından=> code=> surround with => try/catch ...
        // veya ctrl + alt+t

    }

}
