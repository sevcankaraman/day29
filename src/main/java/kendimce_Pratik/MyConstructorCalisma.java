package kendimce_Pratik;

public class MyConstructorCalisma {
            int x=3;
            int y=5;

             MyConstructorCalisma(){
                 x+=1;

                 System.out.println("-x"+ x);

             }
             MyConstructorCalisma(int i){
                 this();

                 this.y=i;
                 x+=y;

                 System.out.println("-x"+ x);
             }
             MyConstructorCalisma(int i, int i2){
                 this(3);

                 this.x-=4;

             }

    public static void main(String[] args) {
        MyConstructorCalisma j1=new MyConstructorCalisma(4,3);

    }





    }

