package b151practices.day_10_Practice;

import java.util.Scanner;

public class C01_BurcHesaplama {
    // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dogdugunuz ayi String olarak giriniz");
        String ay = scan.next();
        System.out.println("Dogdugunuz günü Integer olarak giriniz");
        int gun = scan.nextInt();

        String burc = "";
        if (ay.equalsIgnoreCase("Ocak")) {

            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("Subat")) {

            if (gun > 20) {
                burc = "Balik";
            } else {
                burc = "Kova";
            }
        }
        if (ay.equalsIgnoreCase("Mart")) {

            if (gun > 21) {
                burc = "Koc";
            } else {
                burc = "Balik";
            }
        }
        if (ay.equalsIgnoreCase("Nisan")) {

            if (gun > 21) {
                burc = "Boga";
            } else {
                burc = "Koc";
            }
        }
        if (ay.equalsIgnoreCase("Mayis")) {

            if (gun > 22) {
                burc = "Ikizler";
            } else {
                burc = "Boga";
            }
        }
        if (ay.equalsIgnoreCase("Haziran")) {

            if (gun > 23) {
                burc = "Yengec";
            } else {
                burc = "Ikizler";
            }
        }
        if (ay.equalsIgnoreCase("Temmuz")) {

            if (gun > 23) {
                burc = "Aslan";
            } else {
                burc = "Yengec";
            }
        }
        if (ay.equalsIgnoreCase("Agustos")) {

            if (gun > 22) {
                burc = "Basak";
            } else {
                burc = "Aslan";
            }
        }
        if (ay.equalsIgnoreCase("Eylül")) {

            if (gun > 23) {
                burc = "Terazi";
            } else {
                burc = "Basak";
            }
        }
        if (ay.equalsIgnoreCase("Ekim")) {

            if (gun > 23) {
                burc = "Akrep";
            } else {
                burc = "Terazi";
            }
        }
        if (ay.equalsIgnoreCase("Kasim")) {

            if (gun > 22) {
                burc = "Yay";
            } else {
                burc = "Akrep";
            }
        }
        if (ay.equalsIgnoreCase("Aralik")) {

            if (gun > 22) {
                burc = "Oglak";
            } else {
                burc = "Yay";
            }
        }

        System.out.println(gun + " " + ay + " " + "tarihinde dogduysaniz burcunuz :" + burc);


    }
}
