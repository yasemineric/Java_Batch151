package b151practices.Replit.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections12 {
    /*
    Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
Beklenen Çıktı:
Tree Set Elemanlari:
kirmizi
mavi
sari
turuncu
yesil
     */
    public static void main(String[] args) {
        HashSet<String > hs=new HashSet<>();
        hs.add("sari");
        hs.add("mavi");
        hs.add("yesil");
        hs.add("turuncu");
        hs.add("kirmizi");
        TreeSet<String > ths =new TreeSet<>(hs);
        System.out.println("Tree Set Elemanlari:");
        for (String w:ths) {
            System.out.println(w);
        }

    }


}
