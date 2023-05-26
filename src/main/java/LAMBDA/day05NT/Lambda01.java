package LAMBDA.day05NT;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args)  throws IOException {
        /*

Lambda da iki tür method var.
1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
2-Kendisinden sonra method kabul eden methodlar.
//Lambda'da da bazi methodlar kendisinden sonra method gosterirken
bazilari kendisinden sonra method gostermez. Bunlarin son method olarak kullanilmasi gerekir.
Bunlara terminal method denir.
 */




        /*
        Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
edecegiz.

1. adim:List olustur

2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

3.adim:map metodu ile harf disindaki karakterleri sil

4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

5.adim:flatMap ile duvari kir ve harflere ulas

6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

sout icine listin ismini yaz ve calistir
         */

        //Example 1 : Verilen text file icindeki text'i console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).forEach(System.out::println);
        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik

        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
        boolean r1 = Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);
        //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik

        //Example 5 : Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);
        //Lambda'da da bazi methodlar kendisinden sonra method gosterirken bazilari kendisinden sonra method gostermez. Bunlarin son method olarak kullanilmasi gerekir.Bunlara terminal method denir.Or:count,

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);
    }




    }



