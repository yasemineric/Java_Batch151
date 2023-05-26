package b151practices.Replit.collections;

import java.util.TreeSet;

public class Collections16 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
Beklenen Çıktı:
Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
Tree eleman sayısı: 5
         */
        TreeSet<String >ts=new TreeSet<>();
        ts.add("yesil");
        ts.add("sari");
        ts.add("mavi");
        ts.add("kirmizi");
        ts.add("pembe");
        System.out.println("Orjinal TreeSet: "+ts);
        System.out.println("Tree eleman sayısı: "+ts.size());


    }
}
