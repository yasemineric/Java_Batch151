package javaders.day12switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
        Kullanicidan bir ülke ismi aliniz. Alina ülke adina göre kisaltmalarini yaziniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter country name among \"America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France\"");
        String nameLand = input.nextLine();// to lowercase buraya cok da uygun olmaz.
        // best Praktice degil. Cünku daha basta tüm veriyi update ediyoruz.
        // Belki baska conditionlarda orijinal hali gerekecek.
        // O yuzden switch icinde bu degisikligi yapmak mantikli
        switch (nameLand.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("Al");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Lutfen gecerli bir ulke giriniz..");
        }


    }
}
