package javaders.day07stringmanipulation;

import java.io.InputStream;
import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        /*
         //Asagidaki kurallara göre kullanicinin girdigi password.u kontrol ediniz
        1)En az 8 karakter olsun
        2)Password space icermesin
        3)En az bir tane Büyük harf olsun
        4) En az bir tane kucuk harf olsun
        5) en az bir tane sembol olsun
        6) en az 1 tane rakam olsun

         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen Passwordunuzu  "+
                "        1)En az 8 karakter olsun\n" +
                "        2)Password space icermesin\n" +
                "        3)En az bir tane Büyük harf olsun\n" +
                "        4) En az bir tane kucuk harf olsun\n" +
                "        5) en az bir tane sembol olsun\n" +
                "        6) en az 1 tane rakam olsun"+
                "giriniz...");
        String pwd= input.nextLine();
    // 1)En az 8 karakter olsun
        boolean krktrSys= pwd.length()>7;
        //boolean krktrSys2= pwd.length()>=8;
        // Makbul olani >7 dir.
        // >=8 de iki ayri islem gerekiyor sistemi yavaslatiriz

        //2)Password space icermesin
        boolean spcOlmamali =!pwd.contains(" ");// icermemeli demek icin olumsuzluk isareti ! kullaniriz
        //3)En az bir tane Büyük harf olsun
        boolean bykHrf= pwd.replaceAll("[^A-Z]", "").length()>0;
        //4) En az bir tane kucuk harf olsun
        boolean kckHrf=pwd.replaceAll("[^a-z]","").length()>0;
        // Methodlari ayni anda yanyana yazdirabiliriz. buna method chain denir.
        //5) en az bir tane sembol olsun
        boolean symbl =pwd.replaceAll("[a-zA-z0-9]","").length()>0;
        //6) en az 1 tane rakam olsun
        boolean rkm =pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Password gecerli mi :  "+(krktrSys && spcOlmamali && bykHrf && kckHrf && symbl && rkm ));



        //Scanner input = new Scanner(System.in);
        //System.out.println("Lutfen passwordunuzu giriniz...");
        //String password = input.nextLine();
        //
        //boolean d1 = password.length()>7;
        //boolean d2 = password.contains(" ");
        //boolean d3 = password.replaceAll("[^A-Z]", "").length()>0;
        //boolean d4 = password.replaceAll("[^a-z]", "").length()>0;
        //boolean d5= password.replaceAll("[a-zA-Z0-9]", "").length()>0;
        //boolean d6 = password.replaceAll("[^0-9]", "").length()>0;
        //System.out.println("Password dogru mu ? " + (d1 && d2 && d3 && d4 && d5 && d6));



    }//main


}//class
