package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
    /*

    Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran primitve data typelarinin non primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,durum) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****


     */

    public static void main(String[] args) {


        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        // byte data type'inin en buyuk ve en kucuk degerini ekrana yazdirin
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        //Ex : int data type'inin maximum degeri ile byte data type'inin
        // minimum degerinin toplamini hesaplatan methodu olusturunuz
        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMin+ intMax = "+( intMax + byteMin));//byteMin+ intMax = 2147483519


        //**************** Primitive Data Type'larini Wrapper Classlara Nasil Ceviririz ********************
        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat;// buna Autoboxing denir== Otomatik
        // Kutulama Java bunu otomatik olarak yapar kucuk kutuyu buyuk kutuya yerlestirir

        //***************** Wrapper Classlari Primitive Data Typelarina Nasil Ceviririz *****************

        Character wrapperChar ='a';
        char primitiveChar = wrapperChar;  //Unboxing kucuk kutuyu buyuk kutudan cikarma Java bunuda otomatik yapar

        // Ex Verilen iki String datanin toplamini veren kodu yaziniz

        String str1 ="12345";
        String str2 = "678";
        System.out.println(str1+str2);//12345678
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // valueOf() ==> String bir datayi Integer'a donusturur

        /*
        Javada "+" sembolu iki int icin atematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
          i)Uslu Sayilar
          ii)Parantez ici
          iii)carpma/bolme
          iv) toplama/cikarma

         */

        String harf = "A";
        int sayi = 7;
        //harf + sayi==> A7
        /*
        8+3+"K"

        "K"+3*5/2;     //K7  K7.5 K352   K4  K5.5 K6


         */
        String a="K";
        int b=3, c=5,d=2;
        System.out.println(a+b*c/d);//K7


    }//main

}//class

