package b151practices.Replit.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections14 {
    /*
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
Beklenen Çıktı:
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi
     */
    public static void main(String[] args) {

        TreeSet<String> ts=new TreeSet<>();
        ts.add("yesil");
        ts.add("sari");
        ts.add("mavi");
        ts.add("turuncu");
        ts.add("kirmizi");
        System.out.println("Orjinal Tree sonucu: "+ts);
        Iterator<String> tsItr= ts.descendingIterator();
        System.out.println("Tersten Siralanisi: ");
        for (Iterator<String> it = tsItr; it.hasNext(); ) {
            String w = it.next();
            System.out.println(w);
        }


    }



}