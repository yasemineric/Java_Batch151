package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {
        /*
        1) Iterator.lar Looplarin yaptigi ayni isi yaparlar.
        2)Iterator.larda sonsuz Loop olusma ihtimali yoktur.--Bu yüzden java iterator.i olusturmustur.
        3) Iterator.alr ile Loop.lar arasinda performans farki yoktur.
        4)Iterator.lar bir Collection.dan eleman silme ve bir collection,daki elemani degistirme konusunda daha basarilidir.
        5) Iki tip Iterator vardir:
        i)Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya === mümkün degildir.
        ii) ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.

       Note: "Iterator sadece soldan saga(ilk elemandan son elemana) calisir"
             ""ListIterator ise iki yönlu calisabilir.


         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        // "Iterator" kullanimi;
        Iterator<String > myItr= myList.iterator();// burada List.i Iterator.a dönustürmeliyiz.
        while (myItr.hasNext()){// myItr hasNext() Pointer.a senden sonra eleman var mi diye soruyor,
            // eleman varsa true yoksa False döndürür.

            //String el= myItr.next(); //==> next() pointer.i bir sonraki elemanin önüne tasir, ve üstünden atladigi elemani return eder.
            //if (el.equals("Jim")){
               // myItr.remove();
            //}// Sadece belirli bir elemani silmek istersek
            myItr.next();
            myItr.remove();// ==> next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList);//[]


        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String> yourListItr= yourList.listIterator();
        while (yourListItr.hasNext()){
            String el=yourListItr.next();
            yourListItr.set(el+ "!");// set() methodu list.i Update etmeye yarar.
        }
        System.out.println(yourList);//[Tom!, Jim!, Clara!, Angie!, Mark!]

        //Has Previous() ve Previous() nasil kullanilir? Pointer en sonda olmali//[Tom, Jim, Clara, Angie, Mark]
        while (yourListItr.hasPrevious()){// hasPrevious() senden önce eleman var mi, true yada  false döndürür.
            String el= yourListItr.previous();// next() methodu gibi ama tersine atlar, sagdan sola gelerek elemanlari aldirir.
            System.out.println(el);
            yourListItr.set("?"+el);
        }
        System.out.println(yourList);//[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]
        /*
        hasPrevious() senden önce eleman var mi? true yada false dondurur.
        Mutlaka imlec listenin sonunda olmalidir.
         */
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]
        Iterator itr= list.iterator();// [(itr)5, 9, 2, 1, 17, 3] itr objesi olusturduk, böyle olusturunca pointer listenin basinda bekler.
        //String ele=itr.next(); direkt string yapamayiz, wrapper ile yapabiliriz, cünkü bu bir obje, Object data tipi ile de yapabiliriz
        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//9
        itr.remove();
        System.out.println("list = " + list);//[5, 2, 1, 17, 3]
        //itr.remove();-- remove() methodu üzerinden atladigi elemai siler,
        // ancak üzerinden atladigi eleman yoksa hata verir(IllegalStateException)
        //Bu nedenle üstüste iki kez remove methodu kullanilmaz.
        //System.out.println("list = " + list);--Hata verir, cünkü yeni eleman almadik.

        LinkedList<String> ourList=new LinkedList<String >();
        ourList.add("Van");
        ourList.add("Mus");
        ourList.add("Kayseri");
        ourList.add("Izmir");
        ourList.add("Samsun");
        System.out.println(ourList);//[Van, Mus, Kayseri, Izmir, Samsun]
        Iterator<String> ourItr= ourList.descendingIterator();
        while (ourItr.hasNext()){
            String eleman=ourItr.next();
            System.out.print(eleman+" ");//Samsun Izmir Kayseri Mus Van--Normal listenin icerisindeki elemanlari tersine yazdirdi.
        }



    }
}
