package day21overloadingstatic;

public class StdRunner {
    public static void main(String[] args) {

         // stdName static oldugundan ,ona ulaşmak için object olusturmadım.
        //Sadece class ismini kullanmak yeterlidir.
        System.out.println("stdName ="+ Student.stdName);

        //age-non static oldugundan ona ulaşmak için object oluşturmak zorundayız
        Student std1 =new Student();
        System.out.println("std1 = " + std1.age);
        
        String initials =Student.getInitial("Tom Cruise");
        System.out.println("initials = " + initials);

     int vowels =std1.countVowels("Tom Cruise");
        System.out.println("vowels = " + vowels);

        // static olanları object ile çağırmak tavsiye edilmez.
        String s=std1.getInitial("Ali Can");
        System.out.println("s = " + s);








    }
}