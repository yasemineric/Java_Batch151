package b151practices.practice;

import java.util.Scanner;

public class Prac_01 {
    public static void main(String[] args) {
        /*
Kullanicidan bir double sayi aliniz.
1) Sayi eger 0 ise "Zero"
2) Sayi pozitif ise
    a) 1'den kucuk ise "Positive small number"
    b) 1.000.000'dan buyuk ise "Positive large number"
3)Sayi negatif ise
    a) 1'den kucuk ise "Negative small number"
    b) 1.000.000'dan buyuk ise "negative large number"  (bkz resim)
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Pleasse enter a number :");
        double number= input.nextDouble();

        if(number>0){
            if(number<1){
                System.out.println("Positive small number");
            } else if (number>1000000) {
                System.out.println("Positive large number");
            }else{
                System.out.println("Positive number");
            }

        } else if (number<0) {
            if(Math.abs(number)<1){
                System.out.println("Negative small number");
            } else if (Math.abs(number)>1000000) {
                System.out.println("Negative large number");
            }else{
                System.out.println("Negatif Number");
            }

        }


    }
}
