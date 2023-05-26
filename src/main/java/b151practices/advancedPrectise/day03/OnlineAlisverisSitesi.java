package b151practices.advancedPrectise.day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisverisSitesi {
    static Scanner input = new Scanner(System.in);
    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double odenecekMiktar;


    public static void main(String[] args) {
        urunListesi.add("Saat ürün kodu 0");
        urunListesi.add("Monitor ürün kodu 1");
        urunListesi.add("Canta ürün kodu 2");
        urunListesi.add("Tv ürün kodu 3");
        urunListesi.add("Kitap ürün kodu 4");

        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);

        List<String> yeniUrunler = new ArrayList<>();
        yeniUrunler.add("Taki ürün kodu 5");
        yeniUrunler.add("Tencere ürün kodu 6");
        yeniUrunler.add("Kiyafet ürün kodu 7");
        urunListesi.addAll(yeniUrunler);

        List<Double> yeniUrunFiyatlari = new ArrayList<>();
        yeniUrunFiyatlari.add(9000.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);
        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();


    }

    public static void musteriSecim() {

        urunListesiniGoster();
        System.out.println("Lütfen ürün kodunu giriniz");
        int urunKodu = input.nextInt();
        if (urunKodu >= 0 && urunKodu <= urunListesi.size()) {
            System.out.println("Kac adet istediginizi giriniz");
            int adet = input.nextInt();
            double toplamUrunFiyati = urunFiyatlari.get(urunKodu) * adet;
            odenecekMiktar += toplamUrunFiyati;

            devamMi();
        }else{
            System.out.println("Lütfen gecerli bir urun kodu giriniz");
            musteriSecim();// Recursive method: method icinde ayni methodu cagirma- yenilemeli

    }
    }//MusteriSecim

    private static void devamMi() {

        System.out.println(" Alisverise devam etmek istiyor musunuz?" +
                "\n Evet ise ==>1" +
                "\nHayir ise ==>2'ye basiniz");
        int devamMi=input.nextInt();
        if (devamMi==1){
            musteriSecim();
        } else if (devamMi==2) {
            odemeYap();
        }else {
            System.out.println("Lütfen gecerli bir secenk giriniz");
            devamMi();// RecursiveMethod
        }


    }

    private static void odemeYap() {

        LocalDate kurulusGunu= LocalDate.of(2022,4,9);
        LocalDate date=LocalDate.now();
        if(date.isEqual(kurulusGunu)){
            slowPrint("TechPro Alisveris Sitesine hosgeldiniz."+
                    "\nBugün bizim yil dönümümüz.\n Borcunuz yoktur",60);
        }else{
            slowPrint("TechPro Alisveris Sitesini tercih ettiginiz icin tesekkür ederiz."+"" +
                    "\nÖdemeniz gereken tutar  :",60);
            System.out.println(odenecekMiktar+" TL");
        }
    }//odemeYap()

    private static void slowPrint(String metin, int gecikme) {
        for (char ch:metin.toCharArray()){ // String bir datadan harf harf alip Char.a dönüstürüyor
            System.out.print(ch);
            try {
                Thread.sleep(gecikme); // Geciktirerek yazdirmak icin
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }//slowPrintln

    public static void urunListesiniGoster() {
        System.out.println("*********************** Urun Listesi********************");
        for (int i = 0; i < urunListesi.size() ; i++) {
            System.out.println(i+" - "+ urunListesi.get(i)+ "Fiyat "+ urunFiyatlari.get(i)+ "TL");


        }

    }//urunListesiniGoster()






}
