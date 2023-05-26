package javaders.Day20methodoverloadigarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

        // Arraylerde Primitive data Typleri ve Reference.lar islenir. ArrayList.te ise class.lari tutar.
        // Array List nasil olusturulur
        ArrayList<Integer> ages = new ArrayList<Integer>();// Burada ArrayList<Integer>(); Constructor.dir
        //ArrayList console.a nasil yazdirilir?
        System.out.println(ages);//[]
        //ArrayListlere eleman nasil eklenir?
        //Array List.te eleman eklemek icin ad() methodunu kullaniriz.
        //add() methodu elemanlari sizin verdiginiz sirada List.e ekler

        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9,12,10];// verdigimiz siraya göre ekleme yapmasina Insertion Order denir
        ages.add(1, 656);
        System.out.println(ages);
        ages.add(3, 777);
        System.out.println(ages);
        ages.add(888);// Eger sona eleman eklemek gerekirse index girmeye gerek yok. Direk add ile ekleriz
        System.out.println(ages);

        // List.e coklu eleman nasil eklenir? Veya List.e baska bir List nasil eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);
        ages.addAll(2, newAges);// Yeni List.i istedigimi index.e atayabiliriz
        System.out.println(ages);

        // ArrayList.te eleman sayisi nasil bulunur
        //size() methodu bir List.teki eleman sayisini bize verir.
        int numOfElements = ages.size();
        System.out.println(numOfElements);

        //ArrayList.te specific bir eleman nasil alinir
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);

        //ArrayListte specifi bir eleman nasil degitirilir
        ages.set(2, 313);// 2.indexteki sayiyi 313 yap
        System.out.println(ages);
        ages.set(4, 353);
        System.out.println(ages);

        //Bir List.teki tüm elemanlari nasil silebiliriz
        //ages.clear();
        //System.out.println(ages);
        // ArrayList.te specific bir elemanin var olup olmadigini nasil anlariz?
        // ages bir class objesidir. Obje üzerinden gördügümüz methodlar non-static.tir
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir ArrayList.in bos olup olmadigini nasil kontrol ederiz
        boolean r1 = ages.isEmpty();
        System.out.println(r1);


        //ex1) Bir Listin bos olup olmadigini kontroleden bir kod yazin
        ArrayList<String> names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");
        //1.way-Bu cok tercih edilmez
        if (names.size() == 0) {// List.in size.i, Array.in Length.i
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }
        names.clear();

        //2.way-bu daha kisa bir yol
        if (names.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }

        // Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz
        // Iki list.in esit olabilmesi icin ayni index.te ayni elemanlar olmalidir

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("ali");
        names2.add("fatih");
        names2.add("ufuk");

        boolean r3 = names1.equals(names2);
        System.out.println(r3);

        // Verilen iki Integer List.te tamamiyla ayni elemanlar olup olmadigini kotrol ediniz
        // Once sort methodu ile siralama yapariz sonra ayni olup olmadigina bakilir

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(9);
        nums1.add(8);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean r4 = nums1.equals(nums2);
        System.out.println(r4);


    }
}


