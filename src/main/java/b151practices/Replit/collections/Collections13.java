package b151practices.Replit.collections;

import java.util.TreeSet;

public class Collections13 {
    /*
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
Beklenen Çıktı:
beyaz
kirmizi
mavi
sari`
siyah
yesil
```
     */
    public static void main(String[] args) {
        TreeSet<String> ts= new TreeSet<>();
        ts.add("yesil");
        ts.add("mavi");
        ts.add("kirmizi");
        ts.add("sari");
        ts.add("beyaz");
        ts.add("siyah");

        for (String w:ts) {
            System.out.println(w);
        }
    }


}
