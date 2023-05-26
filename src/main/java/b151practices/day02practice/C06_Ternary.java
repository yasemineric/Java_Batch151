package b151practices.day02practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein");
        int num1=scan.nextInt();
        System.out.println("Bitte geben Sie zweite Zahl ein");
        int num2=scan.nextInt();

        System.out.println(num1==num2?("Die Zählen sind gleich"):(num1>num2?"Buyuk sayi : "+num1:"Buyuk sayi : "+num2));
       // Object str= num1==num2?"Die Zählen sind gleich":(num1>num2?num1:num2);
        //System.out.println(str);



    }
}
