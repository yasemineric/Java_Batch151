package introduction.day03scanner;

import java.util.Scanner;

public class Deneme04 {
    public static void main(String[] args) {

        Scanner input  =new Scanner(System.in);
        System.out.println("Bitte geben Sie zwei Zahlen");

        double ersteZahl =input.nextDouble();
        double zweiteZahl =input.nextDouble();

        double summen =ersteZahl+zweiteZahl;
        double subtrahieren =ersteZahl-zweiteZahl;
        double multipziplieren =ersteZahl*zweiteZahl;
        double teilen =ersteZahl/zweiteZahl;

        System.out.println("summen = " + summen);
        System.out.println("subtrahieren = " + subtrahieren);
        System.out.println("multipziplieren = " + multipziplieren);
        System.out.println("teilen = " + teilen);


    }
}
