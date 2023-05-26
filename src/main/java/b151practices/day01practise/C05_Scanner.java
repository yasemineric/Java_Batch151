package b151practices.day01practise;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
         /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Name ein :");
        String name = scan.next();

        System.out.println("Bitte geben Sie Ihre Nachname ein :");
        String nachName = scan.next();

        System.out.println("Bitte geben Sie Ihre Alt ein :");
        byte alt = scan.nextByte();

        System.out.println("Bitte geben Sie Ihre Größe ein :");
        int große = scan.nextInt();

        System.out.println("Bitte geben Sie Ihre Weight ein :");
        int weight = scan.nextInt();

        System.out.println("Adı: " +name+
                "\nSoyadı: " + nachName+
                "\nYas: " +alt+
                "\nBoy: " +große+
                "\nKilo: "+weight);

        //System.out.println("Adi : " + ad + "\n" + "Soyad :" + soyad + "\n" + "Yas:" + yas +"\n" + "Boy :" + boy + "\n" + "Kilo:"+kilo);
    }
}
