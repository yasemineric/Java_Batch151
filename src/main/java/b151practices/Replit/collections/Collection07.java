package b151practices.Replit.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection07 {
    /*
    bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

1. elemandan itibaren yazdıralım.

 Beklenen Çıktı:

beyaz
mavi
yesil
turuncu

     */
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("sari");
        s.add("beyaz");
        s.add("mavi");
        s.add("yesil");
        s.add("turuncu");

        Iterator itr= s.iterator();
        itr.hasNext();
        itr.next();
        itr.remove();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }


}
