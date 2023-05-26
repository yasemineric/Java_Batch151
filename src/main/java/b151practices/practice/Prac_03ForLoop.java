package b151practices.practice;

import java.util.Scanner;

public class Prac_03ForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int n= input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }



    }
}
