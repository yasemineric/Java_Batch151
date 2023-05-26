package b151practices.day01practise;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi arasinda bosluk birakacak sekilde giriniz");
        String name= scan.nextLine().toUpperCase();
        char frstChr=name.charAt(0);

        char scndChr=name.split(" ")[1].charAt(0);// 2.yöntem: char scndChr=name.charAt(name.indexOf(" ")+1)- bosluktan sonraki ilk karakteri aliyoruz
    System.out.println(""+frstChr+scndChr);

    }//main
}//class
