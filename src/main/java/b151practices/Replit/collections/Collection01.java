package b151practices.Replit.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları:  siyah,sari,mavi,turuncu
Beklenen Çıktı:
siyah
sari
mavi
turuncu
    */
        ArrayList<String > renkler=new ArrayList<>() ;
        renkler.add("siyah");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");

        for (String w: renkler) {
            System.out.println(w);
        }

    }
}
