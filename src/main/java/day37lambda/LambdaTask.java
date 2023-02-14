package day37lambda;

public class LambdaTask {
    /*
    Stream içindeki veriyi tek tek tüketmekiçin oluşturulmuş bir yapıdır.
   **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
    artık kullanılamayacağı anlamına gelir.


    Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


    Collect:
    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
    veri yapısına dönüştürmek için kullanılır.


            Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayan


    Distinct:
    Stream içerisinde bulunan ve tekrar eden elemanlar varsa
    bunları distinct metodu ile çıkartabilir ve
    elimizde tekrar etmeyen birbirinden farklı
    elemanlar barından bir veri setimiz kalır


    Sorted:
    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
            2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
    İkinci formatı ise Comparator arayüzünden türediği için
    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



    reduce : indirgeme demektir.
    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
    bir sonraki elemanla işlemle tutulur


    Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
    Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
    değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


            NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.


            Limit
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
    sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
    Stream içerisinde dönen çok sayıda veri var
    ancak sen bize şu kadarını göster diyoruz.


            findFirst() => İlk elemanı verir. Bu akışın ilk elemanını açıklayan bir
    İsteğe bağlı veya akış boşsa boş bir İsteğe bağlı döndürür.
    Akışın karşılaşma sırası yoksa herhangi bir öğe iade edilebilir. Optional return eder.


    // Arraylerde Stream kullanabilmek icin 2 yol vardir

  1) Stream <Integer> isim=StreamOf(cevrilecek olan)
  2) Arrays.stream(arr).


    Count
    Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.


    split() => Bu String öğesini verilen normal ifadenin eşleşmelerine böler.
    Bu yöntem, iki bağımsız değişkenli bölünmüş yöntemi verilen ifade ve sıfır
    sınır değeriyle çağırır gibi çalışır.
    Sondaki boş dizeler bu nedenle sonuç dizisine dahil edilmez.

            Comparator => bir Class'tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
            Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
    sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
    Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
    sırasını kontrol etmek veya doğal sıralaması olmayan
    nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

            reverseOrder() => Comparator Class'ının bir methodudur.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
            comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.


    skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından
    oluşan bir akış döndürür.
    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
    Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.

     */
}