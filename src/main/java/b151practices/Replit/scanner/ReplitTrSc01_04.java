package b151practices.Replit.scanner;

import java.util.Scanner;

public class ReplitTrSc01_04 {
    public static void main(String[] args) {
        /*
        1)Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :");
        int num1=scan.nextInt();
        System.out.println((num1*num1*num1)/2);


         /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kenar uzunlugunu giriniz :");
        int kenar=input.nextInt();
        System.out.println("Alan: "+(kenar*kenar));
        System.out.println("Cevre: "+(4*kenar));

        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
         */
        System.out.println("lütfen Dikdörtgenin birinci kenar uzunlugunu giriniz:");
        int k1= input.nextInt();
        System.out.println("lütfen Dikdörtgenin ikinci kenar uzunlugunu giriniz:");
        int k2=input.nextInt();

        System.out.println("Alan: "+(k1*k2));
        System.out.println("Cevre: "+(2*(k1+k2)));

        /*04Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr


Örnek Çıktı:
çay=10
şeker=2
Yılda 12.41 kg şeker kullanıyor.

         */

        System.out.println("Lütfen Günde kac adet cay ictiginizi giriniz:");
        int teeQ=input.nextInt();
        System.out.println("Lütfen caya kac adet seker attiginizi giriniz");
        int zuckerQ=input.nextInt();
        System.out.println("cay="+teeQ);
        System.out.println("seker="+zuckerQ);
        double konsum=teeQ*zuckerQ*1.7*365/1000;
        System.out.println("Yilda "+konsum+" kg seker kullaniyor");


      /*4)
        Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
        r=7;
        Pi=3.14
        Ipucu:
        Dairenin Cevresi : 2*Pi*r
        Dairenin Alani : Pi*r*r
        Ornek Cikti:
        43.96
        153.86
                */
        int r=7;
        double pi=3.14;
        double daireninCevresi=2*pi*r;
        double daireninAlani=pi*r*r;
        System.out.println(daireninCevresi);
        System.out.println(daireninAlani);





    }
}





