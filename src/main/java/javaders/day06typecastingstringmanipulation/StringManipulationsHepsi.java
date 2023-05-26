package javaders.day06typecastingstringmanipulation;

public class StringManipulationsHepsi {
    public static void main(String[] args) {
       //1) concatenation()

        String name ="VeLi";
        String surname ="Gezer";
        System.out.println(name + " " + surname); //1.yol
        System.out.println(name.concat(" ")+ (surname)); //2.yol

        System.out.println("*******************");

/// 2)charAt(0)

        String kurs= "Hayat Güzeldir";
        System.out.println(kurs.charAt(6)); //G

        System.out.println("*******************");

// 3) toUpperCase()
// 4) toLowerCase()

        System.out.println(name.toUpperCase()); //büyük harf
        System.out.println(name.toLowerCase()); //küçük harf

        System.out.println("*******************");

// 5) equals(); Verilen 2 String'in birbirine eşit olup olmadığını kontrol eder
        String test= "Life is Beautiful";
        String test2= "Life is Beautiful";
        System.out.println(test.equals(test2)); //true

        String test3= "Techproeducation";
        String test4= test3+"";
        System.out.println(test3==test4); //false; == 2String objesinin değerinin yanında
        //referance'larına da bakar.
        System.out.println(test3.equals(test4)); // true

        System.out.println("*******************");


// 6) equalsIgnoreCase(): büyük-küçük gözetmeden karşılaştırır.
        String kitap="Olasılıksız";
        String kitap2= "OLASILIKSIZ";
        System.out.println(kitap.equalsIgnoreCase(kitap2)); //true

        System.out.println("*******************");

// 7) lenght()
        String word= "All is well";
        System.out.println(word.length()); //11

        String space="";
        System.out.println(space.length()); // 0?- 1?

        String null1= "null";
        System.out.println(null1.length()); //hata?- ""sil

        System.out.println("*******************");

// 8) indexOf(): İstenen karakterin kullanildigi ilk index'i döndürür.
        String book= "Adam Fawer, Olasılıksız";
        System.out.println(book.indexOf('w')); //7-tek tırnak
        System.out.println(book.indexOf("w")); //7-çift tırnak
        System.out.println(book.indexOf("t")); //-1, olmayan karakter
        System.out.println(book.indexOf("Olası")); //12
        System.out.println(book.indexOf("a",4)); //6- belli bir index'ten sonrası sorgulanabilir

        System.out.println("*******************");

// 9) lastIndexOf(): İstenen karakterin kullanildigi son index'i döndürür.
        String book2= "Adam Fawer, Olasılıksız";
        System.out.println(book.lastIndexOf('ı')); //21-tek tırnak
        System.out.println(book.lastIndexOf("ı")); //21-çift tırnak
        System.out.println(book.lastIndexOf("t")); //-1, olmayan karakter
        System.out.println(book.lastIndexOf("ılık")); //16
        System.out.println(book.lastIndexOf("a",20)); //14- belli bir index'ten öncesi sorgulanabilir

        System.out.println("*******************");

// 10) contains(): String'in istenen karakterleri içerip içermediğini kontrol eder.
        //true- false döndürür.
        String str= "Çok çalış, dolar kazan:)";
        System.out.println(str.contains("t")); //false -contains methodu char için kullanılmaz, String zorunludur
        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("dolar")); //true

        System.out.println("*******************");

// 11) endWith(): String'in istenen karakterler ile bitip bitmediğini kontrol eder
        String str1= "Automation Tester";
        System.out.println(str1.endsWith("n")); //false
        System.out.println(str1.endsWith("r")); //true
        System.out.println(str1.endsWith("ter")); //true

        System.out.println("*******************");

// 12) startWith(): String'in istenen karakterler ile başlayıp başlamadığını kontrol eder
        String str2= "Automation Test Engineer";
        System.out.println(str2.startsWith("A")); //true
        System.out.println(str2.startsWith("T")); //false
        System.out.println(str2.startsWith("Auto")); //true
        System.out.println(str2.startsWith("o",3)); //true

        System.out.println("*******************");

// 13) isEmpty(): String datanın içinde hiçbir şey yoksa true döndürür.
        //Space=karakter ==>false
        String method="Ne çok method varmış böyle";
        System.out.println(method.isEmpty()); //false

