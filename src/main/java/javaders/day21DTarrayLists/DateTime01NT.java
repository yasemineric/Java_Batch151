package javaders.day21DTarrayLists;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01NT {
    public static void main(String[] args) {
        //dijital iz icin önemli

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz.
        LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-24--o günün tarihini verir.

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue =myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue= myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue= myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//24

        // Asagidaki Month bir Enum.dir--       Applicationlar StandAlone olmali, bagimsiz
        //Enum Java.da sabit degerleri(Ay,Gün,Sehir,Samayolu galaxisindeki gezegen isimleri)
        // depolamak icin kullanilir. Sabit Datalar javada büyük harfle yazdirilir.
        Month monthName=myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        // Asagidaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//FRIDAY

        // Ileriki Tarihe nasil gidilir
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));//2027-05-29

        // Gecmis tarihe nasil gidilir
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));//1993-01-06

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDog=LocalDate.of(1986,6,10);
        LocalDate fatihDog=LocalDate.of(1985,2,25);

        // Bir Tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir
        boolean r1=gokhanDog.isAfter(fatihDog);// true- Gökhan Fatihten sonra dogmus mu
        System.out.println(r1);
        // Bir Tarihin bir tarihten önce olup olmadigi nasil kontrol edilir
        boolean r2=fatihDog.isBefore(gokhanDog);//true--
        System.out.println(r2);
        // Bir Tarihin bir tarihe esit olup olmadigi nasil kontrol edilir
        boolean r3=gokhanDog.isEqual(fatihDog);
        System.out.println(r3);//false

        // Example: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz msj. veriniz"
        // Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz"
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year =input.nextInt();
        int month =input.nextInt();
        int day =input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println( givenDate+"  Invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }


        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31
        // ayların yada yılların kac gün oldugunu gösteren method. (28,30,31 gibi)
        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println("bu ay kac gün = " + lengthOfMonth); // 31


        //Example 2: Kullanicinin girdigi tarihin gun ismini bula kodu yaziniz.
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);

        System.out.println(date.getDayOfWeek());







    }
}
