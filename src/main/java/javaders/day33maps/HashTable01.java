package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        /*
        "HashMap" ile "HashTable" arasindaki fark nedir?
        i) "HashMap" "thread-safe" degildir,"HashTable"  "thread-safe" dir.--thread-safe: pek cok görevi ayni anda yapabilme
           "HashMap" "synchronized" degildir, "HashTable" "synchronized" dir.
        ii)"HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'e musaade eder.
           "HashTable" key'lerde ve value'larda da "null" kullanilmasina musaade etmez.
        iii)"HashMap" hizlidir, "HashTable" "HashMap"e gore yavastir.
        NOTE:"HashMap" ve "HashTable" ikisi de entry'leri rastgele siralar

         */

        Hashtable<String , Integer> stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85);--"HashTable"larin key.lerine null konulamaz-Hata verir.
        //stdAges.put("Chris",null);--"HashTable"larin value.larina da null konulamaz-Hata verir.
        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}

       //HashTable'larda get, put,keyset, getOrDefault, remove elements methodlari var.(HashMap'de elements methodu yok)


    }
}
