package kendimce_Pratik;

public class Constructor_Calisma2 {
    public static void swing(){
        System.out.println("swing");
    }
    public static void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        climb();

    }

    public static void main(String[] args) {
        Constructor_Calisma2 s1=new Constructor_Calisma2();
        s1.play();
        Constructor_Calisma2 s2=null;
        s2.play();

    }

}
