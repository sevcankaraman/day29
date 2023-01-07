package practice.DTNT;

public class StaticMember { //StaticUyeler

        //Ekran Ciktisi Nedir?
        static int x;
        int y;
        StaticMember(){//constructor
            x+=10;
            y++;
        }//const
        public static int karesiniAl(){
            return x*x;
        }
        public static void main(String[] args) {
            practice.DTNT.StaticMember sm1 = new practice.DTNT.StaticMember();
            practice.DTNT.StaticMember sm2 = new practice.DTNT.StaticMember();
            int z=sm1.karesiniAl();
            System.out.println("-x "+z+" -y"+sm2.y);//-x 400 -y1

        }//main


    }//class


