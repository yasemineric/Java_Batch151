package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
   // *********** toUpperCase***********

        String a= "Benim Tek Rakibim Dunku Ben.";
        String aUpper= a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        // *********** toLowerCase***********
        String aLower=a.toLowerCase();
        System.out.println("aLower = " + aLower);

        // *********** charAt()***********
        // a Stringindeki ilk karakteri aliniz

        System.out.println("ilk Harf :" +a.charAt(0));
        System.out.println(a.charAt(10));

        //
        char firstChar = a.charAt(1);
        char lastSecondChar= a.charAt(19);

        System.out.println("firstChar+lastSecondChar :" + firstChar+" "+lastSecondChar);// basa String bir karakter koymazsak Ascii degerlerini toplar.

        // **************Lenght**********
        // a Stringinde bulunan karakter sayisini bulunuz.
        int uzunluk=a.length();
        System.out.println(uzunluk);

        //**************SubString**************
        // a Stringindeki ilk 4 datayi yazdiriniz
        System.out.println(a.substring(0,4));// 0 dahil 4 haric[0,4)==> 0.index,1.index,2.Index,3.index alinir
        // 4. indexten itibaren alinmaz

        // a stringindeki 4. index dahil 7; haric yazdirin
        System.out.println(a.substring(4,7));//m T
        //a stringindeki (Rakip) kelimesini aliniz
        System.out.println(a.substring(10,15));// rakib
        System.out.println(a.substring(10));//Rakibim Dunku Ben.

        //**************contains**************
        // a Stringinde bim kelimesini olup olmadigini kontrol ediniz
        boolean varmi= a.contains("bim");
        System.out.println(varmi);
        //**************startswith()**************
        // a stringinin T harfi ile baslayip baslamadigini kontrol ediniz

        a.startsWith("T");
        System.out.println(a.startsWith("T"));
        a.startsWith("Tek",3);
        System.out.println(a.startsWith("Tek",3));

        // hukuk 33, eczacilik55, bilgisayar 66

        String str= "20105501";
        str.startsWith("33",4);// ilk dort karakteri at, sonrasi 33 ile basliyor mu baslamiyor mu



    } // main
}//class
