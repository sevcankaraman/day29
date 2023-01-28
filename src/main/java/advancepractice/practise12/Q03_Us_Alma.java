package advancepractice.practise12;

public class Q03_Us_Alma {
    public static void main(String[] args) {
        //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.




            System.out.println(kuvvetiniAl(5, 2));

        }

        public static double kuvvetiniAl(double taban, int us) {
            double sonuc = 1;

            if(taban==0 && us==0){
                throw  new ArithmeticException("Taban ve us ayni anda 0 olamaz");
            }

            if (us >= 0) {
                for (int i = 0; i < us; i++) {
                    sonuc *= taban;
                }
                return sonuc;
            } else {
                for (int i = 0; i < Math.abs(us); i++) {
                    sonuc *= taban;
                }
                return 1 / sonuc;
            }
        }
    }
