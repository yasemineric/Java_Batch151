package b151practices.day_06_practice;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
     /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1-4 arasi islem numarasi giriniz: " + " \n" +
                "     işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın");
        int islemNo = scan.nextInt();
        int bakiye = 1000;

        switch (islemNo) {
            case 1:// bakiye sorgulama
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;
            case 2:// para cekme
                System.out.println("Cekmek istediginiz parayi giriniz");
                int cekilecekPara = scan.nextInt();
                if (cekilecekPara <= bakiye) {
                    bakiye = bakiye - cekilecekPara;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz : " + bakiye + "TL");
                } else {
                    System.out.println("Bakiyeniz yetersiz");
                }
                break;

            case 3:// Para yatirma
                System.out.println("Yatirmak istediginiz paray miktarini giriniz");
                int yatirilacakPara = scan.nextInt();
                if (yatirilacakPara <= 2000) {
                    bakiye = bakiye + yatirilacakPara;
                    System.out.println("Para yatirma isleminden sonraki mevcut bakiyeniz : " + bakiye + "TL");
                } else {
                    System.out.println("ATM'de günlük para yatirma limiti 2000 TL'dir");
                }
                break;

            case 4:
                System.out.println("TechPro Bank'i kullandiginiz icin tesekkur ederiz");
                break;

            default:
                System.out.println("Gecerli bir islem numarasi giriniz");


        }


    }//main
}//class
