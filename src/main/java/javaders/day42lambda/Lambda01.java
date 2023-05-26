package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        System.out.println(sortWithLastCharDistinctUpperInList(names));//[MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));//[alexander, michael, alex, alex, mary, jim, tom]
        System.out.println(isLengthMoreThanTwo(names));//true
        System.out.println(noLengthLessThanThree(names));//true
        System.out.println(atLeastOneLengthLessThanFour(names));//true--Jim, Tom


    }
//Ex 1: List elemanlarını son harflerine göre natural order'da tekrarsız olarak büyük harfle bir List'in içinde return ediniz
//           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());// Normalde distinct elemanalri depolamak icin"Set" kullanilir.
        //Ama Lambda daki 'To Set' methodu elemanlari rastgele siralar.Halbuki bu soruda rastgeel siralama kabul edilmiyor.
        //Bu yüzden mecburen collect(Collectors.toList()); kullandik.

        /*
        Eger collect methodunu Set ile kullanmak istersek, kodumuz kizarir. Bu durumda methodumuzun data type'ini
List yerine Set olarak degistiririz. Bu durumda problem cozulmus olur. Ancak baska bir problem ile
karsilasiriz. Yukarida kodumuz icine yazdigimiz sorted methodunu kabul etmez. Cunku toSet icinde HashSet
kullanilir ve HashSet elemanlari sirali olarak degil rastgele siralar. Bu sekilde kodumuzu tamamlayamadik.
Oyleyse kodumuzda toSet degil to List kullanmamiz gerektigini anladik.
Normalde distinct elemanlari depolamak icin Set kullanilir. Ama Lambda'daki toSet methodu elemanlari rastgele
siralar. Sorumuzda siralama istenmeseydi, distinct de olunca toSet kullanmak okunurluk acisindan daha dogru olurdu.
         */


    }

    //Example2: List elemanlarini karakter sayilarina göre ters sirada kücük harfle bir list.in icinde return ediniz.
    //Ayni karakter sayisina sahip elemanlar kendi icinde alfabetik sirada olsun.
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
       return names.
               stream().
               map(String::toLowerCase).
               sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
               collect(Collectors.toList());
    }


    //Example3:  List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz
    public static boolean isLengthMoreThanTwo(List<String >names){
        return names.stream().allMatch(t->t.length()>2);
    }

    //Example 4: List elemanlarinin hicbirinin karakter sayisinin 3 den kücük olmadigini kontrol edelim.
    public static boolean noLengthLessThanThree(List<String >names){
        return names.stream().noneMatch(t->t.length()<3);
        /*
        Bu soruda yeni olan seyler: Elemanlarin hicbiri dendigine gore noneMatch methodu kullanilacak.
       Yine boolean bir method olusturduk. sirasiyla return names.stream().noneMatch(t->t.length()<3);
       noneMetch, allMatch.in tersidir.
         */
    }
    //Example 5: List elemanlarinin en az birinin caharacter sayisinin 4.ten kücük olup olmadigini kontrol eden method olusturunuz
    public static boolean atLeastOneLengthLessThanFour(List<String >names) {
        return names.stream().anyMatch(t -> t.length() < 4);
    }






}
