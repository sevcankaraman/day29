package kendimce_Pratik;

public class Dog extends Mammal {
    private boolean bark = true;

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.bark);
        System.out.println(dog.feed);
        System.out.println(dog.weight);
    }
}
