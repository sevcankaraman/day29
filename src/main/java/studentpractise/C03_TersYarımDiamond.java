package studentpractise;

public class C03_TersYarımDiamond {
    /*
      1 2 3 4 5 6
       2 3 4 5 6
        3 4 5 6
         4 5 6
          5 6
           6

     */

    public static void main(String[] args) {
        for (int satir = 1; satir <=6 ; satir++) {
            for (int bosluk = 0; bosluk <satir ; bosluk++) {
                System.out.print(" ");
                
            }
            for (int sayi = satir; sayi <=6 ; sayi++) {
                System.out.print(sayi+ " ");
                
            }
            System.out.println();
            
        }
    }

    
}
