package day16multidimensionalarrays;

public class C04Md_Tekrar {
    public static void main(String[] args) {
        //Bir multidimensional array deki
        // en buyuk ve en kucuk elemanin
        // toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {83, 75}};
        int maxElement=arr[0][0];//2
        int minElement=arr[0][0];

        for (int[] w : arr) {
            for (int i : w) {
                maxElement=Math.max(maxElement,i);
                minElement=Math.min(minElement,i);
            }
            System.out.println(maxElement+minElement);
        }

    }
}
