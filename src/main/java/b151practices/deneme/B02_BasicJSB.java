package b151practices.deneme;

public class B02_BasicJSB {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
       karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
       ‘Miami’ için i yazdırmalısınız
         */
        String s="Ben Benim ";
       int lastChrIdx=  s.trim().length()-1;
       String lastChr=s.substring(lastChrIdx,lastChrIdx+1 );
        System.out.println("lastChr = " + lastChr);

        /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.
         */

        String s1="Yasemin";
        int firstChrAscii=s1.charAt(0);
        int lastChrIdx1 =s1.length()-1;
        int lastChrAscii=s1.charAt(lastChrIdx1);
        System.out.println(" Ilk ve son karakterlerinin ASCII değerlerinin toplamı :"
                +(firstChrAscii+lastChrAscii) );


       /* Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        yazdırınız.

        */
        String s2="Yasemin";
        String sNeu= s2.substring(1);
        System.out.println("sNeu = " + sNeu);

        /*
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
büyük harfle yazdırınız.
         */
        String s3= "Yasemin";
        int s3lastChrIdx=s3.length()-1;
        String s3Neu= s3.substring(0,s3lastChrIdx).toUpperCase();
        System.out.println("s3Neu = " + s3Neu);

        /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
karakterleri büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */

        String s4="Yasemin";
        int s4lastChrIdx=s3.length()-1;
        String s4Neu =s4.substring(1,s4lastChrIdx).toUpperCase();
        System.out.println("s4Neu = " + s4Neu);


    }
}
