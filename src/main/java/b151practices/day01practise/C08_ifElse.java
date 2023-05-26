package b151practices.day01practise;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {
        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Dienstjahre : ");
        int jahre = input.nextInt();
        System.out.println("Bitte geben Sie Ihre Gehalt ein: ");
        int gehalt = input.nextInt();
        if(jahre>=5){
            System.out.println("Ihr erhöhtes Gehalt: "+(gehalt+gehalt*10/100));
        } else{
            System.out.println("Sie müssen  "+(5-jahre)+ " jahre mehr arbeiten; um erhöhtes Gehalt zu bekommen");
        }



    }//main
}//class
