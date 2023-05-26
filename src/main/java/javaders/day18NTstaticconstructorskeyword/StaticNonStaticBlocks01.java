package javaders.day18NTstaticconstructorskeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {
    /*
    1)"static block"lar "static variable"lara ilk degerlerini(initialize) atamak icin kullanilir
    2)static bir variable.a deger atamak icin kod yazmaniz gerekirse static block kullanilir
    3) static bir variable.a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir
    ama static block icine yazilan kod main method icine yazilan kod.dan once calistirlir..
    4) Bir class da 1 den fazla static block varsa ustteki önce calistirilir
     */

    // Static variable.lar static block kullanilmadan da initialize edilebilirler
    public static double pi=3.14;
    //public static double e=2.71;(e böyle de tanimlanir)
    public static double e;//(e böyle de tanimlanabilir-static block icinde)
    static{
        e=2.71;
    }

   // Asagidaki gibi static bir variable.a deger atamak icin kod yazmaniz gerekirse static block kullanilir
    public static double price;//(e böyle de tanimlanabilir-static block icinde)
    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }

    static{
        System.out.println("Hey I am a static block 2");
    }

    static{
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }
    }

    // Java class i olusturdugu anda static variable lari olusturur.Bir bütün halinde olusur bunlar.
    // Biz class a sahip oldugumuz anda static variable da sahip olmusuz demektir.
//Static blocklar static oldugu icin class olusturulurken class a monte edilir.
// Static blocklar main methodtan önce calistirilir.
// O yüzden kodlari burda main method icine degil de static block icine yazdik.


}







