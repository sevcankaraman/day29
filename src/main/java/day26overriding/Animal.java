package day26overriding;

public class Animal {
    /*
    1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding " yapmak denir.
    2)Overriding 'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
    3)Override ==> Override annotation :Override kurallarinin Java tarafindan kontrol edilmesini saglar.
    4)Overriding 'de parent Class'daki method'a "Overridden Method", child class'daki method'a ise
    "Overriding Method" denir.
    5) private methodlar override edilemezler
    6)Child Class'daki override edilmis method(Overriding Method)'un access modifier'i Parent Class'daki override
     edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
    7)child class da override edilen methodun(overrriding method) return type ı methodun retun ettıgı data type'ının
      aynısı veya o data type ının parent ı olarak secilebilir.
    8)methodun return type ı primitive ise overriding yaparken return type değiştirilemez.çunku return type ya
      aynı olur veya parent dan secılır.ama primitiveler arasında parent child ilişkisi olmadıgından parenttan secmek
       mevzu bahıs olamaz.o zaman tek secenek aynısı olmalıdır kalır
    9)Method un return type ı wrapper class ıse overriding yaparken return type değiştirilemez. cunku return type ya
       aynı olur veya parent dan secılır. ama java bır wrapper class ı diğerının parent ı yapmadıgından parent dan
       secme ıhtımalı yoktur. geriye sadece aynısı olma ıhtımalı kalır.
    10)Methodun return type voıd ıse overrıdıng yaparken return type değiştirilemez.
    11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

     12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

     13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz




    14)"final" methodlar ve "statıc" methodlar overrıde edılemezler..
       main method lar override edilemezler cunku statictir.
    15) "override" yapabılmek ıcın  "Inharitance" sarttır.baska bır ıfadeyle parent-chıld ilişkisi sarttır.
    16) method overloadıng "compile tıme polymorphism" dır. method overrıdıng "run tıme polymorphısm" dir

    public int add (){}

      Overridden Method ==> protected ise Overriding Method ==> protected + public
      Overridden Method ==> default ise Overriding Method ==> default + protected + public
      Overridden Method ==> private  ise Overriding Method ==> override olmazki accesss modifierı olsunbkz 5. kural
     */
    public void eat(){
        System.out.println("animals eat...");// parent de ki override edilmiş eat() method'una" overriding  Method" denir
    }
    public void drink(){
        System.out.println("animals drink...");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply (int a,int b){
        return a*b;
    }


}
