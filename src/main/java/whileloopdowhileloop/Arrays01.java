package whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a=12; //bu yapının ıcınde sadece bır tane data depolanabılır.
        //ama biz code yazarken bir yapının ıcınde coklu data depolama ihtiyacı hıssederiz.
        //bir yapının ıcınde coklu data depolamak ıcın java"array" yapısını olusturmustur.

        /*
           IT'de yeni bir sey ogrenirken;
    i) "Ne? Nedir?" oldugunu ogren
    ii) "Neden var? Nicin var?" oldugunu ogren
    iii) "Simple Implementation - Basit Uygulama"
         "Mid-Level Implementation - Orta Duzey Uygulama"
         "Advance-Level Implementation - Ileri Duzey Uygulama"
         "Project-Level Implementation - Proje Duzeyinde Uygulama"
    yapmak lazim.

    Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi

 */


        //Array nasıl olusturulur?
        //Array olusturumak ıcın Array elemanlarının data tıpı ve eleman sayısı mutlaka yazılmalıdır.

        String stdNames[]=new String[5];

        //Array konsola nasıl yazdırılır.
        //toString methodunu kullanmadan sadece array ısmı ıle yazdırırsanız java o arrayın adresini yazdırır.

        System.out.println(Arrays.toString(stdNames));//[null null null null null]

        //Array a eleman ekleme nasıl yapılır?

        stdNames[2]="Ajda";
        stdNames[0]="cuneyt";
        stdNames[1]="kemal";
        stdNames[3]="ezel";
        stdNames[4]="besir";

        //Array dan spessifik bir elemanı almak.

        System.out.println(stdNames[2]);

        //example: Array dekı her elemanı sonuna unlem "!" işareti koyarak ekrana yazdırınız

        for (int i= 0; i<stdNames.length ; i++) {
            System.out.println(stdNames[i]+"!");

        }









    }
}
