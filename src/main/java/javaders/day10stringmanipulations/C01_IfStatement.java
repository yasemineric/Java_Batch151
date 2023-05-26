package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // if it rains; I will cancel die picnic.
        // Eger yagmur yagarsa pikigi iptal edecegim.

        // Ex: verilen karakter büyük harf ise ekrana "büyük harf" yazdiran kodu yaziniz
        char ch = 'a';
        if (ch >= 'A' && ch <= 'Z') { // A harfinin Ascii degeri 65 Z harfinin de 90 ve aralarindaki
            // ascii Tabledaki degerleri karsilastirarak islem yapar
            System.out.println("Büyük Harf");
        } else {
            System.out.println("Büyük Harf degil");
        }

        char ch1 = 'A';
        if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println("Kücük Harf");
        } else {
            System.out.println("Kücük Harf degil");
        }

        // Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz
        // Verilen sayi dedigi icin Scanner kullanilmaz.
        /*
        Karsilastirma operatörleri:
        == Esittir
        != Esit degildir
        >= Büyük esit
        <= Kücük esit
        && and (ve) operatoru
        || or (veya) operatoru
         */
        int num1 = -5;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Lutfen bir sayi giriniz: ");
        //int num1 = input.nextInt();
        if (num1 % 2 == 0) { // kodun dinamik yazilmasi icin variable.in ismi yazilir.
            // Direk deger yazilirsa hurd coding yani tek datalik kod olur.
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek Sayi");
        }

        //Ex: Verilen bir sayi 300 den buyuk veya 1200den büyük ise "harika sayi" yazdiran kodu yaziniz.
        int num2 = 1251;
        if (num2 < 300 || num2 > 1200) {
            System.out.println("Harika Sayi");
        }

        // Kullanicidan alinan datanin Tek mi Ciftmi oldugunu yazdiran kodu yazniz

        //1.Weg. Independet If Statement
        // Burada bir task icin ayri kod yazdik
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num3 = input.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("Cift Sayi");}
        if (num3 % 2 !=0) {
            System.out.println("Tek Sayi");}

        //2.Weg If Else
        if (num3 % 2 == 0) {// Eger num icerisindeki datanin 2.ye bölumunden kalan 0'a esit ise  Cift sayi yazdirir.
            System.out.println("Cift Sayi");}
        else {// else= degilse deme.Geriye kalan tum ihtimaller icin burasi calisir
            System.out.println("Tek Sayi");
        }
 // Ex: Verilen bir sayinin pozif mi negatif mi notr mu oldugunu söyleyen kodu yaziniz

        int num4= -60;

        if (num4>0){
            System.out.println("Pozitif");

        }
        else if(num4<0){
            System.out.println("Negatif");}
        else { System.out.println("nötr");}




    }//main

}//class
