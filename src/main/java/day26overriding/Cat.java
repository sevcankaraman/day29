package day26overriding;

public class Cat extends Mammal {
    public void meow (){
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {// chil de ki override edilmiş eat() method'una" Overriding Method" denir
        System.out.println("Cats eat...");
    }

    @Override // Override  Annotation :override kurallarının java tarafından kontrol edılmesını saglar.
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;

    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }


    //Parrent'daki methodu alip degistirerek kullanmaya "override" denir

    // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
    // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
    // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
    // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

    //override yapıyorsan parantezin ıcıne dokunma
    //override da method ısmıne dokunamazsın
}
