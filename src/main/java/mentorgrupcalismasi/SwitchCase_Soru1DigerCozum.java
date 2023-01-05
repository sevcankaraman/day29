package mentorgrupcalismasi;

import java.util.Scanner;
public class SwitchCase_Soru1DigerCozum {

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("doğdugunuz ay..:");
            int ay=input.nextInt();
            System.out.println("doğduğunuz gun..:");
            int gun= input.nextInt();
            String burc="";
            boolean isError=false;


            switch (ay){
                case 1:
                    if (gun>=1 && gun<=31){
                        if(gun<22){
                            burc="oğlak";
                        }else {
                            burc="kova";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 2:
                    if (gun>=1 && gun<=28){
                        if(gun<20){
                            burc="kova";
                        }else {
                            burc="balık";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 3:
                    if (gun>=1 && gun<=31){
                        if(gun<21){
                            burc="balık";
                        }else {
                            burc="koç";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 4:
                    if (gun>=1 && gun<=30){
                        if(gun<21){
                            burc="koç";
                        }else {
                            burc="boğa";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 5:
                    if (gun>=1 && gun<=31){
                        if(gun<21){
                            burc="boğa";
                        }else {
                            burc="ikizler";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 6:
                    if (gun>=1 && gun<=30){
                        if(gun<22){
                            burc="ikizler";
                        }else {
                            burc="yengec";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 7:
                    if (gun>=1 && gun<=31){
                        if(gun<22){
                            burc="yengec";
                        }else {
                            burc="aslan";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 8:
                    if (gun>=1 && gun<=31){
                        if(gun<22){
                            burc="aslan";
                        }else {
                            burc="başak";
                        }
                    }else {
                        isError=true;
                    }
                    break;

                case 10:
                    if (gun>=1 && gun<=31){
                        if(gun<22){
                            burc="terazi";
                        }else {
                            burc="akrep";
                        }
                    }else {
                        isError=true;
                    }

                case 11:
                    if (gun>=1 && gun<=30){
                        if(gun<21){
                            burc="akrep";
                        }else {
                            burc="yay";
                        }
                    }else {
                        isError=true;
                    }
                    break;
                case 12:
                    if (gun>=1 && gun<=31){
                        if(gun<21){
                            burc="yay";
                        }else {
                            burc="oğlak";
                        }
                    }else {
                        isError=true;
                    }
                    break;

                default:
                   isError=true;

            }


            if (isError){
                System.out.println("hatalı giriş yaptınız , tekrar deneyiniz..!");
            }else {
                System.out.println("burcunuz...:"+ burc);
            }



        }
}
