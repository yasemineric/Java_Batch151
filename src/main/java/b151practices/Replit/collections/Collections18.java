package b151practices.Replit.collections;

import java.util.PriorityQueue;

public class Collections18 {
    public static void main(String[] args) {
        /*
        Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
priority queue elemanları: sari,yesil,mavi,kirmizi
Beklenen Çıktı:
Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
         */
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("sari");
        pq.add("yesil");
        pq.add("mavi");
        pq.add("kirmizi");
        System.out.println("Priority Queue elemanlari: "+pq);

    }
}
