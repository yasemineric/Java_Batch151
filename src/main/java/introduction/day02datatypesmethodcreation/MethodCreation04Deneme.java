package introduction.day02datatypesmethodcreation;

import java.util.Scanner;

public class MethodCreation04Deneme {
    public static void main(String[] args) {
        int quiz, vize, ffinal;
        double ortalama;
        Scanner input = new  Scanner(System.in);

        System.out.println("Quiz notunu giriniz : ");
        quiz= input.nextInt();
        System.out.println("Vize notunu giriniz : ");
        vize=input.nextInt();
        System.out.println("Final notunu giriniz : ");
        ffinal=input.nextInt();

        ortalama = (quiz*0.2)+(vize*0.35)+(ffinal*0.45);
        System.out.println("Not ortalamaniz :" + ortalama);

        String sonuc=(ortalama>=50)? "Gectiniz": "Kaldiniz";
        System.out.println(sonuc);



    }

}
