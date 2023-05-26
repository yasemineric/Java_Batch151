package LAMBDA.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Lambda01 { public static void main(String[] args) {
/*

    1) Lambda method create etme degil mevcut methodlari library'den cagarip kullanmaktir
    2) Java 8 ile eklenmistir
    3)Functional Programming dir.mimari yapiya onem vermez
    )Hiz, Clean Code ve okunabilirlik acisindan onemlidir
    for each() terminal islemidir, ondan sonra baska islem yapilmaz.

 */
    List<String> iller = new ArrayList<>(Arrays.asList("Eskisehir","MUS","VAN","Edirne","Ordu","VAN","Izmir","Safranbolu","Izmir"));
    printsElements(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
    System.out.println();
    printsEl(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
    System.out.println();

    karakSaysDorttenCokBykHrfYazdir(iller);
    System.out.println();

    karakSaysDorttenCokTkrszKucukHrfYazdir(iller);
    System.out.println();

    tkrszBuyukHrfAlfabetikSiraYazdir(iller);
    System.out.println();

    tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(iller);
    System.out.println();

    ilkHarfBykDigerKucukYazdir(iller);
    System.out.println();


    System.out.println(ilkHarfEveyaSOlanlariYazdir(iller));
    System.out.println();


}//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol: Structured Programming
    public static void printsElements(List<String >iller){
        for (String w :iller ) {
            System.out.print(w+" ");
        }
    }

    //2.Yol:LAMBDA Expression
    public static void printsEl(List<String >iller){
        System.out.print("1) ");
        iller.
                stream().
                forEach(t ->System.out.print(t+" "));//datalari akisa aliyor
    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void EHaricElYazdir(List<String >iller) {
        System.out.print("2) ");
        iller.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenAzYazdir(List<String >iller) {
        System.out.print("3) ");
        iller.
                stream().
                filter(t ->t.length()<4).
                forEach(t -> System.out.print(t + " "));
    }



    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenCokBykHrfYazdir(List<String >iller) {
        System.out.print("4) ");
        iller.
                stream().//akisa alindi
                filter(t ->t.length()>4).//karakter sayisi 4 ten fazzla olanlar filtrelendi
                map(t->t.toUpperCase()).//datalarin yapisini degistirir
                forEach(t-> System.out.print(t+" "));

    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void karakSaysDorttenCokTkrszKucukHrfYazdir(List<String >iller) {
        System.out.print("5) ");
        iller.
                stream().
                distinct().//Benzersiz tekrarsiz yapar
                filter(t->t.length()>4).//karakter sayisi 4 ten fazla olanlari aldi
                map(t->t.toLowerCase()).//datanin yapisini degistirdi hepsini kucuk harfe donusturdu
                forEach(t-> System.out.print(t+" "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void tkrszBuyukHrfAlfabetikSiraYazdir(List<String >iller) {
        System.out.print("6) ");
        iller.
                stream().
                distinct().//tekrarsiz
                map(t->t.toUpperCase()).//yapisi gegisir buyuk harfe cevirdi
                sorted().//siralama yapar
                forEach(t-> System.out.print(t+" "));

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(List<String >iller) {
        System.out.print("7) ");
        iller.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).// Comparator Karsilastirici comparing karsilastir uzunluklarina gore
                forEach(t -> System.out.print(t + " "));
        // sorted(Comparator.comparing(t->t.length())) karsilastirma sartlarini biz belirliyorsak
        // sorted() icerisine Comparator ile sartimizi belirtiriz
        //Eger listede kiyas sirasinda ayni sartlar varsa listeye once eklenen once yazdirilir

    }
    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >iller) {
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return iller;
    }
    // Example 9: Ilk Harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String >iller) {
        System.out.print("9) ");
        return     iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir
    }




    /*
    5. Soru:
stream methodu sonrasinda tekrarsiz elemanlar istendiginden once distinc methodunu daha sonra uzunlugu 4'ten
kucuk olanlari elemek icin filter methodunu kullaniriz. Siralama bu sekilde yapilir ve data type'in yapisini
degistirme anlamina gelecek sekilde karakterlerin kucuk harfle yazilmasi istendiginden map'ten istifade ederiz.
Map sayesinde isimize yarayacak olan toLowerCase methodunu kullanabiliriz. Baska bir sey istenmediginden
for each methodu ile yazdirma islemini yapiyoruz. Sout icinde elemanlari icinde tutan t harfini ve aralarda
bosluk kalmasi icin + " " yaziyoruz.

6.Soru:
Bu sorudaki fark, method olarak siralama yapmamiza yardim edecek olan methodu kullanmamiza neden olmasidir.
Natural order ile siralama yapilabilmesi icin map methodu sonrasi bir nokta koyuyoruz, orada methodlar sirali
halde gorununce sorted methodunu sectik. Birden fazla sorted methodu var. Birinde icine bir argument koymuyoruz,
bu durumda natural order'a gore siralama yapar. Diger sorted methodu icine bir argument koymamiz gerekiyorsa,
sartimizi belirlememiz gerekirse ornegin karakterlerin uzunluguna gore bir siralama yapilmasi gerekiyorsa bu tip
sorted methodunu kullaniriz. Sorumuza uygun olan ilk tip sorted methodu oldugu icin onu sectik. Sorted methodu
alfabetik siralama yaparken harflerin ascii table'daki degerlerine gore yapar. Daha sonra for each methodu
ile yazdirma islemini yaptik. Ekranda illerin buyuk harflerle alfabetik siralama ile yazildigini gorduk. Listemizde
iki E harfi ile baslayan il oldugunda ornegin Edirne ve Eskisehir. Bu durumda birinci harfler esitse java
alfabetik siralamayi yapmak icin ikinci harflerin ascii table'daki degerlerine bakar. Boylece Edirne Eskisehir'den
once yazilir.

7.Soru:
Bu sorudaki fark, bir siralama yaparken sartimizi belirlememizi gerektiren bir siralama yapmamiz isteniyor.
Alfabetik siralamaya gore degil, karakterlerin uzunluklarina gore siralama yapilacak.
Sirasiyla stream methodu, distinct methodu, map methodu(t variable'ina gir ve karakterlerin hepsini
kucuk harfe cevir), sorted methodu(icine argument koymamiz yani sarti belirlememiz gerekir). Nasil yapacagiz?
sorted(Comparator.comparing(t->t.length) uzunluguna gore karsilastirma yaparak sirala demis olduk. Son
olarak for each ile yazdirdik. Methodlarimizi alt alta okunur sekilde siraladik. Ekranda elemanlari uzunluklarina
gore siraladi. Ancak iki elemanin uzunlugu ayni idi. Bu durumda biz alfabetik siralama istemedigimiz icin listeye
once eklenen once yazdirildi. Verilme siralarina gore yazildilar. (mus van...)

8.Soru:
Bu sorudaki fark, elemanlarin ilk harfi buyuk, digerleri kucuk yazdiracak bir method olusturmamiz gerekli.
Burada biz ekranda sadece yazdirma yapan return type'i void yerine List<String>'i return type olarak yazdik.
Ekranda bize bir list verecek. Bunun icin klasik bir sekilde listimizin ismi ve stream() yazmak yerine
onun basina return yazmak ile basladik.

Method icinde; return  iller.stream().map(t->t.substring(0,1).toUpperCase+t.substring(1).toLowerCase
forEach(t->System.out.print(t+ " "))  Daha sonra kodumuzda sorun gorununce retun'u son kisma return iller; olarak
ekledik.


Biz substring(0,1) yazdik once. Bu sekilde sadece ilk karakteri almasini sagladik. Sonraki substring(1) yazdik.
Bu sekilde 1.index dahil kalan tum karakterleri alabildik ve sonrasinda aldigi bu indexteki karakterleri
kucuk harfe cevirme islemini toLowerCase methodu ile gerceklestirebildik. Ekranda elemanlarin ilk harfleri buyuk,
sonraki harfleri kucuk yazili olarak bir list icinde gorundu.

9.Soru:
Bu sorudaki fark: Biz burada ilk harfi E ve S olanlari aramamiz ve bir list icinde yazdirmamiz gerekli.
Burada ek olarak startsWith methodunu kullandik.Bu methodu filter methodu icinde kullandik, cunku E ve S harfli
elemanlari secmemiz gerekliydi. Aldigimiz datalari bir list icine koyacak olan
collect(Collector.toList()) methodunu kullandik. Method olusturma istenen sorularda ayrica method olusturuyoruz.
Main method icine giderek sout icine methodumuzun ismini listimizin ismi ile yazdirma yapariz.

Sadece bir karakter ornek son karaktere gore siralama istendiginde sorted(Comparator.comparing(t->t.charAt(t.length-1)
Boylece son karakteri alarak siralama yapildi. Listemizde Kutahya once Ankara sonra. Ikisinin de
son harfi a olunca listeye eklenme siralarina gore yazildilar.

toUpperCase String class'indan geliyor. map methodu icinde String class'indan toUpperCase methodu cagirirken
String : : toUpperCase yazmak Lambda'ya ozgu bir uygulama olup, boylece fazladan t ve nokta yazmiyoruz daha basit
bir yazim ile tum String harfleri buyuk harfle yazmis olduk. Ya da uzunluklara gore karsilastirma yapacagimiz
zaman String : : length yazdik Comparator.comparing icinde. Karsilastirma yaparken ayni durumda birden
fazla eleman varsa thenComparing methodunu kullaniriz, bu method icine Comparator.naturalOrder() yazarak
ayni durumda olanlari natural order'a gore siralanmalarini saglamis olduk.
     */
}
