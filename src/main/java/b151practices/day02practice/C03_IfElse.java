package b151practices.day02practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
         /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort, das länger als 3 Character ist");
        String word= scan.next();
        if (word.length()<4){
            System.out.println("Sie müssen ein Wort, das länger als 3 Character ist, geben  ");
        }else{
            String lastThrdChr= word.substring(word.length()-3);
            System.out.println(lastThrdChr+word+lastThrdChr);
        }





    }
}
