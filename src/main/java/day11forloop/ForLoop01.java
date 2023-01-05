package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {

        //example1 : verilen bir stringte ilk a harfinden onceki tüm karakterleri konsola yazdırınız.
        // I love Java ==> I love J

        String s= "I love Java";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (ch=='a'){
                break;

            }
            System.out.print(ch);
        }
        System.out.println("");

        //EXample 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
//                   "Germany" ==> yn
        String t="Germany";

        for(int i=t.length()-1;i>=0;i--){
            char ch= t.charAt(i);
            if( ch =='a'){
                break;
            }
            System.out.print(ch);


        }


    }
}
