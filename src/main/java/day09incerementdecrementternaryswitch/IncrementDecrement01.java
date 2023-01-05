package day09incerementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {


      int  a= 5;
        System.out.println(a);
        //incerement1
        a=a+2;
        System.out.println(a);

        int b= 10;
        System.out.println(b);

        b=b+5;
        System.out.println(b);

        b+=5;
        System.out.println(b);

        //decrement
        int c=8;
        System.out.println(c);

        c=c-3;
        System.out.println(c);
        c-=3;

        //increment2:
        int d=6;
        System.out.println(d);

        d=d*2;
        System.out.println(d);

        d*=2;
        System.out.println(d);

        //decrement2

        int e=24;
        System.out.println(e);

        e=e/2;
        System.out.println(e);

        e/=2;
        System.out.println(e);

        // 1 ile incerement

        int f=12;

        //f=f+1;
        //f+=1;
        f++;

        //1 ile decrement

        int h=10;
        //h=h-1;
        //h-=1;
        h--;

        //post incerement ve pre increment

      int i = 10;
      int k = i++;// post-increment cunku increment, variable'in isminden sonra yazildi

      System.out.println(k);//10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
      System.out.println(i);//11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur.

      int m = 15;
      int n = ++m;// pre-increment cunku increment, variable'in isminden once yazildi

      System.out.println(m);// 16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.
      System.out.println(n);// 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n" nin degeri 16 olurint i=10;

      int p = 17;
      int r = p--;
      System.out.println(p);//16
      System.out.println(r);//17

      int s = 20;
      int t = --s;
      System.out.println(s);//19
      System.out.println(t);//19




























    }

}
