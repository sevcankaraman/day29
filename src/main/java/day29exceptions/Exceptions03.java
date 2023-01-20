package day29exceptions;

import java.io.FileInputStream;//io ==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

     /*
        1)FileNotFoundException ve IOException Compile Time Exception'lardir, yani code'u yazarken hata aliriz.
        2)FileNotFoundException path'in dogrulugu ve dosya'nin varligi ile ilgilidir.
          IOException tum input ve output islemleri ile ilgilidir.
        3)IOException Class, FileNotFoundException Class'in parent'idir.
        4)Istenirse FileNotFoundException yerine IOException da kullanilabilir.
        5)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException altta kullanilmalidir.
     */



    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");

            // dosyayı okumak ıcın yazıyoruz bu kodu:
            int k = 0;
            while ((k=fis.read()) != -1){ //indexOf() method'u olmayan character'ler icin kullanilirsa her zaman "-1" verir.
                System.out.print((char)k);

            }


        } catch (FileNotFoundException e) {
            System.out.println("path is wrong or the file does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("hi!");

        // FileNotFoundException
    }


}
