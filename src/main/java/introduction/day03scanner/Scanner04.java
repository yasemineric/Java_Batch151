package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin dört islem yapan ve islemlerin sonuclerini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki adet sayi giriniz :");

        double firstNumber= input.nextDouble();
        double secondNumber= input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);







    }
}
