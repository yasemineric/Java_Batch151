package b151practices.Replit.collections;

import java.util.TreeSet;

public class Collections17 {
    public static void main(String[] args) {
        /*
        Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
1. TreeSet: mavi,yesil,kirmizi,sari
2. TreeSet: yesil,mavi,pembe,turuncu
Beklenen Çıktı:
1. TreeSet: [kirmizi,mavi,sari,yesil]
2. TreeSet: [mavi,pembe,turuncu,yesil
Karsilastirma Sonucu:
no
yes
no
yes
         */
        TreeSet<String > ts1=new TreeSet<>();
        ts1.add("mavi");
        ts1.add("yesil");
        ts1.add("kirmizi");
        ts1.add("sari");
        System.out.println("1. TreeSet: "+ts1);

        TreeSet<String > ts2=new TreeSet<>();
        ts2.add("yesil");
        ts2.add("mavi");
        ts2.add("pembe");
        ts2.add("turuncu");
        System.out.println("2. TreeSet: "+ts2);
        System.out.println("Karsilastirma Sonucu:");
        for (String w:ts1) {
            if(ts2.contains(w)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }




    }
}
