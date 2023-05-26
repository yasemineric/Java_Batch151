package javaders.day07stringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        // ****************endWith*****************

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd :" + isEnd);//true

        // EX: s stringindeki money kelimesini dolar kelimesi ile degistir.

        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);

        String s2 = s.replace("Java", "Etwas");// Lwin Java win money
        System.out.println("s2 = " + s2);

        Boolean isDa = s.contains("earn");
        System.out.println(isDa);

        //Ex: s deki earn kelimesini win kelimesine ceviriniz
        System.out.println(s.replace("earn", "win"));

        // s stringindeki a harflerini * ile degistiriniz

        String s3 = s.replace("a", "*");
        System.out.println("s3 = " + s3);
        String s4 = s.replace('a', '*');
        System.out.println("s4 = " + s4);

        // tekli karakterler ile de coklu karakterler ile de calisir.Ancak her iki tarafta da "" yada '' kullanilmalidir


        //Ex: n harfini "*** ile deistiriniz"
        String s5=s.replace("n","***");
        System.out.println("s5 = " + s5);

        //Ex: s Stringindeki tum " e" harflerini siliniz

       String s6=s.replaceAll("e","");// burada char secemeyiz, cunku char hiclik olmaz bosluk olur
        System.out.println("s6 = " + s6);

      /*
      char data type. inin icerisine mutlaka bir karakter yerlestirilmelidir.

      */

        //  replaceAll

     String t= "Yucel 25 ya$inda sandik ama 30'mis!";
     // Ex: t stringindeki tum rakamlari  *  yapiniz

        String t1=t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);

        /*
En cok Kullanilan Regexler
1) Tum Rakamlar ==> [0-9]
2) Tum Kucuk Harfler ==> [a-z]
3) Tum Buyuk Harfler ==> [A-Z]
4) Tum  Harfler ==> [a-zA-Z]
5) Tum  Harfler ve Rakamlar ==> [a-zA-Z0-9]
6) Tum Noktalama Isaretleri ==> \\p{Punct}
7) Tum sesli harfler [aeiouAEIOU]
8) haric demek icin ^ kullanilir
9) Tüm sesli harfler haric [^aeiouAEIOU]

        1) Tum Rakamlar Haric ==> [^0-9]
        2) Tum Kucuk Harfler Haric==> [^a-z]
        3) Tum Buyuk HarflerHaric ==> [^A-Z]
        4) Tum  Harfler Haric==> [^a-zA-Z]
        5) Tum  Harfler ve Rakamlar Haric==> [^a-zA-Z0-9]
        6) Tum Noktalama Isaretleri Haric==> ^\\P{P}
        7) Tum Sesli Harfler Haric==> [^aeiouAEIOU]

         */

        // Ex: T stringindeki tüm harf ve rakamlari unleme ceviriniz

       String t2= t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println("t2 = " + t2);

        // Ex: tüm space disindaki karakterleri + yapin

        String t3= t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3);

        //Ex : t String'indeki tum kucuk harfler disindaki
        //    karakterleri ? 'ne donusturunuz

        String t4=t.replaceAll("[^a-z]", "?");
        System.out.println("t4 = " + t4);

      //Ex : t String'indeki tum sesli harfler disindaki
      // karakterleri & 'ne donusturunuz

        String t5= t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);


    }

}
