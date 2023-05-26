package b151practices.Replit.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection03 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

Beklenen Çıktı:
Arrayin 1. elemani: beyaz
Arrayin 3. elemani: sari
         */  //List<String>renkler=List.of("beyaz","siyah","sari","kirmizi","turuncu");
       ArrayList<String > renkler= new ArrayList<>();
       renkler.add("beyaz");
       renkler.add("siyah");
       renkler.add("sari");
       renkler.add("kirmizi");
       renkler.add("turuncu");

        System.out.println("Arrayin 1. elemani: "+renkler.get(0));
        System.out.println("Arrayin 3. elemani: "+renkler.get(2));





    }


}
