package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // Kullanici gun numarasini girsin; kod gunu yazsin
        // 1== Pazar 2== Pazartesi 3== Sali 4== Carsamba 5=Persembe 6= Cuma  7 == Cumartesi

        /*
        Scanner input=new Scanner(System.in);
 System.out.println("Lütfen 1 ve 7 arası gün numarası giriniz");
 int day= input.nextInt();
if (day==1) System.out.println("Pazar");
else if(day==2) System.out.println("Pazartesi");
else if(day==3) System.out.println("Sali");
else if(day==4) System.out.println("Çarşamba");
else if(day==5) System.out.println("Perşembe");
else if(day==6) System.out.println("Cuma");
else if(day==7) System.out.println("Cumartesi");
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen gun numarasini giriniz\n"+
                        "1== Pazar 2== Pazartesi" +
                        " 3== Sali 4== Carsamba " +
                        "5=Persembe 6= Cuma  " +
                        "7 == Cumartesi");
        byte NumDay= input.nextByte();

        if(NumDay==1){
            System.out.println("Pazar");
        }
        else if(NumDay==3){
            System.out.println("Sali");
        }
        else if(NumDay==4){
            System.out.println(" Carsamba");
        }
        else if(NumDay==5){
            System.out.println(" Persembe");
        }
        else if(NumDay==6){
            System.out.println(" Cuma");
        }
        else if(NumDay==7){
            System.out.println(" Cumartesi");
        }
        else {
            System.out.println("Lütfen gecerli bir numara giriniz ");
        }


    }//main
}//class
