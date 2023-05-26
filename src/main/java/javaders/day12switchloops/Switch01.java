package javaders.day12switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Ex:Ay numarasini söyleyince numarasi verilen aydan baslayip 12.aya
        // kadar tüm aylarin isimlerini yazdiran kodu yaziniz
        //8==>August Sebtember October.....

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Zahl des angefangenes Monat : ");
        int zahlDesMonats = input.nextInt();
        switch (zahlDesMonats) {
            case 1:
                System.out.println("Januar");
            case 2:
                System.out.println("Februar");
            case 3:
                System.out.println("Marz");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("Mai");
            case 6:
                System.out.println("juni");
            case 7:
                System.out.println("Juli");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("Sebtember");
            case 10:
                System.out.println("Oktober");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("Dezember");
                break;
            default:
                System.out.println("Geben Sie eine gültige Zahl des Monats");


        }
//note: Switch kondition parantezi icerisinde 1-String, 2) Int, 3)Byte, 4) Char, 5)short
        // Note: Switch condition parantezi icerisinde 1)long 2)boolean 3)flat,4) double kullanilmaz
        // Switch ikiden fazla durum icin kullanilir. o yuzden diger  long, boolean vs. ternary de kullanilabilir.

    }//main
}//class
