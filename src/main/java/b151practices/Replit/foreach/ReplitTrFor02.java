package b151practices.Replit.foreach;

import java.util.Scanner;

public class ReplitTrFor02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
	Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
         */
        /*Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki adet tam sayi giriniz:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int GCD=0;
       for(int i=1;i<=num1;i++){
           if(num1%i==0&& num2%i==0){
               GCD=i;
           }
       }
        System.out.println(num1+" ve "+num2+" icin GCD = "+GCD);
       int LCM=0;
       int max= num1*num2;
       for(int i=max;i>0;i--){
           if(i%num1==0&&i%num2==0){
              LCM=i;
           }
       }
        System.out.println(num1+" ve "+num2+" icin LCM = "+LCM);

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki adet tam sayi giriniz:");
        int sayi1= input.nextInt();
        int sayi2=input.nextInt();
        int GCD=0;
        for (int i = 1; i <sayi1 ; i++) {
            if(sayi1%i==0&&sayi2%i==0){
                GCD=i;
            }

        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD = "+GCD);

        int LCM=0;
        int maxOrtakKat=sayi1*sayi2;
        for (int i = maxOrtakKat; i>0 ; i--) {
            if(i%sayi1==0&&i%sayi2==0){
                LCM=i;
            }
        }System.out.println(sayi1+" ve "+sayi2+" icin LCM = "+LCM);







    }
}
