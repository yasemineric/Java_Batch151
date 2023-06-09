package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    /*
    1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
     */
    public static void main(String[] args) {
        // Nested for-Loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);
            for (int d = 1; d < 8; d++) {
                System.out.println("   Day: " + d);
            }
            System.out.println("   ......");
        }
        //Nested While-Loop

        int i = 1;
        while (i < 5) {
            System.out.println("Week: " + i);
            int d = 1;
            while (d < 8) {
                System.out.println("   Day: " + d);
                d++;
            }
            i++;
            System.out.println("   ......");
        }
      /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
       */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of the rows");
        int rows=input.nextInt();
        System.out.println("Please enter the number of the columns");
        int columns=input.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=columns;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */
        System.out.println("Please enter row number");
        int row=input.nextInt();// burada kullanicidan sutun sayisi almaya gerek yok, cunku o satir sayisina bagli
        for(int m=1; m<=row;m++){
            for(int n=1;n<=m;n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }





    }//main
}//class
