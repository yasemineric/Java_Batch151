package b151practices.day02practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Biite geben Sie Ihre Vorname, zweite Vorname und Nachname mit leer zwischen ein");
        String str=scan.nextLine().toUpperCase().trim();
        char firstChr=str.charAt(0);
        char secondChr=str.charAt(str.indexOf(" ")+1);
        char lastChr=str.charAt(str.lastIndexOf(" ")+1);
        System.out.println(""+firstChr+secondChr+lastChr);

        /*
        Scanner input = new Scanner(System.in);
System.out.println("Adinizi, ikinci adinizi ve soyadinizi aralarinda bosluk olacak sekilde giriniz: ");
String name = input.nextLine();
name = name.toLowerCase();
String[] nameArray = name.split(" ");
String[] name2 = new String[nameArray.length];

for (int i = 0; i < nameArray.length; i++) {
    String ch = nameArray[i].charAt(0) + " ";
    ch = ch.toUpperCase();
    System.out.print(ch);
}
         */

    }
}
