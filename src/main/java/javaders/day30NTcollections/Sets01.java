package javaders.day30NTcollections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
        Kendinizden kisaca bahseder misiniz?
        HashSet: "Elemanlari eklemek, aramak ve depolamak da asiri hizliyimdir. Tutmayin beni!"
        LinkedSet: "Bana verilen elemanlari verildigi gibi dizerim. Kafama estigi gibi siralamam. Siradaki?"
        TreeSet: "Verilen elemanlari buyukten kucuge, a'dan z'ye dizerim. Kusura bakma z kardes, son koltuk sana tahsisli"
     */
    /*
        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
        2)3 tane Set Class vardir;
          i) HashSet Class:
                  "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                  "HashSet" elemanlari rastgele siralar.
                  "HashSet" elemanlari siralamadigindan cok hizli calisir.
                  "HashSet" "null"i eleman olarak kabul eder.
                  "HashSet"ler tekrarsiz eleman depolamak icindir.

          ii)LinkedHashSet Class:
                  "LinkedHashSet" elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order) "HashSet"lere gore yavastirlar.
                  "HashSet"lere gore yavastir.
                  "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.

          iii)TreeSet Class:
                  "TreeSet"ler elemanlari natural order'a gore dizerler
                  "TreeSet"ler elemanlari natural order'a gore dizdiklerinden coooook yavastirlar.
                  En yavas Set "TreeSet"tir.

          3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz

     */


    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklediginizde hata vermez, ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);

        System.out.println(hs);//[Zeki, Ajda, Cuneyt, Esra, Ezel]

        System.out.println(hs.hashCode());//2038751948

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124]==> Ilk LinkHashSet'teki farkli elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124]

        TreeSet<Character> ts=new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');

        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G>> Verilen eleman olan R'den bir onceki elemani verir
        System.out.println(ts.higher('K'));// R ==> Verilen K'den sonraki elemanı verir.

        System.out.println(ts.headSet('R'));//[A, G]==> Parantez icindeki R dahil degildir.
        System.out.println(ts.tailSet('G'));//[G, R, U, Z]==> Parantez içinde "G" dahildir.
        System.out.println(ts.headSet('R', true));//[A, G, R]
        System.out.println(ts.tailSet('G', false));//[R, U, Z]==> Parantez icindeki G dagil degildir.

        System.out.println(ts.ceiling('R'));//R==> ELeman set'in içinde varsa elemanın kendisi  return eder.
        System.out.println(ts.ceiling('K'));//R ==> Eleman set'in içinde yoksa Alfabetik sırada sonraki eleman returm eder.

        System.out.println(ts.floor('G'));//G==> Eleman Set'in icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.floor('J'));//G==> Eleman Set'in icinde yoksa onceki elemani return eder.

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U]-- ilk parametre dahil, ikinci parametre haric tutulur
        // U.yu yazdirmak istiyorsak, u.dan sonraki herhangi bir karakteri girebiliriz.
        System.out.println(ts.subSet('G', false, 'Z', true));//[R,U,Z]





    }



}
