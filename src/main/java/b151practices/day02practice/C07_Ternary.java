package b151practices.day02practice;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner scan = new Scanner(System.in);
        char chr = scan.next().charAt(0);
        System.out.println((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z') ?
                (chr >= 'a' && chr <= 'z' ? "Kücük Harf" : "Büyük Harf") : ("Harf degil"));

    }
}
