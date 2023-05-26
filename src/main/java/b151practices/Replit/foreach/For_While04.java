package b151practices.Replit.foreach;

import java.util.Scanner;

public class For_While04 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.


                Input : 6

        Output: 6!=6*5*4*3*2*1=720
           */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz: ");
        String str="";
        int num=input.nextInt();
        int result=1;

        for(int i=num;i>0;i--){
            result=result*i;
        }
        for(int i=num;i>1;i--){
            str=str+i+"*";

        }
        System.out.println(num+"!"+"="+str+1+"="+result);
    }
}
