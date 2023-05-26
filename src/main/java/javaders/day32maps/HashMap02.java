package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //Verilen cümledeki kelimelerin görünüm sayisini veren kodu yaziniz
        //"I like to move it, move it do you like it?"=> I=1, like=2, to=1, move=2, it=3, do=1, you=1
         //"I like you, like like! => T=1, like=3, you=1

        //like ile like!. i aynni yapabilmek icin tüm noktalama isaretlerini silelim.
        String s="I like you you, like like!";
        System.out.println(s);//I like you, like like!

        s=s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim, bu yüzden split(" ")  kullanacagim.
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String,Integer> occ=new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w: words) {
            Integer numOfOccurance=occ.get(w);// get method.u key. ile o kelimenin görünümünü verir, yoksa null verir.
            if (numOfOccurance==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurance+1);//yada--occ.put(w,numOfOccurance+1);
                // Ama sadece value. degistirilecegi icin replace method.u kullanilmalidir.
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}








    }
}
