package b151practices.day02practice;

import java.util.Scanner;

public class C04_IfElse {
    /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte geben Sie erstes Wort ein");
        String wort1=scan.next();
        System.out.println("Bitte geben Sie zweites Wort ein");
        String wort2=scan.next();
        if(wort1.length()%2==0){
            String wort1Halb=wort1.substring(0,wort1.length()/2);
            String wort1LastHalb=wort1.substring(wort1.length()/2);
            System.out.println(wort1Halb+wort2+wort1LastHalb);
        }else{
            System.out.println("Sie können zweites Wort nict in der Mitte des erstes Wort legen, weil erstes Word ungerade Character ist.");
        }

    }

}
