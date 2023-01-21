package practice.DTNT.practise07;

import static practice.DTNT.practise07.MyExceptions.str;

public class RunnerExceptions {

    public static void main(String[] args) {


        MyExceptions my =new MyExceptions(str);//1.adım

        try {//9.adım
            int x=100, y=5;//10.adım
            float  ortalama = ((float)x/y);//11.adım
            if (ortalama<50){//12.adım
                throw new IllegalArgumentException("ORTALAMA ÇOK DÜŞÜK");//13.adım
            }
        } catch (Exception e) {//14.adım
            System.out.println("SORUNUN KAYNAĞI NE ==>"+e.getMessage());//15.adım
            e.printStackTrace();
        } finally {
            System.out.println(str);
        }


    }
}