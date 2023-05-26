package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

         /*
    Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana pozitif yazdirin, degilse pozitif degil yazdirin

     */
        Scanner input= new Scanner(System.in);
        System.out.println("please enter an Integer...");
        int num= input.nextInt();
        String result = num>0? "Pozitif":"Pozitif degil";
        System.out.println(result);
    }


}
