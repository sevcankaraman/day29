package day24accessmodifiersinheritiance;

public class OgrenciRunner {

    // myStd.stdId      //default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
    // myStd.accountNumber // ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
    // "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.
    public static void main(String[] args) {
        Ogrenci myOgrenci=new Ogrenci();

    }

}
