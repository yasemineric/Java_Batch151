package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
/*
    Kullanicidan email adresini girmesini isteyin,
    Asagidaki kurallara gore kullanicinin
    girdigi email adresini kontrol ediniz.
           i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmali
     */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi\n" +
                "i)mail adresi \"@gmail\" icermeli\n" +
                "ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                "iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");

        String mail= input.nextLine();
        //"i)mail adresi \"@gmail\" icermeli\n"
        boolean first=mail.contains("@gmail");
        System.out.println("@gmail = "+ first);

        //ii)Space characteri mail'de olmamali
        boolean second= !mail.contains(" ");
        System.out.println("space = " + second);
        // Contains methodu regex kkarakterlerle dogru bir sekilde calismaz.
        // bu nedenle replaceAll ile silme yapilip geriye kalanlarin length().ine bakilir

        //boolean third = mail.replaceAll("[^A-Z]","").length()==0;
        //System.out.println("buyukHrf = " + third);
        //iii)mail adresinde buyuk harf olmamali
        boolean third=mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]", "").
                replace(" ", "") .length()==0;
        System.out.println("Buyuk Harf Olmamali = " + third);

        //iv)En az bir tane noktalama isareti bulunmali

        //boolean fourth = mail.replaceAll("^\\P{P}]", "").length()>0;// noktalama isaretlerinin haricindekileri silip uzunluga bakiyoruz.
        // boolean fourth= mail.replaceAll("[a-zA-Z0-9]", "").replaceAll(" ", "").length()>0;
        boolean fourth= mail.replaceAll("^\\p{P}", "").length()>0;//[^\p{Punct}] semboller haric herseyi sil
        System.out.println("En az bir Noktalama isareti olmali = " + fourth);
        System.out.println(first && second && third && fourth );

 String str ="burada .,?Q$@";
        //System.out.println(str.replaceAll("\\P{P}", ""));            [\\P{Punct}] semboller haric herseyi sil
        System.out.println(str.replaceAll("^\\p{Punct}", ""));



    }//main
}//class
