package practice.datatypesscannerdaytime02.daytime09;

public class AileOdasi extends Otel{
    public static void main(String[] args) {
        AileOdasi musteri2=new AileOdasi();
        musteri2.kahvalti();
        System.out.println("musteri2 wifi ucreti : "+musteri2.wifi(4)+"$");
    }
    @Override
    public void kahvalti() {
        System.out.println("kahvaltınız serpme kahvaltı");

    }
}
