package day20passbyvalueoverloading;

public class MethodOverloading01 {

    //*****************INTERWIEW DE SORULUR****************************

    // 1) Method Overloadıng yaparken method ısmı değiştirilmez.
    // 2) Method Overloadıng yaparken parametreler değiştirilir.
    //       i) Parametre değiştirirken , parametrelerin data type'ları değiştirilebilir.
    //      ii) Parametre değiştirirken, "parametrelerin data type'ları farklı ise" yerleri değiştirilebilir.
    //     iii) Parametre değiştirirken, parametrelerin sayısı değiştirilebilir.
    // 3) Java için "ismi" ve "parametreleri" aynı olan iki method tamamıyla aynıdır.
    //    Bu yüzden "ismi" ve "parametre" "method signature" olarak adlandırılır.
    // 4) Method Overloading oluştururken "return type" ı değiştirmenin hiçbir etkısı yoktur
    //    Method Overloading oluştururken "Access Modifier ı "değiştirmenin hiçbir etkısı yoktur
    //    Method Overloading oluştururken "Method Body i "değiştirmenin hiçbir etkısı yoktur
    // 5) "Private" methodlar Overload edilebilir.Çünkü method Overloading sadece bir class ın içide olur
    //     "private" olamak ise baska classlara gidildiğinde problem olusturur.
    // 6) "Static" methodlar Overload edilebilirler.



    public static void main(String[] args) {
       // method overloading=  aynı isimde farklı işler yapan methodlar olusturmak

        add(3,5);


    }

    public static void add(int a, int b){// add(int a, int b){ bu kısım "method ımzasıdır"
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c ){
        System.out.println(a+b);
    }
}

