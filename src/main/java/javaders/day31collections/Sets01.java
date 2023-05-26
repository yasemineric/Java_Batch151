package javaders.day31collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)Set.ler tekrarsiz(==> unique) eleman depolamak icin kullanilir.
    2) 3 tane Set class vardir.
        a) HashSet Class:
        ""Hash" benzersiz bir ID olusturma teknigidir. Bu teknige Hashing Technique denir.
        "HashSet" elemanlari rastgele siralar.
        "HashSet" elemanlari siralamadigindan cok hizli calisir.
        "HashSet" ler tekrarsiz eleman depolamak icin kullanilir.
        "HashSet" ler "null" i eleman olarak kabul ederler.--Tekrarsiz eleman kabul ettigi icin 1 tane null kabul eder.

        b)LinkedHashSet Class:
        "LinkedHashSet" elemanlari sizin verdiginiz siraya göre(Insertion Order) dizdiklerinden Hashsetlere göre yavastirlar.
        "LinkedHashSet"ler tekrarsiz eleman depolamak icin kullanilir.

        c) TreeSet Class:
        "TreeSet"ler elemanlari natural order(kücükten büyüge, alfabetik sira)'ya göre dizerler.
        " TreeSet"ler elemanlari natural order.a göre dizdiklerin cok yavastirlar.
        En yavas set "TreeSet"lerdir.
        "TreeSet"ler tekrarsiz eleman depolamak icin kullanilir.

     */

    public static void main(String[] args) {

        HashSet<String> hs= new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");// Tekrarli eleman eklediginizde hata vermez, ama tekrarli olan elemani bir kere depolar
        System.out.println(hs);//[Fatih, Sema, Rana, Merve, Tuba]--Rastgele bir sira verdi.

        System.out.println(hs.hashCode());//149615145

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);
        lhs.add(null);//Tekrarli olani birdaha depolamiyor.
        System.out.println(lhs);//[313, 19, 353, 7, null]--Insertion Order

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);//[313, 195, 353, 17]

        lhs.retainAll(ls);// Diger List ile ortak elemanlari lhs listinin icinde verdi, ortak olmayan elemanlari sildi.
        System.out.println(lhs);//[313, 353]
        System.out.println(ls);//[313, 195, 353, 17]


        TreeSet<Character> ts= new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);--Hata verir, kabul etmez
        System.out.println(ts);//[A, G, R, U, Z]
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));// G verilen elemandan bir önceki elemani verir.
        System.out.println(ts.lower('D'));//A

        System.out.println(ts.higher('R'));// U
        System.out.println(ts.higher('T'));//U

        System.out.println(ts.headSet('R')); //[A, G] R haric olmak üzere R.ye kadar olan elemanlari verdi
        System.out.println(ts.headSet('R', true));//[A, G, R]--Esnek bir methoddur, true yazarak R.yi de ekliyoruz

        System.out.println(ts.tailSet('R'));// [R, U, Z]-Verilen eleman dahil sekilde kalan elemanlari verir.
        System.out.println(ts.tailSet('R', false));//[U, Z], R.yi dahil etmek istemedigimizde false dememiz yeterli.

        System.out.println(ts.ceiling('R'));//R--Girilen eleman Listede varsa onu veriyor
        System.out.println(ts.ceiling('T'));//U--Eger girilen eleman set.in icerisinde yoksa, olsaydi nerede olurdu, ona göre sonraki elemani veriyor.

        System.out.println(ts.floor('G'));// G--Girilen eleman Listede varsa onu veriyor
        System.out.println(ts.floor('T'));//R--Eger girilen eleman set.in icerisinde yoksa, olsaydi nerede olurdu, ona göre onceki elemani veriyor.

        System.out.println(ts.subSet('G','Z'));//[G, R, U]--Bitis elemani haric sekilde set ediyor.
        System.out.println(ts.subSet('G', false,'Z', true));//[R, U, Z]--Istedigimizi dahil, istedigimizi haric tutabiliriz.








    }





}
