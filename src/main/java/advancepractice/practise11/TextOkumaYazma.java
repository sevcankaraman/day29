package advancepractice.practise11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:/Users/User/Desktop/HelloWorld.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String satir= bufferedReader.readLine();
        String yeniDosya="";




        while (satir!=null){

            yeniDosya+=satir+ " ==>Satır Kelime Sayısı :  "+satir.split(" ").length+"\n";

            satir=bufferedReader.readLine();

        }
        System.out.println("yeniDosya = " + yeniDosya);
        bufferedReader.close();

        FileWriter fileWriter=new FileWriter("C:/Users/User/Desktop/TechPro.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();

    }

}
