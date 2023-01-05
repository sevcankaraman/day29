package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //example 1 : Verilen bir string te 'a' karakteri hariç tüm karaterleri yazdırınız.
        //            "Madagaskar"=Mdgskr
        //1.yol
        // 1.YOL:
        String s="madagaskar";
        String t = s.replace("a","");
        System.out.println(t);//Mdgskr

        // 2.YOL:
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch!='a'){
                System.out.print(s.charAt(i));//Mdgskr
            }
        }
        System.out.println("");
        // 3.YOL:
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                continue;//continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar

            }
            System.out.print(ch);////Mdgskr
        }

    }

    }
