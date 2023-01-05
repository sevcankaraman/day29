package practice.datatypesscannerdaytime02.nighttime02;

public class C02_MethodCreation_NigtTime {

    public static void main(String[] args) {

        System.out.println("dikdörtgeninAlani=" + dikdotgenAlani(10, 10));

        System.out.println("dikdotgeninCevresi="+ dikdotgeninCevresi(10,10));

    }

    public static int dikdotgenAlani(int a, int b) {
        return a * b;

    }

    public static int dikdotgeninCevresi(int a, int b) {

        return 2 * (a + b);
    }
}