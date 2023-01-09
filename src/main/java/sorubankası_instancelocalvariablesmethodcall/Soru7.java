package sorubankası_instancelocalvariablesmethodcall;

public class Soru7 {
    public static void function (float i, int j){
        System.out.println("good");
    }
    public static void function (double i,double j){
        System.out.println("bad");
    }

    public static void main(String[] args) {
        function(1.2,3);
        function(2,3);
        function(2.1F,3.2);
    }

}
