package mini_projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();


    public void showMenu() {
        System.out.println("====TECHPROEDUCATION====");
        System.out.println("1-Üye Ol ");
        System.out.println("2-Giriş Yap ");
        System.out.println("3-Çıkış ");
        System.out.println("Seçiminiz: ");


    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad - Soyad ");
        String adSoyad = scanner.nextLine();

        String username;
        boolean existUsername;

        do {
            System.out.println("Kullanıcı adını gırınız");
            username = scanner.nextLine();
            existUsername = usernameList.contains(username);
            if (existUsername) {
                System.out.println("Bu username daha once kullanılmıstır. Yeni bir username deneyiniz..");
            }

        } while (existUsername);

        String email;
        boolean isValid; //isvalid uygun mu demek
        boolean existEmail;
        do {
            System.out.println("email giriniz");
            email = scanner.nextLine().trim();
            isValid =validateEmail(email);

                    existEmail = emailList.contains(email);

            if (existEmail) {
                isValid = false;
                System.out.println("Bu email daha once kullanılmıstır. Yeni bir email deneyiniz..");
            }


        } while (!isValid);

        String password;
        boolean isValidPsw;
        do {
            System.out.println("sifre giriniz");
            password=scanner.nextLine();
            isValidPsw=validatePassword(password);




        }while(!isValidPsw);

        User user=new User(adSoyad,username,email,password);
        usernameList.add(username);
        emailList.add(email);
        passwordList.add(password);

        System.out.println(user);
        System.out.println("tebrikler kayıt işlemınız gerceklesmiştir");
        System.out.println("kullanıcı adı veya email ve  sifre ile sisteme giriş yapabilirsiniz");


    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanıcı adı ve pass word giriniz");
        String usernameOrEmail = scanner.nextLine();

        boolean isMail = emailList.contains(usernameOrEmail);
        boolean isUsername = usernameList.contains(usernameOrEmail);

        while (true) {


            if (isMail || isUsername) {
                System.out.println("şifrenizi giriniz");
                String password = scanner.nextLine();

                int idx;
                if (isUsername) {
                    idx = usernameList.indexOf(usernameOrEmail);

                } else {
                    idx = emailList.indexOf(usernameOrEmail);

                }

                if (passwordList.get(idx).equals(password)) {
                    System.out.println("Sisteme giriş yaptınız");
                    break;

                } else {
                    System.out.println("Sifreniz yanlıs. Tekrar deneyiniz.");
                }

            }


        }
    }
    public static boolean validateEmail(String email) {
        boolean isValid = false;
        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("email boşluk iceremez");
            isValid = false;

        } else if (!isContainAt) {
            System.out.println("email '@' içermelidir.");
            isValid = false;

        } else {
            String firstPart=email.split("@")[0];
            String secondPart=email.split("@")[1];

            boolean checkStart=firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
            boolean checkEnd=secondPart.equals("gmail.com") ||
                             secondPart.equals("yahoo.com") ||
                             secondPart.equals("hotmail.com");

            if (!checkStart){
                System.out.println("Email kucuk harf, buyuk harf, rakam ve _.- dısında karakter içeremez ");
            }else if(! checkEnd){
                System.out.println("gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
            }
            isValid=checkEnd && checkStart;


        }
        return isValid;
    }
    public static boolean validatePassword(String password){

        boolean isValid;

        boolean space =password.contains(" ");
        boolean lengthGt6=password.length()>=6;
        boolean existUper=password.replaceAll("[^A-Z]","").length()>0;
        boolean existLower=password.replaceAll("[^a-z]","").length()>0;
        boolean existDigit=password.replaceAll("[\\D]","").length()>0;
        boolean existSymbol=password.replaceAll("[\\P{Punct}]","").length()>0;

        if (space){
            System.out.println("sifre boşluk iceremez");

        }else if (!lengthGt6){
            System.out.println("sifre en az 6 karakter içermelidir");
        }else if (!existUper){
            System.out.println("sifre en az buyuk harf içermelidir");
        } else if (!existLower) {
            System.out.println(" sifr en az 1 kucuk harf içermelidir");
        } else if (!existDigit) {
            System.out.println("sifre an az 1 rakam içermelidir");
        } else if (!existSymbol) {
            System.out.println("sifre en az 1 sembol içermelidir");
        }
        isValid=!space && lengthGt6 && existUper && existLower && existDigit && existSymbol;

        if (!isValid){
            System.out.println("tekrar deneyiniz");
        }
        return isValid;


    }
}
