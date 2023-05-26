package b151practices.Replit.collections;

import java.util.ArrayList;

public class Collection02 {
    public static void main(String[] args) {
/*
Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
Array List:  siyah,mavi,kirmizi,beyaz
en başa: **pembe**
mavi-kirmizi arasına **yesil**  renk eklenecek.
Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
 */

        ArrayList<String> renkler= new ArrayList<>() ;
        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add   (0,"pembe");
        renkler.add(2,"yesil");
        System.out.println(renkler);




    }

}
