package day30Exceptionsinterface;

public class Exceptions03 {

    /*
 1)Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Class" larinizi olusturabilirsiniz.
 2)Olusturdugunuz "Exception Class" lar;
   i)Compile Tile Exception
   ii)Run Tile Exception olabilir.
 3)"Compile Tile Exception" olusturmak icin class'inizin parent'i "Exception Class" olmalidir.
 4)"Run Tile Exception" olusturmak icin class'inizin parent'i "RuntimeException Class" olmalidir.
 5)Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
*/
    public static void main(String[] args) {

        getStudentGrade(87);

        getTheNumberOfStudents(-45);

    }

    public static void getStudentGrade(int grade){
        if(grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudents(int numOfStudents){

        if(numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            }catch(InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(numOfStudents);
        }
    }

}
        /*
            Bazen kendi exception'imizi kendimiz uretiriz.
            Neden oyle bir seye ihtiyac duyariz?
            Normalde Java kendisi bir suru "exception" uretmistir. Java kurallari bildigi icin, olabilecek hatalarla
            ilgili exception uremistir.
            Java bu noktada hata yapmamizi engelliyor.
            Exceptionslar kirimizi isiklar gibidir java kurallar kurar o kurallar disina cikmamizi engeller.

            Ama kendimiz app olustururken javanin uretttiginin disinda kurallara ihtiyacimiz olabilir.
            (Okul app deki double note gibi negatif ve >100 olmamamli)
            Bu durumlar icin biz kendimiz exception olustururuz.

 */

