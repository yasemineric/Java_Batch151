package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Auto {

    public String model = "v60";
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {
         /*
    // Class ==> Variable (Pasif özellikler)
             ==> Methodlar (Aktif özellikler)

     */
        //Class+objenin ismi= new Keyword+ ClassIsmi(Constructor)
           Auto   volvo     = new          Auto();//1.Adim

        hareket();// 2.Adim
        dur();    //4.Adim
        yakit();  //6.Adim
        System.out.println("volvo.fiyat = " + volvo.fiyat);
        System.out.println("volvo.model = " + volvo.model);
        System.out.println("volvo.renk = " + volvo.renk);

    }//main

    static void dur() { //5.Adim
        System.out.println("Volvo güvenle durur");

    }

    private static void yakit() { //7.Adim
        System.out.println(" volvo az yakit tüketir");

    }

    public static void hareket() { //Aktif özellikler //3.Adim
        System.out.println(" volvo hizli gider...");

    }


}//class
