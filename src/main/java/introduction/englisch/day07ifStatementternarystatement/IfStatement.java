package introduction.englisch.day07ifStatementternarystatement;

public class IfStatement {
    public static void main(String[] args) {
        //ex1:type a code to check if a given character is upper case or lower case or others
        // 1)To get true from && operation everthing should be true
        // 2) Just a single false is enough to make the result false
        //3) && operation is perfectionist

        char ch = '5';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");

        } else {
            System.out.println("Others...");
        }
// Ex:2 If a number is less than 300 or greater than 3000
// print "Perfect number" otherwise "Regular Number" on the console

        int num = 3200;
        if (num < 300 || num > 3000) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Regular Number");
        }

        //Note: To get false from || operation everthing shuld be false
        //Note2: To make the result of || operation having just a single true is enough
        //Note3: || operation is optimist

         // Ex.3. Type code to check if a number is Even(cift-the remainder is zero) or Odd(tek)
        int n=7;
        if(n%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
      // type code to print the number of months for the given month name
        // February--2, May--5 Tam-- invalid month name

        String monthName="Tom";
        if( monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid month name");
        }



    }// main
}//class
