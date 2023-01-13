package day24accessmodifiersinheritiance;

public class Ogrenci {

    //name herkes tarafından bılınebılır , o yuzden "public" yaptım
    public String name="Tom Hanks";
   // Student ıd okul yonetımındekı ınsanlar tarafından bilinebilir , o yuzden "default "yaptım
    String stdId="TH2023HU12001";
    // account number ben, esim ve cocuklarım tarafından bılınebılır o yuzden "protected" yaptım
    protected int accountNum=765895456;
    //hesabımdakı para mıktarı sadece benım tarafımdan bılınebılır o uzden "private" yaptım
    private int balance =123000;

     /*
                1)Access modifier'lar genis'den dara; public > protected > default > private
                2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
                3)Access Modifier'lar ne ise yarar?
                        Variablelara methodlara classlara ulasmayi duzenler.
                4)Kac tane access modifier var ?
                        public > protected > default > private
                        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
                        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
                        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
                        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
                        v) "protected" ile "default"un farki nedir ?
                           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
         */
}
