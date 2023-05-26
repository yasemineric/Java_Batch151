package b151practices.Replit.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection08 {
    /*
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]

Listenin ilk elemani: sari

listenin son elemani: beyaz
     */
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("sari");
        s.add("mavi");
        s.add("turuncu");
        s.add("siyah");
        s.add("yesil");
        s.add("beyaz");
        System.out.println(s);
        Iterator<String> itr= s.iterator();
        itr.hasNext();
        System.out.println("Listenin ilk elemani: "+itr.next());
       String lastElement=null;
        while(itr.hasNext()){
        lastElement=itr.next();
        }
        System.out.println("listenin son elemani: "+lastElement);

        }






    }

