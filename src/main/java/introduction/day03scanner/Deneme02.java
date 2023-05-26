package introduction.day03scanner;

import java.util.Scanner;

public class Deneme02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Vorname ein: ");
        String vorName= input.next();
        System.out.println("Bitte geben Sie Ihre Nachname ein: ");
        String nachName = input.next();

        System.out.println(vorName+" "+ nachName);


    }
}
