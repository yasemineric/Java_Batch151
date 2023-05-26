package LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        /*
        Match
        allMatch()==> tüm elemanlar sarti saglarsa true döndürür.
        anyMatch()==> Bir yada birden fazla eleman sarti saglarsa true döndürür.
        noneMatch()==> hicbir eleman sarti saglamazsa true döndürür.
         */

        // parametreli constructor.a göre 8 tane üni objesi olusturalim

        Universite u1=new Universite("hacettepe","fizik",1000,75);
        Universite u2=new Universite("odtu","matematik",2000,80);
        Universite u3=new Universite("bogazici","java",3000,85);
        Universite u4=new Universite("marmara","sql",4000,90);
        Universite u5=new Universite("itu","resim",5000,90);
        Universite u6=new Universite("erciyes","api",6000,75);
        Universite u7=new Universite("karaelmas","müzik",7000,80);
        Universite u8=new Universite("bilkent","bilgisayar muh",8000,100);
        List<Universite> list=new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
        System.out.println(notOrt75tenBuyuk(list));//false
        System.out.println();
        System.out.println(matematikBolumuVarMi(list));//true
        System.out.println();
        System.out.println(ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(list));




    }//main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.

    public static boolean notOrt75tenBuyuk(List<Universite> list){
        System.out.println(1);
        return list.
                stream().
                allMatch(t->t.getNotOrtalaamsi()>75);// allMatch.de hepsinin bu sarti saglamasi beklenir.
    }



    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
    public static boolean matematikBolumuVarMi(List<Universite> list){
        System.out.println(2);
        return list.stream().
                anyMatch(t->t.getBolumAdi().equalsIgnoreCase("matematik"));// allMatch.de hepsinin bu sarti saglamasi beklenir.



    }

    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.

    public static List<Universite> ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(List<Universite> list){
        System.out.println(3);
        List<Universite>unvOgrSayilari=list.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).
                collect(Collectors.toList());

        return unvOgrSayilari;



    }























}
