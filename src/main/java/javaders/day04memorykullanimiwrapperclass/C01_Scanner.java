package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {
    // kullanicidan aldigniz 5 basamakli bir sayini ilk iki
    // ve son iki basamgindaki sayilarin toplamini yazdiran
    // kodu olusturunuz

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bitte geben Sie 5 stellige Zahl ein: ");

        int num =input.nextInt();

        int lastDigit = num%10; //1 nimm die LastDigit
        num=num/10;      // 3867 mach die Zahl weniger
        int lastSecondDigit= num%10;// 7
        num=num/10; // 386
        int lastThirthDigit= num%10;// 6
        num=num/10; //38
        int lastForthDigit= num%10;//8
        num=num/10;// 3
        int lastFifthDigit= num%10; //3
        num=num/10;

        int sonuc= lastDigit+lastSecondDigit+lastForthDigit+lastFifthDigit;
        System.out.println("sonuc = " + sonuc);






    }//main
}//class
