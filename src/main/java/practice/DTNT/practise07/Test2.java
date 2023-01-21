package practice.DTNT.practise07;

public class Test2 {
    String str = "a";
    void a() {//3.adım
        try {
            str = str + "b";//4.adım
            b();//5.adım
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void b() throws Exception {//6.adım
        try {
            str = str + "d";//7.adım
            c();//8.adım
        } catch (Exception e) {//11.adım
            str = str + "e";//12.adım
        } finally {//13.adım
            str = str + "f";//14.adım
        }
        str = str + "g";
    }
    void c() throws Exception {//9.adım
        System.out.println(12/0);//10.adım
    }
    void display() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test2 object = new Test2();//1.adım
        object.a();//2.adım
        object.display();//abdefg
    }
}
