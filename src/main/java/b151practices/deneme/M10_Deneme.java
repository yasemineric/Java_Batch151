package b151practices.deneme;

import java.util.Scanner;

public class M10_Deneme {
    public static void main(String[] args) {
        // Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie drei stellige Zahl: ");
        int zahl = input.nextInt();
        if (zahl >= 100 && zahl <= 999) {
            switch (zahl / 100) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("hundert ");
                    break;
                case 2:
                    System.out.print("zweihundert ");
                    break;
                case 3:
                    System.out.print("dreihundert ");
                    break;
                case 4:
                    System.out.print("vierhundert ");
                    break;
                case 5:
                    System.out.print("funfhundert ");
                    break;
                case 6:
                    System.out.print("sechshundert ");
                    break;
                case 7:
                    System.out.print("siebenhundert ");
                    break;
                case 8:
                    System.out.print("achthundert ");
                    break;
                case 9:
                    System.out.print("neunhundert ");
                    break;
            }
            switch ((zahl % 100)%10) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("eins und ");
                    break;
                case 2:
                    System.out.print("zwei und ");
                    break;
                case 3:
                    System.out.print("drei und ");
                    break;
                case 4:
                    System.out.print("vier und ");
                    break;
                case 5:
                    System.out.print("funf und ");
                    break;
                case 6:
                    System.out.print("sechs und ");
                    break;
                case 7:
                    System.out.print("sieben und ");
                    break;
                case 8:
                    System.out.print("acht und ");
                    break;
                case 9:
                    System.out.print("neun und ");
                    break;
                case 10:
                    System.out.print("zehn ");
                    break;
                case 11:
                    System.out.print("elf ");
                    break;
                case 12:
                    System.out.print("zwölf ");
                    break;



            }
            switch ((zahl % 100) / 10) {
                case 0:
                    System.out.print(" ");

                    break;
                case 2:
                    System.out.print("zwanzig");
                    break;
                case 3:
                    System.out.print("dreizig");
                    break;
                case 4:
                    System.out.print("vierzig");
                    break;
                case 5:
                    System.out.print("funfzig");
                    break;
                case 6:
                    System.out.print("sechzig");
                    break;
                case 7:
                    System.out.print("siebzig");
                    break;
                case 8:
                    System.out.print("achtzig");
                    break;
                case 9:
                    System.out.print("neunzig");
                    break;
            }

        } else {
            System.out.println("Ungültige Zahl.");
        }


    }
}
