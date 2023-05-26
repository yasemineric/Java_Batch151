package b151practices.deneme;

import java.util.Scanner;

public class D01_Deneme {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        String str3="GUZEL";
        int sayi1=5;
        int sayi2 =4;

        System.out.println(str1+" "+str2);
        System.out.println(str1+" "+sayi1+" "+str2);
        System.out.println(str1+" "+(sayi1+sayi2)+sayi2);
        System.out.println(str1+" "+(3*sayi1+sayi2));
        System.out.println(""+sayi1+sayi2+" "+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str2.charAt(4));
        System.out.println(str2.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.equals(str2));//F
        System.out.println(str2.equals(str3));//F
        System.out.println(str2==str3);//F
        System.out.println(str2.equalsIgnoreCase(str3));//t
        System.out.println(str1.length());

        Scanner cumle =new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz...");
        String str5=cumle.nextLine();

        Scanner kelime =new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz...");
        String str6=kelime.nextLine();

        boolean isDa= str5.indexOf(str6)!=(-1); // kendi yapip mutlu oldugum :)
        System.out.println(isDa);



    }
}
