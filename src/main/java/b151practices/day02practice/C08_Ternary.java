package b151practices.day02practice;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu sisteme girmesini isteyiniz.
        Girilen not;
        not>100 ise konsola "100 den buyuk not giremezsiniz" yazdırın
        not>89 ise konsola "A" yazdırın
        not>79 ise konsola "B" yazdırın
        not>69 ise konsola "C" yazdırın
        not>59 ise konsola "D" yazdırın
        not>49 ise konsola "E" yazdırın
        not>-1 ise konsola "F" yazdırın
        degilse " negatif not giremezsiniz" yazdırın

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre Note von 100 ein");
        int n=scan.nextInt();
        String harf= n>100? "Sie können keine Note über 100 eingeben": n>89?
                "A":n>79?
                "B":n>69?
                "C":n>59?
                "D":n>49?
                "E":n>-1?
                "F":"Sie können keine negative Note eingeben";


        System.out.println(harf);











    }
}
