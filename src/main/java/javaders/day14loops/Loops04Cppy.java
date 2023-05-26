package javaders.day14loops;

import java.util.Scanner;

public class Loops04Cppy {
    public static void main(String[] args) {
        /*
    //kullanici username ve password.u girsin.
    // 3.kereden fazla yanlis girerse "Your account was blocked"hesabiniz bloke olmustur msji alsin
    // 3 kereye kadar yanlis girerse"Invalid Username or password, try again" yanlis girdiniz tkrar deneyiniz msji alsin.
    // dogru girerse "Welcome to your account"hesabiniza hosgeldiniz msji alsin
         */
        Scanner input = new Scanner(System.in);
        int counter=0;
        String userName="Yasemin";
        String passWord="Kale.";
        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Enter your username...");
            String nUserName = input.nextLine();
            System.out.println("Enter your passWord");
            String nPassWord = input.nextLine();
            counter++;
            if(nUserName.equals(userName)&&nPassWord.equals(passWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid Username or password, try again");
                System.out.println((3-counter) + " right left");
            }
        }while(true);

    }
}
