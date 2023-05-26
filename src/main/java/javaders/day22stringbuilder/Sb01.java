package javaders.day22stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1)String Builder string üreten bir class.dir
        2)String Class kullanarak String üretiriz.Java nicin StringBuilder Class.i da olusturdu?
        "String" Class "immutable(degistirilemez)" String uretir,
        "String Builder" Class mutable(degistirilebilir) String üretir.
        3) "Immutable" olmak demek orijinal degerin korumasi,degistirilemez olmasi demektir.
        "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir.
        4) Capacity Java.nin size verdigi Data Depolama yer sayisidir.
         Length ise size verilen Data Depolama yerinin kullanilan kismidir
         5) Java baslangic olarak size capacity.i 16 verir.
         Siz verilen Capacity.i asarsaniz Java yeni kapasiteyi var olanin 2 katinin 2 fazlasi olarak verir.
         */
        String s = "Java";
        s = s + "!";// s.nin orijinal degerini böylee bir atatma yaparak degistirebiliriz. Heap memory.de de orijinal deger degisir.
        //Normalde atama operatörüyle islem yapmadan s. yi degistirmek istersek, orijinal deger ayni kalir, Heap memory.de ayrica bir kutu acilir; yeni deger icin.

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        // String Builder nasil olurturulur.
        //1.Way
        StringBuilder t = new StringBuilder("Python");// burda olustururken icine String.i koyuyoruz
        System.out.println(t);//Python
        //append()--eklemek demek. t. deyince cikan methodlar non-static methodlardir. cünkü obje üzerinden cagiriliyor.
        t.append("!").append("...");// Method  Chain-üstüste method ekleme
        // Mutable olanlarda adres degismez, varolan update edilir.
        System.out.println(t);//Python!...

        //2.way
        StringBuilder r = new StringBuilder();// burda olustururken icini bos birakiyoruz
        System.out.println(r);

        r.append('c');
        System.out.println(r);

        // "capacity" ve "length" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");// burada Money icin 5 adet kapasite ve ekstra yaninda 16 kutucuklu capacite vardir. Toplam21

        int capacity = sb1.capacity();
        System.out.println(capacity);//21--

        int length = sb1.length();
        System.out.println(length);//5-- "Money" String.inde 5 adet karakter var

        sb1.append("!").append(".................");// 17 nokta daha ekledik
        int c = sb1.capacity();
        System.out.println(c);//21-//21*2+2=44--17 nokta ekleyince capasitenin disina cikti. Var olan degerin iki katini ekledi, bir de 2 tane fazladan ekledi.

        int ln = sb1.length();
        System.out.println(ln);//6-//23

        // Default capacity.i degistirebilir miyiz?
        StringBuilder sb2=new StringBuilder(2);//Capacity.i bastan belirtebiliriz
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//2*2+2=6(var olanin iki kati + 2)

        StringBuilder strBld = new StringBuilder("LearnJava");
        strBld.substring(3);
        System.out.println(strBld);//LearnJava
        System.out.println(strBld.substring(3));//rnJava

        StringBuilder str = new StringBuilder("LearnJava");
        int index = str.indexOf("e", 4);
        System.out.println(index);//-1


        //: append(char[] ch) method'u char array eklemek için kullanılır.
        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb.append(ch);
        System.out.println(stb);//Learn JAVA

        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());



    }

}
