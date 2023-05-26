package b151practices.Replit.collections;

import java.util.TreeSet;

public class Collections15 {
/*
Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
Beklenen Çıktı:
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
ilk elemen: kirmizi
son eleman: yesil
```
 */
public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<>();
    ts.add("sari");
    ts.add("mavi");
    ts.add("yesil");
    ts.add("kirmizi");
    ts.add("turuncu");
    ts.add("pembe");
    System.out.println("Orjinal Tree: "+ts);
    System.out.println("ilk elemen: "+ts.first());
    System.out.println("son eleman: "+ts.last());

}



}
