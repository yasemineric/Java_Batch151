package b151practices.day01practise;

import java.util.Scanner;

public class C04_Dikdörtgen {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörgenin a kenarini giriniz: ");
        int a = scan.nextInt();
        System.out.println("Dikdörgenin b kenarini giriniz: ");
        int b = scan.nextInt();
        System.out.println("Dikdörgenin Cevrei : " + ((2 * a) + (2 * b)));

    }
}
