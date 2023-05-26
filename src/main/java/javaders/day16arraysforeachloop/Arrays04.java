package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Size verilen bir cumlede kac kelime oldugunu gösteren kodu yaziniz
        String s="Java is easy, Learn Java earn Money";// bir string.i kestigimizde coklu datayi java array.in icine atar
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy,, Learn, Java, earn, Money]
        System.out.println(words.length);


        //Size verilen bir cumlede kac harf oldugunu gösteren kodu yaziniz

        String letters[]=s.replaceAll("[^a-zA-Z]","").split("");//[J, a, v, a, i, s, e, a, s, y, L,
        // e, a, r, n, J, a, v, a, e, a, r, n, M, o, n, e, y]
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);


    }
}
