package b151practices.deneme;

import java.util.Scanner;

public class M12_Deneme {
    public static void main(String[] args) {
        /*
        oru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
            A. Köln veya Frankfurta gidebilirsiniz.
            B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
              İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
              İşlemlerde direkt bunları cağırabilirsiniz.
              todo İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
       1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
              todo Frankfurt girildiyse,
                 örn: girdi= Frankfurt
                 case=FRANKFURT:
                 Rota = Frankfurt yazdırın.
                 Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
              todo case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
       2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
             case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
             case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
              todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        a.Bakiyemi belirtin.
        b.Toplam Tutarı belirtin.
        c.double paraUstu oluşturun ve hesaplayın.
        d.Double para üstünü yazdırın.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Welche Richtung möcten Sie reisen? (Frankfurt :60KM---Köln:80 KM---(Per 20 KM  5 euro TicketGebühr..)");
        String rota=input.next().toUpperCase();
        switch (rota){
            case "FRANKFURT" :
                System.out.println("Rota =Frankfurt");
                int gebührf=(60/20)*5;
                System.out.println("Die Gebühr nach Frankfurt:"+gebührf+ "Euro");
                break;
            case "KÖLN" :
                System.out.println("Rota =Köln");
                int gebührk=(80/20)*5;
                System.out.println("Die Gebühr nach Köln:"+gebührk+ "Euro");
                break;
        }



    }
}
