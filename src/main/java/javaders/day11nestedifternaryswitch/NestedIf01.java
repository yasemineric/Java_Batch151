package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

         /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
System.out.println("Lutfen cinsiyetinizi giriniz");
System.out.print("Lütfen yaşınızı giriniz: ");
int yas = input.nextInt();

if (yas < 0 || yas >= 120) {
    System.out.println("Lütfen geçerli bir yaş giriniz!");
} else {
    System.out.print("Lütfen cinsiyetinizi giriniz (E/K): ");
    char cinsiyet = input.next().charAt(0);

    if (cinsiyet == 'E') {
        if (yas >= 65) {
            System.out.println("Emekli olabilirsiniz.");
        } else {
            System.out.println("Emekli olamazsınız.");
        }
    } else if (cinsiyet == 'K') {
        if (yas >= 60) {
            System.out.println("Emekli olabilirsiniz.");
        } else {
            System.out.println("Emekli olamazsınız.");
        }
    } else {
        System.out.println("Lütfen geçerli bir cinsiyet giriniz!");
    }
}

 */

        //1) Eger bir If.in icerisine baska bir if girilmisse nestedIf denilir. Nested: Yuvalama
        //2)Nested Ifler Java yi yavaslatir bu yuzden mecbur kalmadikca kullanmayiz-
        //3) Nested If gibi Java.yi yavaslatan kodlar "Time consuming" olarak adlandirilir

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();
        System.out.println("Please enter your gender...");// male, female
        String gender = input.next();
        if(age<0|| age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
        }
        else if (gender.equalsIgnoreCase("male")) {// equalsIgnorcase(): esitlige bak ama buyuk kücük harfe bakma
            if (age > 65) {                              // male: Male, mALE,MALE.MalE
                System.out.println("Can be retired");
            } else {
                System.out.println("Should work");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age > 60) {
                System.out.println("Can be retired");
            } else {
                System.out.println("Should work");
            }

        } else {
            System.out.println("Undefined gender");
        }


    }//main

}//class
