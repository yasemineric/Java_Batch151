package b151practices.Replit.conditional;

import java.util.Scanner;

public class Con01 {
    public static void main(String[] args) {
        /*
        Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
Test data :21
Beklenen Çıktı:
 Sayı Pozitif
Test data :-15
Beklenen Çıktı:
 Sayı Negatif
Test data :0
Beklenen Çıktı:
 Sayı Sıfır
         */
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if(input>0){
            System.out.println("Sayı Pozitif");
        }else if (input<0){
            System.out.println("Sayı Negatif");
        }else{
            System.out.println("Sayı Sıfır");
        }


    }
}
