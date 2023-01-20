package practice.datatypesscannerdaytime02.daytime08;

public class Edge extends Browser {
    String adresCubugu;

    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu = adresCubugu;
    }
    @Override
    public void search(){
        System.out.println("edge browserlar arama yapar...");
    }
    @Override
    public void sifreKaydetme(){
        System.out.println("edge istenildiğinde sifre kaydeder...");
    }

}
