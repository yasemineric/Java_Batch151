package b151practices.deneme;

import java.util.Scanner;

public class JavaK_ForLoop_10 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;

            }
        }
        System.out.print(carpim);
        System.out.println(toplam);
        scan.close();

         */


        /*int sum=0;
        for(int i=10; i>0; i=i-5) {
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println(sum);

         */

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }


        int sum=0;
        for(int i=10; i>0; i=i-5) {
            sum=sum+i;
        }
        System.out.println(sum);

        int num = 1;
        while(num<10) {
            if(num%3==0){
                System.out.print(num + " ");
            }
            num=num+1;
        }

        /*int num = 3;
        while(num<10) {
            System.out.print(num + " ");
            num=num+3;
        }

         */



    }
    }

