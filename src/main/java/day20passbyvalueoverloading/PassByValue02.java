package day20passbyvalueoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

        String name= "Tom Hanks";
        String updateName=updateName(name,"Jr.");

        System.out.println(name);//Tom Hanks
        System.out.println(updateName);//Tom Hanks Jr.

        name=updateName(name,"Jr.");
        System.out.println(name);//Tom Hanks Jr.


    }

    public static String updateName(String name,String add){ // bu method ismi değiştirecek

        name=name+" "+add;
        return name;


    }
}
