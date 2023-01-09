package day23datetimestringbuilder;

public class StrigBuffer01 {
    /*
    String olusturmak ıcın String Class, StringBuılder Class ve StringBuffer kullanılabılır

    1) StringBuffer Java'nın String uretmek için olusturdugu ilk class dır.java 5 te uretılmıstır
    2)String Buffer "synchronized" dir,StringBuılder "synchronized" değildir
    3)String Buffer "thread-safe"(multi - thread'e uygun) dir,StringBuılder "thread-safe" değildir
    4)String Buffer ve StringBuılder ikisi de mutable dir

    Note1: İnmutable string lazım oldugunda String Class kullanırız
    Note2: Mutable String lazım oldugunda StringBuılder veya StringBuffer kullanırız
    Note3: StringBuffer "Multithread" ve "Synchronization" lazım oldugunda tercih edılır
           StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edılır
     */

    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);
        System.out.println(sbf.capacity());

    }

}
