package b151practices.deneme;

import java.util.Scanner;

public class M11_Deneme {
    public static void main(String[] args) {
        //Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)
// Soru sor
        Scanner input= new Scanner(System.in);
        System.out.println("Bitte schreiben Sie, welche Tag heute ist :");
        int tag=input.nextInt();
        System.out.print("Nach 100 Tagen ist ");

        switch ((tag+100%7)%7){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
        }






    }
}
