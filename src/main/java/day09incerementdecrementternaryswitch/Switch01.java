package day09incerementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {

        //example 1 : gün isimlerini verince kacıncı gun oldugunu yazdıran kodu yazınız
        //                sunday==>1.....saturday==>7

        String dayName = "Tuesday";

        //1.Yol: if-else
        if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }

        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(1);
                break;
            case "wednesday":
                System.out.println(1);
                break;
            case "thursday":
                System.out.println(1);
                break;
            case "friday":
                System.out.println(1);
                break;
            case "saturday":
                System.out.println(1);
                break;
            default:
                System.out.println("lütfen gecerli bir gun ismi giriniz");
        }
    }
}
