package b151practices.practice;

import java.util.Scanner;

public class Prac_04If {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter quantity : ");// miktar
        int x= s.nextInt();
        if((x*100)>1000){
            System.out.println("Indirim miktari "+(0.1*x*100)+" ödemeniz gereken tutar :"+ (x*100-(0.1*x*100)));
        }else{
            System.out.println("Indirim hakkiniz yok ve ödemeniz gereken tutar :"+(x*100));
        }

    }
}
