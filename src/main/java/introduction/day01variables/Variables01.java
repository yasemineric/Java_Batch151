package introduction.day01variables;

import java.sql.SQLOutput;

public class Variables01 {
    public static void main(String[] args){
      // java bu satiri okumaz.Kendimize veya baskasina aciklamadir
      /*
      *java bu satirlari da okumaz
      * pek cok satirlik yorumlardir.
       */
        // Variable olusturmak
        //data type+ variable name + atama operatoru + noktali virgul
      int age =13;
      /* java cumlesi= Statement
       * java'da ¨=¨ assignment operator. Sagdaki degeri alir soldaki kutuya koyar.
       *java'da esittir demek¨==¨, Matematkte ¨=¨
       * Eger Variable Declaration yapar Assignment yapmazsaniz java kendi Default degerlerini yukler.
       * Default deger Sayilar icin sifirdir.
       *
       * Data type + variable name== > Variable Declarition
       * Assignment operator (atama operatoru) + variable degeri ==> Assignment
       *javada temel olarak iki tip data vardir
       * 1) primitive data type:
       * char, boolean, byte,short, long, float, double
       * 2) non-primitive data type
       * String
       */
        // Ornek 1: Ogrenci ismi icin bir Var. olusturunuz ve Ali Can atayiniz
        // Stringlere verilen degerler daima cift tirnak icinde olmalidir.
        // Stringler icin "default value" "null" dir.
        // null demek 0 demek degildir. Cunku 0 da coding de bir degerdir.
        //{} {0} null bos kume gibidir, ici bos obje demektir.
        String studentName="Ali Can";

        // char data type:
        // tek karakterler icin kullanilir. Ornegin ==> A, x, 5
        // Ornek 2: char data type.nda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.

        // Char data type.de degerler tek tirnak icine konulmalidir.

        char firstLetter= 'A';

        // boolean data type:
        // booleanlar iki fakli deger alabilirler true veya false
        //Ornek 3: boolean data type.de emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean rentSituation = false;

        // byte data type:
        //tam sayilar icindir. Hafizada 1 byte yer kaplar
        // byte -128 den +127'ye(dahil) kadar tam sayi degerleri icin kullanilabilir
        // Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunus ve deger atayiniz.

        byte studentAge = 15;

        // short data type:
        // tam sayilar icindir ve hafizada 2 byte yer kaplar
        // short: -32768 ile 32768 arasindaki tam sayilar icin kullanilir

        short dieAnzahlDerSchuler = 1300;

        // int data type:
        // tam sayilar icindir.4 Byte yer kaplar.
        // int: -2 milyar kusur ile +2 milyar kusur arasi
        // Ornek 5: ulke nufusu icin bir variable olusturunuz ve deger atamasi yapiniz.
        int countryPopulation=90000000;

        // long data type:
        // tam sayilar icindir, hafizada 8 byte yer kaplar.
        // Ornek 6: insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        //Note: Bir deger Long ise sonuna"L" yada "l" konulur.
        //Eger Long.a atadigimiz deger int.lerin araliginda ise sonuna "L" koymaya gerek yok
        // long dememize ragmen sonuna L koymazsak java onu eger int araliginda ise int olarak kabul eder;
        long cellNumberInHumanBody= 12234556756979L;

        //float data type:
        //float ondalikli sayilar, decimalnumbers icin kullanilir
        // fiyatlandirmalar icin tercih edilebilir(12.99)
        //Ornek 7: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz
        // Note: Java ondalikli sayilari yani "decimal numbers"i otomatik olarak double kabul eder
        // bia data type.ini flaot yazarsak hata verir.
        // float olmasinda israrciysak sonuna "f" yada "F" koymaliyiz.
        float priceOfShirt= 12.99f;
        float priceOfShoes= 15.99F;

        System.out.println(priceOfShirt+ priceOfShoes);
        // System.out.println() kodu parantez icine yazdiklarimizi ekrana yazdirir.
        int a=12;
        int b= 13;

        System.out.println(a+b);

        // System.out.println() kodu ekrana yazdirir ve pointer.i bir sonraki satira koyar.
        //System.out.print() kodu ekrana yazdirir ve pointer.i ayni satirda tutar

        // double data type:
        // double memory de daha fazla yer kaplar, virgulden sonraki sayilar daha fazla yer alir
        //Ornek 8: Hucre agirligi ve amip.in agirli icin iki tane variable olusturunuz ve agirliklari farkini ekrana yazdiriniz

       double weightDerZell= 0.00000127;
       double weightDerAmip= 0.00000025;
      System.out.println(weightDerZell-weightDerAmip);


    }

}
