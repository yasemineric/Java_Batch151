package b151practices.practice;

import java.util.Random;
import java.util.Scanner;

public class Prac_While02 {
    public static void main(String[] args) {
         /*
               1) random olarak 1 ile 100 arasinda bir sayi olusturun
               2) kullanicidan bu sayiyi bilmesini isteyin
               3) kullanici her deger girdiginde tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
               4) kullanici tuttugumuz sayiyi bildiginde eger tahmin sayisi;
                    a) 3 veya daha az tahminde bildiyse "Vaowww"
                    b) 4-8 tahminde bildiyse "Aferin"
                    c) daha fazla tahminde bildiyse "basarisiz"
               yazdirin
            */


     //int tutulanSayi=65;
        Random rnd=new Random();// bizim yerimize rastgele rakam seciyor
        int tutulanSayi=rnd.nextInt(100);

     int tahmin=0;
     int tahminSayisi=0;// counter

        while(tutulanSayi!=tahmin){
            Scanner scan= new Scanner(System.in);
            System.out.println("Tahmininiz : ");
            tahmin= scan.nextInt();
            if(tahmin==tutulanSayi){
                tahminSayisi+=1;
            }else if (tahmin<tutulanSayi){
                System.out.println("Buyut");
                tahminSayisi+=1;
            }else{
                System.out.println("Kucut");
                tahminSayisi+=1;
            }
        }
        if(tahminSayisi<=3) {
            System.out.println("Vaooow");
        } else if (tahminSayisi<=4&&tahminSayisi<=8) {
            System.out.println("Aferin");
        }else{
            System.out.println("Basarisiz");
        }



    }
}
