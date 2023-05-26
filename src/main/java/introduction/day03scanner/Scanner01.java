package introduction.day03scanner;
// Die ScannerClass wurde importet von der Bücherei des Javas.

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.Schritt: Herstellt eine Objekt von ScannerClass
        //1. adim : Scanner Class'tan bir obje olustur

        Scanner input = new Scanner(System.in);
        //obje ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak
        // die Name des Objekts ist "input", weil diese Objekt wird die Daten, die von die Benutzer gegeben hat, in meine Coden stellen.
        // 2. Schritt: Gib eine Nachricht zur Benutzer, was verlangt ist.
        //2.adim Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Bitte Geben Sie Ihre Alt ein...");
        //3.adim Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        // 3.Schritt:  Die Daten, die von Benutzern gegeben sind mit der Nutzung Passende Method werden zur Memory stellen.

        byte age = input.nextByte();
        System.out.println(age);


    }
}
