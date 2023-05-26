package javaders.day34colllectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        Map.lerde sözlüklerdeki gibi kelime ve manasi seklinde bir kuillanim varidr.
        "key" kismi tekrarsiz, value kismi tekrarli olabilir (key=value)
        Elemanlarin tamamina entrySet denilir.
        Entry.ler tekrarsiz oldugu icin EntrySet denir.
        "Key" ve Value.lar ayri ayri data tiplerinde olabilirler.
        "Map"ler Collection degildir.
        Hashmapler entry.leri rastgele siralar, bu yüzden en hizli map.tir.
         */

        HashMap<String, Integer> countryPopulation= new HashMap<>();
        countryPopulation.put("Germany", 83000000); //Map.lerde add() methodu yok put()methodu var,
        // put() methodu entry ekler-daha büyük isler icin kullanilir,
        // add() methodu node ve eleman ekler- daha kücük isler icin kullanilir.
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000}

        // get() methodu key ile calisir ve Value return eder.
        int germanPopulation=countryPopulation.get("Germany");
        System.out.println(germanPopulation);//83000000

        Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        Collection<Integer> values=countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 30000000]

        //Example1: CountryPopulation map.indeki ülkelerin nüfus ortalamasini nedir?

        Collection<Integer> value=countryPopulation.values();
        int sum=0;
        for (Integer w: value) {
            sum=sum+w;
        }
        System.out.println(sum/value.size());//122800000

        // entrySet() Map.teki entry.leri kalip halinde alip  bize Set olarak verir
        //Loop.lar Map.ler ile kullanilamaz, bunun icin entrySet() methodunu kullaniriz.

        Set<Map.Entry<String,Integer>> entries= countryPopulation.entrySet();// entrySet kullaninca Map görünümlü Set elde etmis oluruz.
        System.out.println("entries = " + entries);//entries = [Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000]
        //Memory.de bir Set olusturduk, bu defa elemanlari <Map.Entry<String,Integer>> <> icerisindeki herseydir.
        //Map.deki entryler bu Set.in elemanidir.

        //Example2 : countryPopulation Map.indeki ülkelerinin isimlerinin character sayisi ile nüfus toplamini bulunuz.

        int toplam=0;
        for ( Map.Entry<String,Integer>  w: entries  ) {
            toplam=toplam+ w.getKey().length()+ w.getValue();
        }
        System.out.println(toplam);//614000033






    }



}
