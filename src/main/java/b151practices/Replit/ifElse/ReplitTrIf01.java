package b151practices.Replit.ifElse;

import java.util.Scanner;

public class ReplitTrIf01 {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez
Input:
Output:
Agirlik : 71
Boy : 1.72
BMI : 23.99945916711736
Zayifsiniz.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Größe in Meter:");
        double m= input.nextDouble();
        System.out.println("Bitte geben Sie Ihre GewichtWert in Kilogramm:");
        double kg=input.nextDouble();
        double bmi= kg/(m*m);

        System.out.println("BMI :"+ bmi);
        if(bmi<18.5){
            System.out.println("Zayifsiniz");
        } else if(18.5<=bmi&&bmi<25){
            System.out.println("Kilonuz idealdir");
        }
        else if (25<=bmi&&bmi<30){
            System.out.println("Sişmansınız");
        }else if (bmi>=30) {
            System.out.println("Obez");

        }
    }
}
