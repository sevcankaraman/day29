package advancepractice.practisedaytime06_yasinhoca.practise04;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {
        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        double toplam=0;
        for (int w : arr) {
            toplam+=w;
        }
        System.out.println("toplam ="+toplam);

        double ortalama=toplam/arr.length;
        System.out.println("ortalama = " + ortalama);

        System.out.print("ortalamadan buyuk elemanlar =  ");

        for (int w : arr) {
            if (w>ortalama){
                System.out.print( w+" ");
            }
        }
    }
    }

