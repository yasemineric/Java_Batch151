package b151practices.deneme;

import java.util.Scanner;

public class SwitchDeneme01 {
    public static void main(String[] args) {
        /*
         Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
             Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
            INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
                  a+b>c>a-b
                  a+c>b>a-c
                  b+c>a>b-c
                  a=b=c ise es kenar ucgen

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Bitte geben Sie 3 Nummer...");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        if((a+b>c && c>a-b)||a+c>b && b>a-c||b+c>a&&a>b-c) {
            if(a==b&&b==c){
                System.out.println("Das ist ein gleiches Dreieck");
            }
            System.out.println("Das ist ein Dreieck");

        } else {
            System.out.println("Das ist kein Dreieck");

        }

    }
}
