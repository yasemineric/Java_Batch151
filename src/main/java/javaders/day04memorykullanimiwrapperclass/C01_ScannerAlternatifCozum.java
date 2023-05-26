package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_ScannerAlternatifCozum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Lütfen 5 basamakli bir sayi giriniz:" );
        int sayi =input.nextInt();
        int basamak5 = sayi%10;
        int basamak4 = (sayi/10)%10;
        int basamak3 = (sayi/100)%10;
        int basamak2 = (sayi/1000)%10;
        int basamak1 = (sayi/10000)%10;
        System.out.println("Sonuç = " + (basamak1+basamak2+basamak4+basamak5));

    }
}
