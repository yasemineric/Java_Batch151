package b151practices.Replit;

import java.util.Scanner;

public class ReplitEng {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your weight");
        int weight= input.nextInt();

        System.out.println("please enter your height");
        double height= input.nextDouble();

        double bmi=(weight/(height*height));

        System.out.println(bmi);
        if(bmi<18.5){
            System.out.println("you are week");
        }else if (bmi>=18.5 && bmi<26) {
            System.out.println("your weight is ideal ");
        } else if (bmi>24&&bmi<31) {
            System.out.println("you are fat");

        } else if (bmi>29) {
            System.out.println("you are obese");
        }

    }
}
