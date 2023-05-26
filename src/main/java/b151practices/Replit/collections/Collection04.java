package b151practices.Replit.collections;

import java.util.ArrayList;

public class Collection04 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
Array Elemanları: sari,yesil,mavi,pembe
**mavi rengini turuncu ile değiştirelim.**
Beklene Çıktı:
[sari,yesil,mavi,pembe]
[sari,yesil,turuncu,pembe]

         */
        ArrayList<String > renkler= new ArrayList<>();
        renkler.add("sari");
        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("pembe");
        System.out.println(renkler);

        renkler.set(2,"turuncu");
        System.out.println(renkler);





    }
}
