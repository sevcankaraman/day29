package practice.DTNT.practise07;

public class MyExceptions extends Exceptions{

    static final String str= "Sen Değerlisin";

    public MyExceptions(String str){//2.adım
        super(str);//3.adım
        System.out.println( "oyun oynadı");//8.adım

    }

    public MyExceptions() {
        super(str);


    }
}
