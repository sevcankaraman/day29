package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive:       char    - boolean - byte - short - int     - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplarlar, o yuzden
        // sart degilse Wrapper Class kullanmayi tercih etmeyiz.

        int n=12;//"n" yazıp nokta koyarsanız hiç method göremezsiniz,çünkü " primitiviler"
        //method içermez

        Integer m=12;//"m" yazıp nokta koyarsanız birçok method görursunuz,çünkü " wrapper classlar"
        //method icerir

        byte p=23;
        Byte r=43;

        //example:short data type ının minimum ve maxsimum değerlerinikod yazarak bulunuz

        short max = Short.MAX_VALUE;
        short min= Short.MIN_VALUE;

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        //example:int data type'inin minimum degeri ile byte data type'inin
        // maximum degerinin toplamini bulunuz.

        int intMin= Integer.MIN_VALUE;
        byte byteMax= Byte.MAX_VALUE;

        System.out.println(intMin+byteMax);

        // example : i) primitive int i Wrapper Integer a ceviriniz(Autoboxing)

        int num =22;
        Integer wrapperNum=num;
        System.out.println(wrapperNum);// 22

          //           ii)Wrapper Byte ı primitive byte a ceviriniz(Unboxing)


        Byte k=43;
        byte primitiveK=k;
        System.out.println(primitiveK);

        // example 4 :i)primitive char i Wrapper Character a ceviriniz(Autoboxing)
        //            ii)Wrapper Boolean ı boolena  a ceviriniz(Unboxing)

        char harf = 'a';
        Character wrapperharf= harf;
        System.out.println(wrapperharf);

        Boolean isOld = false;
        boolean isOldWrapper= isOld;
        System.out.println(isOldWrapper);








    }
}
