package javaders.day34colllectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Search icin ArrayList
//Cokca Ekelme Cikarma icin LinkedList
//Tekrarsiz datalar icin Set, sira önemli degil performans önemli ise HashSet-sira önemli ise LinkedHashSet
//Hash--Benzersiz ID olusturma teknigi-Hasing technique
//Map-Java.da Aklimiza sözlük gelir.

public class Queues02 {
    public static void main(String[] args) {

        //Queue<String> line= new Queue<>();'Queue' is abstract; cannot be instantiated
        // her iki tarafta Queue secersek hata veriyor, cünkü Queue abstractirdir, constructor olamaz----
        // Sadece basa ekleme cikarma yapilabilir.

        Queue<String> line= new PriorityQueue<>();
        //Variable.lar.da data type. a bakilir, methodlar icin constructor kismina bakilir.
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Queue bir interface.dir, bu yüzden constructor.i yoktur,
        //dolayisiyla object olusturuken new keyword.unden sonra kullanilamaz.
        //Data Type "Queue" olan bir object olusturmak icin new keyword.unden sonra
        //a) LinkedList veya b) PriorityQueue classlari kullanilabilir.

        //Queue olustururken constructor olarak PriorityQueue kullanirsaniz
        //elemanlari kendi belirleyeceginiz kuarala göre siraalam hakkiniz olur.

        //Deque ==> Double ended queue==> iki uclu kuyruk-- hem bastan hem sondan eleman ekleyebiliriz
        //Deque.deki add(), get(), peek(), poll(), remove() methodlari first-last seklinde iki uclu olarak bulunur
        Deque<String> d=new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]--Insertion order sayesinde bu siralamayi yapti







    }






}
