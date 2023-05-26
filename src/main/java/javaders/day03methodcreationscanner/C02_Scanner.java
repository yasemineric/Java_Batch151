package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan data almak icin Scanner classindan scan/input/scannerobjesi olustururuz.
        Bu sekilde kullaniciyi yonlendirerek gerekli datayi elde ederiz.

         */
        // 1.Schritt: Ocject erstellen
        Scanner input = new Scanner(System.in);
        //2.Schritt: Wir sagen, was der Benutzer machen soll
        System.out.println("Bitte geben Sie Ihre Geschlecht ein: W/M");
        // 3.Schritt: Die genommende Data wird eine passende Conteiner gestellt
        char geschlecht = input.next().charAt(0);
        // 4.Schriit: Um auf den Bildschirm zu sehen und die Daten zu korrigieren auszudrucken
        System.out.println("geschlecht = " + geschlecht);
        //Wir fragen den Benutzer: Geschlecht# Name# Geburtsort, Alt, Größe, Ulkesini sevip sevmedigini, Gehalt

        System.out.println("Bitte geben Sie Ihre Name ein:");
        String name = input.next();
        System.out.println("name = " + name);

        System.out.println("Bitte geben Sie Ihre Geburtsort ein:");
        String gebOrt = input.next();
        System.out.println("gebOrt = " + gebOrt);

        System.out.println("Bitte geben Sie Ihre Alt ein:");
        byte alt = input.nextByte();
        System.out.println("alt = " + alt);

        System.out.println("Bitte geben Sie Ihre Größe ein:");
        short grose = input.nextShort();
        System.out.println("grose = " + grose);

        System.out.println("Bitte schreiben Sie ob Sie Ihren Heimatland mag: True/False");
        boolean obMag = input.nextBoolean();
        System.out.println("mag = " + obMag);

        System.out.println("Bitte geben Sie Ihre Gehalt ein:");
        long gehalt = input.nextLong();
        System.out.println("gehalt = " + gehalt);

// System.out.println("gender: "+gender+ "\nisim : "+isim+"\nmemleket : "+memleket+"\nyas : "+yas+"\nboy : "+boy+
// "\nseviyorMu : "+seviyorMu+"\nmaas : "+maas);
// tek satirda da yazdirabiliriz


    }//main
}//class
