package b151practices.day02practice;

import java.util.Scanner;

public class C05_Ternary {
    /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein");
        int num=scan.nextInt();
        //System.out.println(num%2==0?("Cift Sayi"):(num+3));--HÖ
        //String str = sayi%2==0?"Çift Sayıdır":""+(sayi+3);--ÖÖ
        Object result= num%2==0?"gerade Zahl": num+3;
        System.out.println(result);


    }

}
