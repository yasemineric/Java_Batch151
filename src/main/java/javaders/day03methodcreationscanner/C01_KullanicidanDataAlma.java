package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {
    public static void main(String[] args) {

//Kullanicidan aldiginiz
// character ile asagidaki gibi bir gorunum olusturunuz
/*
          A
         A A
        A A A
 */
    // sadece char data tipi icin nextChar() adinda bir method olmadigi icin
    // kullanicidan bir data alip ch konteynerine yerlestirmak icin next().charAt(0) methodunu kullanibilir.

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Character");
        char ch =input.next().charAt(2);
        System.out.println("  "+ch+"\n"+" "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println("  "+ch+"  ");

//  aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t"+"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);




    }//main
}//class
