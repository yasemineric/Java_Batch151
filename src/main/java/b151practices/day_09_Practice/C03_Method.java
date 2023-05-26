package b151practices.day_09_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {
    public static void main(String[] args) {
         /*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=scan.nextLine();
        System.out.println(cumle);
        String arr[]=cumle.split("");
        System.out.println(Arrays.toString(arr));

        sesliharfleriyazdir(arr);// üstüne gelip bekleyince method creat cikti, method call ettik

    }

    public static void sesliharfleriyazdir(String[] arr) {
        /*
        for (int i = 0; i <arr.length ; i++) {// arrayin uzunluguna kadar döngu olusturduk


            if(arr[i].equalsIgnoreCase("a")
            ||arr[i].equalsIgnoreCase("e")
                    ||arr[i].equalsIgnoreCase("i")
                    ||arr[i].equalsIgnoreCase("o")
                    ||arr[i].equalsIgnoreCase("u"));
            {
                System.out.print(arr[i] + " ");
            }
        }

         */

        for (int i = 0; i <arr.length ; i++) {// arrayin uzunluguna kadar döngu olusturduk

            if(arr[i].equalsIgnoreCase("a")
                    ||arr[i].equalsIgnoreCase("e")
                    ||arr[i].equalsIgnoreCase("i")
                    ||arr[i].equalsIgnoreCase("o")
                    ||arr[i].equalsIgnoreCase("u"));
            {
                System.out.print(arr[i] + " ");
            }
        }








    }
}
