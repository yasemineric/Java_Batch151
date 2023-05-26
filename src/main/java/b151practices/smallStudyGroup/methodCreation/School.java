package b151practices.smallStudyGroup.methodCreation;

import java.util.Scanner;

public class School {
    String okulIsmi="Galatasaray Universitesi";
    boolean isAktive= true;
    int yil=2023;

/*
Java da method mainin disinda olusturulur
access modifier(Static kullanabiliriz)# return type+method ismi(){}
 */

   String okulIsmiYazdir(){
        System.out.println("Lütfen bir okul ismi giriniz");
        Scanner scan= new Scanner(System.in);
        okulIsmi=scan.nextLine();
        //System.out.println(okulIsmi);
        return okulIsmi;
    }
    boolean isAktiveMi(){
       System.out.println("Lutfen okul aktiv ise true degilse false yazin");
       Scanner scan=new Scanner(System.in);
       isAktive= scan.nextBoolean();
       System.out.println(isAktive);
       return isAktive;

    }
    int okulYiliYazdir(){
        System.out.println("Lütfen okudugunuz yili girin");
        Scanner scan= new Scanner(System.in);
        yil=scan.nextInt(yil);
       return yil;
    }

}
