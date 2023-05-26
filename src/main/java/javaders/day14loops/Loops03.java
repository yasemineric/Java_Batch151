package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        int i=1;
        while(i<1){
            System.out.println("while loop");
            // bu haliyle ekrana hicbirsey yazmaz
            // while loop.da loop bady.sini hic calismamasi mumkundur
            //(Zero execution is possible)

            i++;
        }
        // do-while-loop
        //while kontrol yapar kodu oyle calistir.
        //do-while  calistirir sonra kontrol eder.Genellikle oyunlarda do-while kullanilir

        int k=1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        //kullanici bir sayi girsin. sayi 100.den kücük ise kullanici kazandiniz msj.i alsin.
        // diger durumlarda kaybettiniz msj.i alsin

        Scanner input= new Scanner(System.in);

        do{
            System.out.println("Please enter an Integer");
            int n=input.nextInt();
            if (n<100){
                System.out.println("Won!");
            }else{
                System.out.println("lost");
                break;
            }
        }while(true);// buradaki boolean true: eger islem dogru ise calismaya devam ettiriyor, yeniden sayi alip isleme devam ediyoruz

        //kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kod yazin
        do{
            System.out.println("Please enter a sentence" );
            String s= input.next();
            if(s.endsWith(".")&&(s.charAt(0)>='A')&&(s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
            break;
            }
        }
        while(true);


    }//main
}//class
