package javaders.day29NTcollections;

import java.util.LinkedList;

public class LinkedList01 {

    //Coolections ayni tipteki datalari depolamamk icin kullanilir
    public static void main(String[] args) {
        /*
       ArrayList'ler eleman silme ve eklemede  tekrar indexleme yapmak zorunda olduklarindan
       eleman ekleme ve silmede basarisizdirlar.--Eleman bulmada basaridirlar
       1)LinkedList'ler node silme ve ekleme de cok basarili olduklari icin,
       silme ve ekleme islemlerini coklukla yapacaginiz zaman
       LinkedList kullaniniz--ama eleman bulmada basarisizdirlar.
       2)Arraylist.ler index.leri adres gibi kullanir, buyüzden Arraylist.ler search islermlerinde cok basarilidirlar.
       Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (müze ziyaretcileri gibi) LinkedList,
       search islemleri yapacaksa(America eyaletleri gibi) Arraylist kullaniniz.
       NOTE:ArrayList'ler eleman bulmada cok basarilidir , LinkedList'ler ise node bulmada basarisizdir
       ekleme ve cikarmada ise LinkedList'ler daha basarilidir.

 */

        LinkedList<String> s=new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");// Normalde LinkedList index kullanmiyor, Java arka planda node 3 yapiyor.
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove(2);// Ajda

       // s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        //s.remove();//Ilk eleman gider-Kemal--
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

       // s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Kemal, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        //s.removeLastOccurrence("Esra");
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Ajdar]

        String r1=s.peek();//--Ilk elemani bana getirir, ama listeden silmez(copy-paste)
        System.out.println(r1);//Kemal
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]


        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty--List bos ise null verir.
         */
        String r2=s.poll();// ilk elemani size verir ve List.ten siler(cut-paste)
        System.out.println(r2);//Kemal
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
        Note: peek()ile element() ikiside ilk elemani silmeden size verir.
        Ama peek()  List bos oldugunda, size null verir, element() ise hata verir.
        Yani hata almak istiyorsak elemet() kullanmaliyiz
         */
        String r3=s.element();
        System.out.println(r3);//Esra
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        removes and returns the first element of this list.
        This method is equivalent to removeFirst().
        Throws:
        NoSuchElementException – if this list is empty--eger list bossa hata verir.


           Note: poll() ile pop() ikisi de ilk elemani siler ve size verir.
                  Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir.
         */
        String r4=s.pop();
        System.out.println(r4);//Esra
        System.out.println(s);//[Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]


    }





}
