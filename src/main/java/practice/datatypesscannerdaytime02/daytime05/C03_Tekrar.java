package practice.datatypesscannerdaytime02.daytime05;

import java.util.Arrays;

public class C03_Tekrar {
    public static void main(String[] args) {
        /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.==>trim
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir

        */

        String str="Kemal Can Kuzu";
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

    }
}
