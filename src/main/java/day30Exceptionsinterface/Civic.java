package day30Exceptionsinterface;

        /*
        1) Bir interface'i bir Class ın parent'ı yapmak ıcın "impliments" keywordunu kullanırız.
        2) Java parent'lar "Class" oldugunda "mutiple parent" a müsade etmez ama biz bazen "multiple parent" a ihtiyaç duyarız.
           Bu ihtiyacı gidermek için java "interface" ismini verdiği yeni bir yapi olusturdu. bu yapı sayesınde
           bir Class için çoklu interface parent olusturabılırız
         3) Coklu ""interface parent"ların herbirinin içine aynı isimli methodlar koyabiliriz.
            Mesela Ac'nin ,Engine 'in , Security'nin herbirinin içlerine "Run" methodu koymak gıbı.
            Child class herhangi birini override ettiğinde hepsini override etmiş gibi olur sonra da
            body i child class da yazarak uygulamasını yapmıs olur.

        */

       public class Civic implements Ac,Engine,Security {

              @Override
              public void cool() {
                     System.out.println("Civic cools perfectly");

              }

              @Override
              public void run() {
                     System.out.println("Civic runs perfectly");

              }
       }