        String method2="";
        System.out.println(method2.isEmpty()); //true

//String method3=null;
//System.out.println(method3.isEmpty()); //hata verir

        System.out.println("*******************");

// 14) replace(): //Metnin içerisindeki belirli bir datanın yerine verilen diğer datayı
        //yerleştirir. (Money yerine Dolar)
        //String bir data döndürür.
        //Tekli (Char) karakterler ile de çoklu karakterler ile de çalışır.

        String soz= "Methodları öğrenmek çok kolay";
        System.out.println(soz.replace("a","*")); //Methodl*rı öğrenmek çok kol*y
        System.out.println(soz.replace("e","3")); // M3thodları öğr3nm3k çok kolay
        System.out.println(soz.replace("çok","&")); // Methodları öğrenmek & kolay
        System.out.println(soz.replace("o","?")); // Meth?dları öğrenmek ç?k k?lay

        System.out.println("*******************");

// 15) replaceAll(): Bir grup datayı değiştirmek için kullanılır.
        //Bir grup datayı ifade edebilmek için regular Expression (Regex)kullanılır

        String dene= "Java'da rakamlar 1234567890";
        System.out.println(dene.replaceAll("a","*")); //J*v*'d* r*k*ml*r 1234567890
        System.out.println(dene.replaceAll("\\s","*")); //s space ==> Java'da*rakamlar*1234567890
        System.out.println(dene.replaceAll("\\S","*")); //S space dışındaki tüm karakterler ==>******* ******** **********
        System.out.println(dene.replaceAll("\\w","*")); //w harfler ve rakamlar (a-z,A-Z,0-9) ==> ****'** ******** **********
        System.out.println(dene.replaceAll("\\W","*")); //W harfler ve rakamlar dışındaki tüm karakterler ==> Java*da*rakamlar*1234567890
        System.out.println(dene.replaceAll("\\d","*")); //d rakamlar (0-9) ==>Java'da rakamlar **********
        System.out.println(dene.replaceAll("\\D","*")); //D rakamlar dışındaki tüm karakterler ==> *****************1234567890

        System.out.println("*******************");

// 16) replaceFirst():  replace() ile aynı işi yapıyor ancak ilk gördüğü datayı değiştiriyor.
        String dene1= "Java'da rakamlar 1234567890";
        System.out.println(dene.replaceFirst("a","*")); //J*va'da rakamlar 1234567890
        System.out.println(dene.replaceFirst("lar","*")); //Java'da rakam* 1234567890
        System.out.println(dene.replaceFirst("\\s","*")); //Java'da*rakamlar 1234567890
        System.out.println(dene.replaceFirst("\\D","*")); //*ava'da rakamlar 1234567890

        System.out.println("*******************");

// 17) substring(): İki kullanımı vardır.
        //i) Başlangıç ve bitiş indeksi verilirse; başlangıç indeksi dahil,
        //bitiş indeksi hariç yazılır.
        //Metnin ortasından data almamızı sağlar.
        //ii) (başlangicIndexi), String'in verilen indexten sonuna kadar alınmasını sağlar.

        String str4= "Java OOP konsepti kullanır";
        System.out.println(str4.substring(5,11)); //OOP ko
        System.out.println(str4.substring(3,5)); //a
        System.out.println(str4.substring(9,10)); //k
        System.out.println(str4.substring(6,16)); //OP konsept


        System.out.println("*******************");

// 18) trim(): String'in başındaki ve sonundaki space'leri temizler.

        String dene2= "  Java'da  rakamlar 1234567890     ";
        System.out.println(dene2);
        System.out.println(dene2.length()); //35
        System.out.println(dene2.trim());
        System.out.println(dene2.trim().length()); //28

// 19) valueOf(): String olan methodu sayı haline getirir.
        String sayi="123";
        String sayi2="456";
        System.out.println(sayi+sayi2);
        System.out.println(Integer.valueOf(sayi)+Integer.valueOf(sayi2));



// 20) isBlank(): Space + hiçlik ise true döndürür.
        //String bir datanın boş mu dolu mu olduğuna bakar.
        //isEmpty'den farkı space varsa yine true döndürür.

// 21) split():

        String t="Java is Good";
        System.out.println(t.split(" ")[2].charAt(0)); //





    }
}
