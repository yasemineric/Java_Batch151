package b151practices.day01practise;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie erste Zahl ein: ");
        int ersteZahl = input.nextInt();
        System.out.println("Bitte geben Sie zweite Zahl ein: ");
        int zweiteZahl = input.nextInt();
        if (ersteZahl > zweiteZahl) {
            System.out.println("Erste Zahl ist großer als zweite Zahl");
        } else {
            System.out.println("Erste Zahl ist nicht großer als zweite Zahl");
        }

    }
}
