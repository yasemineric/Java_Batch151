package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        // Kullanicidan bir dikdorgenin iki kenar uzunlugunu aliniz.
        //1.Alanini hesaplayiniz.
        //2.Cevresini hesaplayiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir dikdörgen icin iki kenar uzunlugu giriniz");

        double kisaKenar= input.nextDouble();
        double uzunKenar= input.nextDouble();

        double alan = uzunKenar*kisaKenar;
        double cevre = 2*(kisaKenar+uzunKenar);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
