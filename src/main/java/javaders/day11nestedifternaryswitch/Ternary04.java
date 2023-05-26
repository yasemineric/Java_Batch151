package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    // Kullanicidan aldiginiz sayi cift ise yarisini aliniz, tek ise bu sayi bölunmez yazdiriniz
    // Ternaryde true ve false icin size verilen data tipleri farkli ise
    // olusturdugunuz conteyner.in data type.ini object yapin. Object java daki butun classlarin "Parent"idir.
    // (Hz.Adem gibi ortak ata)
    // Object classin Parent.i yoktur. Javada Parent.i olmayan tek class Object.tir
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter an Integer...");
        int num= input.nextInt();

        Object result= num%2==0?(num/2):"Bu sayi ikiye bölünmez";
        System.out.println(result);
    }
}
