package b151practices.deneme;

public class B01_Basic {
    public static void main(String[] args) {
        int a= -5+8*6;
        int b=(55+9)%9;
        int c= 20+-3*5/8;
        int d= 5+15/3*2-8%3;
        System.out.println('a'+'b');

        int harf = 'a';
        System.out.println(harf);

        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());



        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n");

       /* Scanner input = new Scanner(System.in);
        System.out.println("Input first Number: ");
        int num1 = input.nextInt();
        System.out.println("Input second Number: ");
        int num2 = input.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
      */


       /* Scanner input = new Scanner(System.in);
        System.out.println("Input first Number: ");
        int num1 = input.nextInt();
        System.out.println("Input second Number: ");
        int num2 = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        System.out.println(num1 + " - " + num2 + " = " + (num1 -num2));
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
         */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num1 = input.nextInt();
        for (int i=0;i<10; i++){
            System.out.println(num1+"*"+(i+1)+"="+(num1*(i+1)));
        }
*/
        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));
    }


}
