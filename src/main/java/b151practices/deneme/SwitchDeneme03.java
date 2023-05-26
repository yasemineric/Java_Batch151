package b151practices.deneme;

import java.util.Scanner;

public class SwitchDeneme03 {
    public static void main(String[] args) {
        /*
        Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
            INFO : BMI = kilo(kg) /(boy*boy)(m)
                   BMI <=20 oldukca zayifsiniz
                   20<BMI<=25 Normal sinirlardasiniz
                   25<BMI<=30 Sisman kategorisindesiniz
                   30<BMI ==> Obez grubundasiniz.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Größe in Meter:");
        double m= input.nextDouble();
        System.out.println("Bitte geben Sie Ihre GewichtWert in Kilogramm:");
        double kg=input.nextDouble();
        double bmi= kg/(m*m);

        /*
        String vki= bmi<=20?"Sie sind so dünn":20<bmi&&bmi<=25?"Sie sind in normalen Werten"
                :25<bmi&&bmi<=30?"Sie sind in Kathegory-Fat":30<bmi?"Sie sind in Kathegory-Obesietät";
        System.out.println(vki);

         */

        if(bmi<=20){
            System.out.println("Sie sind so dünn");
        } else if(20<bmi&&bmi<=25){
            System.out.println("Sie sind in normalen Werten");
        }
        else if (25<bmi&&bmi<=30){
            System.out.println("Sie sind in Kathegory-Fat");
        }else if (bmi>30) {
            System.out.println("Sie sind in Kathegory-Obesietät");

        }




    }
    }

