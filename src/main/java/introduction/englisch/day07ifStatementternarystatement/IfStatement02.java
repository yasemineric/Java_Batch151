package introduction.englisch.day07ifStatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        // ex.1: Get users age 0-4: Baby
        // 5-12:Kid
        // 13-19: Teenager
        // 21-30: Adult
        // other: Undefined--
        // negative age: Invalid age

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        byte age = input.nextByte();
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age<5) {
            System.out.println("Baby");
        } else if (age<13) {
            System.out.println("Kid");
        } else if (age<20) {
            System.out.println("Teenager");
        } else if (age<31) {
            System.out.println("Adult");
        } else {
            System.out.println("Undefined");
        }


    }//main
}//class
