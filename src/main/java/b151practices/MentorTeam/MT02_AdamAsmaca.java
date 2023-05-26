package b151practices.MentorTeam;

import java.util.Random;
import java.util.Scanner;

public class MT02_AdamAsmaca {
    public static void main(String[] args) {
        //Adam Asmaca
        //Loop, Scanner, Random, If ELse,

        Scanner input = new Scanner(System.in);
        String kelimeler [] = {"elma","armut","kiraz","karpuz","muz","kavun"};
        Random random = new Random();
        String kelime = kelimeler[random.nextInt(kelimeler.length)];
        String tahminEdilenKelime = "_".repeat(kelime.length());
        int hak = kelime.length();

        System.out.println("Adam Asmaca oyununa HOSGELDINIZ!!");

        while (hak>0){

            System.out.println("Kelime, "+kelime.length()+" harfden olusuyor.."+" "+tahminEdilenKelime);
            System.out.println("Bulunan hak sayiniz: "+hak);
            System.out.println("Lutfen harf giriniz: ");
            char harf = input.next().charAt(0);


            if (kelime.indexOf(harf)!=-1){
                System.out.println("Dogru harfi tahmin ettiniz.."); //_ _ m _
                for (int i = 0; i <kelime.length() ; i++) {
                    if (kelime.charAt(i)==harf){
                        tahminEdilenKelime = tahminEdilenKelime.substring(0,i)+harf+tahminEdilenKelime.substring(i+1);
                    }

                }//for


            }else {
                System.out.println("Maalesef yanlis tahmin ettiniz..");
                hak--;
                System.out.println("Kalan hakkiniz: "+ hak);
            }//else

            if (hak==0){
                System.out.println("Maalesef hakkiniz bitti..");
                break;
            }

            if (tahminEdilenKelime.equalsIgnoreCase(kelime)){
                System.out.println("Tebrikler bildiniz: "+ kelime);
                break;
            }

        }//while

    }//main


}
