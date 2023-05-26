package javaGenelBilgi.javaProjects.kaffeeMaschiene;

import java.util.Scanner;

public class Runner {
    static String hangiKahve="";
    static Scanner input =new Scanner(System.in);

    static String sut;
    static String seker;
    static int kacSeker;
    static String boyut;
    public static void main(String[] args) {

        anaMenu();
    }

    public static void anaMenu() {
        System.out.println("Hangi kahveyi istersiniz? \n 1-Turk Kahvesi \n 2-Filtre Kahve \n 3-Espresso");
        hangiKahve=input.nextLine().toLowerCase();

        switch (hangiKahve){
            case "turk kahvesi":
                System.out.println(hangiKahve +" hazirlaniyor...");
                sut();
            case "filtre kahve":
                System.out.println(hangiKahve +" hazirlaniyor...");
                sut();
            case "espresso":
                System.out.println(hangiKahve +" hazirlaniyor...");
                sut();
            default:

        }

    }

    public static void sut() {
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        sut=input.next().toLowerCase();

        switch (sut){
            case "evet":
                System.out.println("Sut ekleniyor...");
                seker();
            case "hayir":
                System.out.println("Sut eklenmiyor...");
                seker();
            default:
                System.out.println("Hatalı tuşlama yaptınız...");
                sut();
        }
    }
    public static void seker() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
        seker=input.next().toLowerCase();
        if(seker.equals("evet")){
            System.out.println("Kac seker olsun?");
            kacSeker=input.nextInt();
            input.nextLine();
            System.out.println(kacSeker+" seker ekleniyor...");
            boyut();

        }else if (seker.equals("hayir")){
            System.out.println("Seker eklenmiyor...");
            input.nextLine();
            boyut();
        }else {
            System.out.println("Hatalı tuŞlama yaptınız...");
            seker();
        }
    }
    public static void boyut() {
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) ");
        boyut=input.nextLine().toLowerCase();
        if (boyut.equalsIgnoreCase("orta boy")||boyut.equalsIgnoreCase("buyuk boy")||boyut.equalsIgnoreCase("kucuk boy")){
            System.out.println("kahveniz " + boyut + " hazırlanıyor");
            sonuc();
        }else {
            System.out.println("Hatalı tuŞlama yaptınız...");
            boyut();
        }
    }
    public static void sonuc() {
        System.out.println(hangiKahve+" "+boyut+" hazirdir.Afiyet olsun !!!");
        anaMenu();
    }




}
