package javaders.day33maps;
import java.util.HashMap;
import java.util.TreeMap;
public class HashMap01 {
    public static void main(String[] args) {
        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurrenceOfLetters(s));
        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    }
    public static TreeMap<String, Integer> getTheNumOfOccurrenceOfLetters(String s) {
        //String'deki harf disi character'leri sil
        s = s.replaceAll("[^A-Za-z]", "");
        //Gorunum sayilarini depolamak icin Map olustur.
        /*
        once HashMap ile yaptik fakat alfabetik sira olsun diye TreeMap' cevirdik beoylelikle alfabetik bir siraya sahip olduk..
        Javada alfabetik sirada once buyuk harf ardindan kucuk harf gelir. Cunku buyuk harf ascii value'si kucuk harflerinkinden kucuktur.
         */
        TreeMap<String, Integer> numOfOccurrence = new TreeMap<>();
        //Harfleri al
        String letters[] = s.split("");
        for (String w : letters) {
            Integer numOfOcc = numOfOccurrence.get(w);
            if (numOfOcc == null) {
                numOfOccurrence.put(w, 1);
            } else {
                numOfOccurrence.replace(w, numOfOcc + 1);
            }
        }
        return numOfOccurrence;
    }
}






