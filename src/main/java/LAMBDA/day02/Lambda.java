package LAMBDA.day02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {


        List<String > iller = new ArrayList<>(Arrays.asList("Van","Gumushane","MUS","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));


        bykHrfLengthArtanSiradaTkrsz(iller);
        System.out.println();
        bykHrfSonHarflerineGoreArtanSiradaTrsz(iller);
        System.out.println();
        bykHrfSonUzunluklarinaGoreArtanSiradaTrszAyniAlfabetikSira(iller);
        System.out.println();

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
public static void bykHrfLengthArtanSiradaTkrsz(List<String> iller){
    System.out.println("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));//VAN MUS ORDU HATAY ANKARA EDIRNE KUTAHYA GUMUSHANE GAZIANTEP
}

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarflerineGoreArtanSiradaTrsz(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));//KUTAHYA ANKARA GUMUSHANE EDIRNE VAN GAZIANTEP MUS ORDU HATAY
    }

    /*
    forEach(t-> System.out.print(t+" ")) Lambda bu yapiyi sevmez, bunun yerine method referance yöntemini bulmus

     */

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfSonUzunluklarinaGoreArtanSiradaTrszAyniAlfabetikSira(List<String> iller){
        iller.
                stream().
                distinct().
                map(String::toUpperCase).// String Method referans Class ismi
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
    /*
    map(t->t.toUpperCase()) Lambda Expression bu sevilmez. Bunun yerine :: ile method cagirilabilir
     */




    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz



    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.







}
