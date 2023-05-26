package b151practices.Replit.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection11 {
    /*
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
HashSet List: sari,mavi,kirmizi,yesil,mor
Beklenen Çıktı:
TreeSet elements:
kirmizi
mavi
mor
sari
yesil
   */
    public static void main(String[] args) {
        HashSet<String >hs=new HashSet<>();
        hs.add("sari");
        hs.add("mavi");
        hs.add("kirmizi");
        hs.add("yesil");
        hs.add("mor");
        TreeSet<String >ths =new TreeSet<>(hs);
        System.out.println("TreeSet elements:");
        for (String w:ths) {
            System.out.println(w);
        }



    }
}
