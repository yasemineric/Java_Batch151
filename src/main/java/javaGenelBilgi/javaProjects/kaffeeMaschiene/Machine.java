package javaGenelBilgi.javaProjects.kaffeeMaschiene;

import java.util.Scanner;

public class Machine {
    static String hangiKahve="";
    static Scanner scan = new Scanner(System.in);
    static String kahveBoyut ="";

    public static void main(String[] args) {

        giris22();

    }

    private static void giris22() {
        do {

            System.out.println("Hangi kayveyi istersiniz?\n1. Turk Kahvesi\n2. Filtre Kahve\n3. Espresso");
            hangiKahve = scan.nextLine();
            if(!hangiKahve.equalsIgnoreCase("Turk Kahvesi") && !hangiKahve.equalsIgnoreCase("Filtre Kahve") && !hangiKahve.equalsIgnoreCase("Espresso")){
                System.out.println("hatalı tuslama yaptınız");
            }

        }while(!hangiKahve.equalsIgnoreCase("Turk Kahvesi") && !hangiKahve.equalsIgnoreCase("Filtre Kahve") && !hangiKahve.equalsIgnoreCase("Espresso"));
        System.out.println(hangiKahve + " hazırlanıyor");

        sutEkleme();

    }

    private static void sutEkleme() {
        System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        String scm = scan.next();
        if (scm.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else if (scm.equalsIgnoreCase("hayir")){
            System.out.println("Süt eklenmiyor");
        }

        sekerEkleme();

    }

    private static void sekerEkleme() {
        System.out.print("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        String scm = scan.next();
        if (scm.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            int kacSeker=scan.nextInt();
            scan.nextLine();        // dummy  int girdisinden sonra str girdisi yapılacağı için boş atlıyorum
            System.out.println(kacSeker+" şeker ekleniyor...");
        }else if (scm.equalsIgnoreCase("hayir")){
            System.out.println("Şeker eklenmiyor");
        }

        kayveBoyutu();


    }

    private static void kayveBoyutu() {


        do {
            System.out.println("Hangi boyutta olsun? (büyük boy - orta boy - küçük boy olarak giriniz");
            kahveBoyut = scan.nextLine();


            if (!kahveBoyut.equalsIgnoreCase("Büyük boy") &&  !kahveBoyut.equalsIgnoreCase("orta boy")   &&   !kahveBoyut.equalsIgnoreCase("küçük boy")){
                System.out.println("Hatalı tuslama yaptınız");

            }



        }while(!kahveBoyut.equalsIgnoreCase("Büyük boy") &&  !kahveBoyut.equalsIgnoreCase("orta boy")   &&   !kahveBoyut.equalsIgnoreCase("küçük boy")   );
        System.out.println("kahveniz " + kahveBoyut + " hazırlanıyor");

        sonucKahve();
    }

    private static void sonucKahve() {
        System.out.println(hangiKahve+" "+ kahveBoyut+" Hazırdır. Afiyet olsun !!!");


    }


}
