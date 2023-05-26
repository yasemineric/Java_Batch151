package javaGenelBilgi.javaProjects.kaffeeMaschiene;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kahve seçimi
        System.out.println("Hangi Kahveyi İstersiniz? 1.Türk Kahvesi 2.Filtre Kahve 3.Espresso");
        String hangiKahve = input.nextLine();

        if (hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
            System.out.println("Türk kahvesi hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println("Filtre kahve hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso hazırlanıyor.");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.");
        }

        // Süt ekleme
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır)");
        String sut = input.nextLine();

        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayır")) {
            System.out.println("Süt eklenmiyor.");
        }

        // Şeker ekleme
        System.out.println("Şeker ister misiniz? (Evet veya Hayır)");
        String seker = input.nextLine();

        if (seker.equalsIgnoreCase("Evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = input.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
        } else if (seker.equalsIgnoreCase("Hayır")) {
            System.out.println("Şeker eklenmiyor.");
        }

        // Kahve boyutu
        System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy)");
        input.nextLine();
        String boyut = input.nextLine();

        if (boyut.equalsIgnoreCase("Büyük boy")) {
            System.out.println("Kahveniz büyük boy hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("Orta boy")) {
            System.out.println("Kahveniz orta boy hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("Küçük boy")) {
            System.out.println("Kahveniz küçük boy hazırlanıyor.");
        }

        // Sonuç
        System.out.println(hangiKahve + " " + boyut + " hazırdır. Afiyet olsun !!!");
    }


}
