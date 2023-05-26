package b151practices.Replit.conditional;

import java.util.Scanner;

public class Con03 {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
Test Data:
12
34
23
Beklenen Çıktı:
En Buyuk Sayi: 34
         */

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int enbuyuk=num1;

        if(num2>enbuyuk){
            enbuyuk=num2;
        }
        if(num3>enbuyuk){
            enbuyuk=num3;
        }
        System.out.println("En Buyuk Sayi: "+enbuyuk);

    }
}
