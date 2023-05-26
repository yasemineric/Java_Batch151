package b151practices.Replit.ifElse;

import java.util.Scanner;

public class ReplitTrIf06 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
Eger ayni kaakterlere sahip degilse
"
ismin benzersiz karakterleri var." yazdirin.
Ternary kullanin.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");
        String name= input.next();
        String ch1=name.substring(0,1);
        String ch2=name.substring(1,2);
        String ch3=name.substring(2,3);
        String dize=ch1.equals(ch2)||ch2.equals(ch3)|| ch3.equals(ch1)?"isim ayni karakterlere sahiptir." : "\n" +
                "ismin benzersiz karakterleri var.";
        System.out.println(dize);



    }
}
