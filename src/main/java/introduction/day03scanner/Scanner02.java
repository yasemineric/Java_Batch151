package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    // Kulllanicidan ilk ismini ve Soyismini alip ikisini ayni satirda yazdirin

    public static void main(String[] args) {
        //1.Adim: Scanner Class.dan object olustur
        Scanner input =new Scanner(System.in);
        //2.Adim Kullanicidan ne istedigimize dair mesaj verin
        System.out.println("Ilk isminizi giriniz:");
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz:");
        String lastName= input.next();
        System.out.println(firstName+" "+lastName);


    }
}
