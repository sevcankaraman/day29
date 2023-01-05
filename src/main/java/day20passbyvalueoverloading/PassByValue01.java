package day20passbyvalueoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        double shirt = 100;
        double studentShirtPrice=discount("student",shirt);
        double veteranShirtPrice=discount("veteran",shirt);
        double seniorShirtPrice=discount("senior", shirt);


        System.out.println("discount(\"student\",shirt) = " + discount("student", shirt));
        System.out.println("discount(\"veteran\",shirt) = " + discount("veteran", shirt));
        System.out.println("discount(\"senior\",shirt) = " + discount("senior", shirt));
        System.out.println("shirt = "+shirt);

        shirt=discount("veteran",shirt);
        System.out.println("shirt = "+shirt);


    }

    public static double discount(String state, double price) {
        switch (state) {
            case "student":
                price = price * 0.90;
                break;

            case "veteran":
                price= price * 0.80;
                break;
            case "senior":
                price =price * 0.95;
                break;
            default:
                return price;


        }
        return price;
    }}