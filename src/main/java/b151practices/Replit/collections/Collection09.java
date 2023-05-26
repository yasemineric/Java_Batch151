package b151practices.Replit.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection09 {
    /*
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
Beklenen Çıktı:
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]

LinkedList Tersi:
mor
beyaz
kirmizi
yesil
mavi
sari
     */
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("sari");
        s.add("mavi");
        s.add("yesil");
        s.add("kirmizi");
        s.add("beyaz");
        s.add("mor");
        System.out.println("Orijinal linked list: "+s);
        System.out.println("LinkedList Tersi: ");
        Iterator<String> itr= s.descendingIterator();
        while (itr.hasNext()){
            String eleman=itr.next();
            System.out.println(eleman);
        }





    }
}
