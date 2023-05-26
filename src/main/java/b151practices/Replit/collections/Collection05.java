package b151practices.Replit.collections;

import java.util.ArrayList;

public class Collection05 {

    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
Beklenen Çıktı:
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]

siyah

mavi

kirmizi

yesil

mor

turuncu
``` */
        ArrayList<String> renkler=new ArrayList<>();
        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mor");
        renkler.add("turuncu");
        System.out.println("Orjinal array list: "+renkler);

        for (String w:renkler) {
            System.out.println(w);
        }




    }
}
