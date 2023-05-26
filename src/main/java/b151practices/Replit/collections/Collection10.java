package b151practices.Replit.collections;

import java.util.Collections;
import java.util.LinkedList;

public class Collection10 {
    /*
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
**hint:  Collections.swap();**
Beklene Çıktı:
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
*/
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("mavi");
        s.add("kirmizi");
        s.add("beyaz");
        s.add("siyah");
        s.add("yesil");
        s.add("turuncu");
        System.out.println("Orijinal linked list: "+s);
        //Collections.swap(s,0,3);
        s.set(0,"**siyah**");
        s.set(3,"**mavi**");
        System.out.println("Swap sonrası durum: "+s);




    }
}
