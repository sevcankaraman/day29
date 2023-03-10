package practice.datatypesscannerdaytime02.daytime08;

public class Kumanda {
    private  double genislik;
    private  double yukseklik;
    private  double ekranBuyuklugu;
    private  int maxVolume=100;
    private int ses=10;
    private boolean guc;

    public Kumanda(double genislik,
                   double yukseklik,
                   double ekranBuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }//const

    //kanal değiştirme()

    public double kanalDegistirme(int kanal){
        switch (kanal) {
            case 1:
                return 30.50;// A kanalı
            case 2:
                return 50.70;
            case 3:
                return 88.90;
        }
        return 0;
    }
    public  void gucDugmesi (){
        this.guc=!guc;
    }
    public int sesAzaltma(){
        if(ses>0) {
            ses--;
        }
        return ses;

    }//sesazaltma()

    public int sesArttirma() {
        if (ses > maxVolume) {
            ses++;
        }
        return ses;
    }//ses arttırma()


    }


