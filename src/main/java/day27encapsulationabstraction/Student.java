package day27encapsulationabstraction;

public class Student {
    private  String stdId ="AC123";
    private double gpa=3.99;
    private boolean poor=true;

    public String getStdId(){
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    // Encapsulation yapilmis dataların  degeri değiştirilebilri mi?
    //set methodlar (setter) encapsule edilmiş dataların degerlerını değiştirmemıze yarar.
    //set methodlar (setter) her zaman "public" olur.
    //set methodlar (setter)ların return type ı her zaman voıd olur
    //set methodlar (setter) isimleri "set + variable name" seklinde olur.
    //set methodlar (setter)variable ile aynı data type ında parametre kullanılırlar
    //set methodlar kalıbı degıstırmez objeyı değiştirirler.

    //Getter ve setterların ıkısıne bırden "java beans" denır

    //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    //Encapsulation yapilmis datayi okuyabilirmiyiz?
    //get methodlar(getter) encapsulation(saklanmis) edilmis datayi okumamiza yarar
    //get methodlar(getter) her zaman "public" olur.
    //get methodlar (getter) return type`i variable ın data type ile ayni olur.
    //get methodlar (getter) isimleri get+variable name seklinde olur
    //get methodlar (getter) isimleri variable boolean ise "is + variable name"
    // seklinde olur.
    //get methodlar (getter) methodlar parametre kullanmazlar.
    //







    //Encapsulation is a data hiding= datayı saklamak denir.
    //datayı nasıl saklarız?
    // access modifierını private yaparım boylelıkle data saklanmıs olur
/*

    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
    Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
    Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
    icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
    Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
    What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
    offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
    Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
    Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.

   Encapsulation faydası;
  1. guvenlık..saklamazsak dısardan etkıler data yı bozabılır.
  2. dıkkatı dagılır..odak dagınıklıgının onune gecer

    */





}
