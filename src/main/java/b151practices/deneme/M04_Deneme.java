package b151practices.deneme;

import java.util.Scanner;

public class M04_Deneme {
    /*
    Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
            qa ==> Quality Analyst
            dev ==> Developer
            ba ==> Busines Analyst
            pm ==> Project Manager
            seklinde bilgilerini yazdiriniz

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre IT Bereich ein: qa,dev, ba, pm,pm");
        String it = input.next();
        String itErzlng = it.equalsIgnoreCase("qa") ? "qa ==> Quality Analyst" :
                it.equalsIgnoreCase("dev") ? "dev ==> Developer" :
                        it.equalsIgnoreCase("ba") ? "ba ==> Busines Analyst" :
                                it.equalsIgnoreCase("pm") ? "pm ==> Project Manager" :
                                        "Unbescriebter IT Bereich";
        System.out.println(itErzlng);

    }
}
