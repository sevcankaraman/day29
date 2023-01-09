package practice.DTNT;

public class StaticMember_Tekrar { // Static Uyeler

    // Ekran Cıktısı nedır?

    static  int x;
    int y;
    StaticMember_Tekrar(){
        x+=10;
        y++;

    }//const

    public static  int karesiniAl(){
        return x*x;

    }

    public static void main(String[] args) {

        StaticMember_Tekrar sm1=new StaticMember_Tekrar();
        StaticMember_Tekrar sm2=new StaticMember_Tekrar();

        int z=sm1.karesiniAl();
        System.out.println("-x"+z+"-y"+sm2.y);//-x400-y1

    }//main
}
