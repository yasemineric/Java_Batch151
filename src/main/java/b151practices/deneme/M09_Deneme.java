package b151practices.deneme;

import java.util.Scanner;

public class M09_Deneme {
    public static void main(String[] args) {
        /*
        Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Aktuelle Geschwindigkeit : ");
        int g=input.nextInt();
        System.out.println("Haben Sie eine Führerschein? True/False");
        boolean f=input.nextBoolean();

        Object strafe= f==false?
                g>54?"Strafe: 200$":
                        g>74?"Strafe: 150$":
                                g>84?"Strafe: 320$":
                                        g>94?"Strafe: 500$":"Sie haben an die Geschwindigkeit Regeln behalten":
                g>54?"Strafe: 300$":
                        g>74?"Strafe: 350$":
                                g>84?"Strafe: 520$":
                                        g>94?"Strafe: 700$":"Sie haben an die Geschwindigkeit Regeln behalten";

        System.out.println(strafe);


    }
}
