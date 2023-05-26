package javaders.day23datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Anlik Zamani nasil aliriz?
        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);//21:24:50.369617900

        //Anlik Zamanda bilesenler nasil alinir?
        int hour= myCurrentTime.getHour();
        System.out.println(hour);//21

        int minute= myCurrentTime.getMinute();
        System.out.println(minute);//24

        int second=myCurrentTime.getSecond();
        System.out.println(second);//50

        int nano=myCurrentTime.getNano();
        System.out.println(nano);//681785500

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next=myCurrentTime.plusMinutes(23).minusSeconds(11);//23 dakika ileri 11 saniye geri
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        // DateTimeFormatter.ofPattern() methodu kullanilarak degistirebiliriz

        /* DateTime Class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gösterilmez
        hh : mm a ==> 12 li saat sistemi AM, PM
        hh : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        mm minute demektir, MM month demektir

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August
         */

        //Date formati nasil degistirilir?
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");//hh:mm a yaparsak 12.lik saat sistemini kullanir ama yaninada gece gunduz ayrimi icin a eklemek gerekir. HH ise 24lük sistem
        String formattedMyCurrentTime=dtf1.format(myCurrentTime);// bu formati al benim zamanima uygula diyoruz
        System.out.println(formattedMyCurrentTime);

        LocalDate myCurrentDate=LocalDate.of(2022, 8,25);
        System.out.println(myCurrentDate);//2022-08-25

        //Tarihi Ay/Gun/Yil sekline ceviriniz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedCurrentDate1= dtf2.format(myCurrentDate);
        System.out.println(formattedCurrentDate1);//08/25/2022

        // Tarihi Gun/Ay isminin ilk 3 harfi/ yil sekline ceviriniz. 25/Aug/22
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedCurrentDate2=dtf3.format(myCurrentDate);
        System.out.println(formattedCurrentDate2);//25/Aug./22

        //Tarihi 25/August/2023 sekline ceviriniz
        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedCurrentDate3= dtf4.format(myCurrentDate);
        System.out.println(formattedCurrentDate3);
        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        //LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21

        LocalDate dateInTaskent=LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTaskent);

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-03-21

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:36:38.317506800

        //Berlin.de saat kac?
        LocalTime timeInBerlin =LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);










    }
}
