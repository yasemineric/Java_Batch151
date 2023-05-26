package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan iki sayidan kücük olani ekrana yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enetr two integers...");
        int first= input.nextInt();
        int second= input.nextInt();
        //1.Yol: Use If else
        if(first<second){System.out.println(first);}else{System.out.println(second);}

        //2.Yol: Use Ternary
        //first<second mü?öyleyse,degilse else
        int result=first<second? first: second;
        System.out.println(result);

    }//main
}//class
