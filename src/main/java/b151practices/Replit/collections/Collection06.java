package b151practices.Replit.collections;

import java.util.LinkedList;

public class Collection06 {
    /*
    Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
LinkedList elemanları: sari,mavi,mor,yesil,beyaz
Beklenen Çıktı:
sari
mavi
mor
yesil
beyaz
     */

    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("sari");
        s.add("mavi");
        s.add("mor");
        s.add("yesil");
        s.add("beyaz");

        for (String w:s) {
            System.out.println(w);

        }


    }
}

