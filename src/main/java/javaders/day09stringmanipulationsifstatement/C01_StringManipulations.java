package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // ~~~~~~~~~~~~~~~~ isEmpty()~~~~~~~~~~~~~~~~~~
        //bos mu dolu mu diye bakar. Bize boolean bie deger döndurur.
        // Ex: Bir stringin hic karakter icermedigini gösteren kodu yaziniz

        String str ="";
        //1.Weg
        boolean istLeer=str.length()==0;// burda hem uzunluga baktik hem de = karsilastirma methodu kullandik
        System.out.println("istLeer = " + istLeer);

        //2.Weg
        boolean istLeer2=str.isEmpty();// burada sadece tek islem yapildigi icin bu tercih edilir
        System.out.println("istLeer2 = " + istLeer2);

        // Ex: bir stringin bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String str2="  ";
        //1.Weg
       boolean result= str2.replace(" ","").length()==0;
        System.out.println("result = " + result);
        //2.Weg
        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);

        // Ex: bir stringin "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String str3="*a";
        boolean rslt3 =str3.replace("*","").isEmpty();
        System.out.println("rslt3 = " + rslt3);


        // ~~~~~~~~~~~~~~~~ isBlank()~~~~~~~~~~~~~~~~~~
        /*
        isBlank Methodu String bir datada space+hiclik icin true döndurur
        Bosmu dolumu oldugunu kontrol eder. Boolean bir deger döndurur.
        is Empty den farki variable da sadece bosluk varsa bos mu dolu  mu diye soruldugunda
        isBlank ==> bos der
        isEmpty ==> bos degil der.
         */
        boolean rslt4= str2.isBlank();
        System.out.println("rslt4 = " + rslt4);// true
        boolean rslt5=  str2.isEmpty();
        System.out.println("rslt5 = " + rslt5);// false


        //~~~~~~~~~~~~~~~~ indexOf()~~~~~~~~~~~~~~~~~~

        //icine girdigimiz karakterin ilk görunumunun indexini verir
        //tekli veya coklu her iki karakter icinde kullanilabilir

        // Ex: Bir stringde a,i,e karakterlerinin ilk gorunumlerinin indexleri toplamini yazdirin

        String r ="Java is easy to Learn";
        int aIdx=r.indexOf('a');
        int iIdx=r.indexOf('i');
        int eIdx=r.indexOf('e');
        int SumOfIndex= aIdx+iIdx+eIdx;
        System.out.println("SumOfIndex = " + SumOfIndex);//14

        // Ex: Bir string de Java kelimesinin ilk olarak kacinci indexte
        // kullanildiginio gösteren kodu yaziniz
        // coklu datalarda String ifadenin  ilk karakterinin indexini dondurur
        //olmayan bir datanin kacinci indexte oldugunu sorgulatirsak bize -1 döndurur



        String u="Ah java vah Java sen ne guzel seysin Java ";
        int javaIdx= u.indexOf("Java");
        System.out.println("javaIdx = " + javaIdx);//12

        int pythonIdx= u.indexOf("Python");
        System.out.println("pythonIdx = " + pythonIdx);//-1 olmayan bir datanin kacinci indexte oldugunu sorgulatirsak bize -1 döndurur

        //~~~~~~~~~~~~~~~~ lastIndexOf()~~~~~~~~~~~~~~~~~~
        /*
        lastIndexOf methodu string bir datada verilen karakter yada karakterlerin
         son görunumunun indexlerini verir
        olmayan bir datanin kacinci indexte oldugunu sorgulatirsak bize -1 döndurur
         */

        //Ex: Bir stringde a,i,e karakterlerinin son gorunumlerinin indexleri toplamini yazdirin

        String v ="Java is easy to Learn";
        int aLIdx=v.lastIndexOf('a');
        int iLIdx=v.lastIndexOf('i');
        int eLIdx=v.lastIndexOf('e');
        int SumOfLIndex= aLIdx+iLIdx+eLIdx;
        System.out.println("SumOfLIndex = " + SumOfLIndex);



    }//main
}//class
