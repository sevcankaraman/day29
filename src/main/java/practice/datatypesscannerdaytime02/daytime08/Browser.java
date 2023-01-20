package practice.datatypesscannerdaytime02.daytime08;

public class Browser {
    public static void main(String[] args) {
        String adresCubugu="Her browserın adres cubugu vardır...";
        Edge edge=new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();
        Edge edge2=new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);


    }
    public void get(){
        System.out.println("browserlar web sayfasına gıder...");
    }
    public void search(){
        System.out.println("browserlar arama yapar...");
    }
    public void sifreKaydetme(){
        System.out.println("browserlar istenildiğinde sifre kaydeder...");
    }



    }


