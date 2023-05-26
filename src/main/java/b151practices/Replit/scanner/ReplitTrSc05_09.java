package b151practices.Replit.scanner;

import java.util.Scanner;

public class ReplitTrSc05_09 {
    public static void main(String[] args) {
        int imax =Integer.MAX_VALUE;
        int imin=Integer.MIN_VALUE;
        System.out.println(imax);
        System.out.println(imin);

        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        float f=3.25f;
        short newFloat=(short)f;
        System.out.println(newFloat);

        //7.Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        double d=2.5632;
        int newD=(int)d;
        System.out.println(newD);

        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.


Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
         */
        int saat=1, dakika=10, saniye=50;
        int sumSaniye=saat*60*60+10*60+saniye;
        System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye ==>"+'\n'+sumSaniye+" saniye");

      /*Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:
   Verilen tamsayının rakamları toplamı 10'dur.
       */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayi giriniz");
        int num=input.nextInt();//312
        int num1St=num%10;//2
        int num2St=(num/10)%10;//1
        int num3St=num/100;//3
        System.out.println("Verilen tamsayının rakamları toplamı "+(num1St+num2St+num3St)+"'dur.");




    /*Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen saniye miktari giriniz");
        int minuten =scan.nextInt();
        int year= minuten/60/24/365;
        int gun=minuten/60/24-year*365;
        System.out.println(minuten+" dakika yaklasik "+ year+" yil "+gun+" gündür");






    }
}
