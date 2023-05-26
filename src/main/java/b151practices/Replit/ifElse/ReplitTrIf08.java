package b151practices.Replit.ifElse;

import java.util.Scanner;

public class ReplitTrIf08 {
    public static void main(String[] args) {
    /*
    Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
INPUT   : Mustafa
OUTPUT  : fafafa
     */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String name=input.next();
        String sonikiHarf = name.substring(name.length() - 2, name.length());

        if(name.length()<2){
            System.out.println("Isim en az iki harften olusmalidir");
        }else {
            System.out.println(sonikiHarf + sonikiHarf + sonikiHarf);
        }





    }
}
