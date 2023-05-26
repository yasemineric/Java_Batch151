package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    // Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.

    public static void main(String[] args) {
        // Bir tam sayiyi bir tam sayiya bölersek java sonucu kesinlikle tam sayi yapar.
        // Ondalikli kismi iptal eder(yuvarlama yapmaz)

        Scanner input=new Scanner(System.in);
        System.out.println(" Lütfen 5 basamakli bir sayi giriniz...");
        int number= input.nextInt();
        // son rakami al
        // Bir sayinin sonrakamini alabilmek icin o sayiyi 10.a bölüp kalani almaliyis
        // % ==> modulus operator: solunda bulunan sayinin saginda bulunan sayiya bölumünden kalani veriyor.
        // dolayisiyla modulus %10 her zaman bize birler basamaginda bulunan sayiyi verir        //son rakami al
        // bir tam sayiyi bir tam sayiya bölerseniz java sonucu kesinlikle tam sayi yapar.
        // dolayisiyla bir tam sayiyi 10.a bölersek birler basamagini silmis oluruz.

        int lastDigit= number%10;
        // sayi kücült
        number= number/10;

        //sondan ikinci rakami al
        int lastSecondDigit =number%10;
        //sayi kücült
        number= number/10;

        //sondan ücüncü rakami al
        int lastThirdDigit=number%10;
        //sayi kücült
        number= number/10;

        //sondan dörduncu rakami al
        int lastFourthDigit=number%10;
        //sayi kücült
        number= number/10;

        //sondan besinci rakami al
        int lastFifthDigit= number%10;
        //sayi kücült
        number=number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);







    }
}
