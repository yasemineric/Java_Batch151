package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        // 3.den 8.e kadar tm tam sayilari consola yazdir
        //1Way:
        for (int i = 3; i < 9; i++) { // for lop da 3 sart da parantez icinde
            System.out.println(i + " ");

        }
        System.out.println();

        //2Way:
        int i = 3;
        while (i < 9) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        //1Way
        for (int k = 21; k < 181; k++) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println();

        int k = 21;
        while (k < 181) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }

            k++;
        }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        int m = 0;
        while (m < s.length()) {
            String ch = s.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());

            } else {
                System.out.print(ch);
            }

            m++;// bu kisim unutulursa yada {} disinda kalirsa infinitiv loop olusur-
            // sonsuz looplar application.nun donmasina sebep olur
        }

        // Size verilen tam sayinin rakamlari toplamini consola yazdiran code yaziniz
        int r = 578;
        int sum = 0;// rakamlari toplayinca yeni bir sayi elde edecegiz. yeni rakami buraya atayacagiz
        while (r > 0) {
            sum = sum + r % 10;

            r = r / 10;

        }
        System.out.println();
        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3*3=3, 3*2=6....
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();
        int u = 1;
        while (u < 11) {
            System.out.println(n + "*" + u + "=" + (n * u));
            u++;

        }
        System.out.println();

        //kullanicidan aldiginiz Stringdeki sessiz ahrleri konsola yazdirin
        //Alabama-lbm
        System.out.println("Please enter a word");
        String y = input.next();
        int z = 0;
        while (z < y.length()) {
            char ch = y.charAt(z);
            boolean x = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if (!x) {
                System.out.println(ch);
            }
            z++;
        }

        /*
        int i = 0;
while (i < s.length()) {
    char ch = s.charAt(i);
    switch (ch) {
        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
            i++;
            continue;
        default:
            System.out.print(ch + " ");
            i++;
    }
}
         */
        /*
        System.out.println("Please enter a word");
String y = input.next();//kelime girecegi icin next yeterli

int z = 0;

while(z<y.length()){//ilk index 0 dir son index lengt bir azdir
    char ch = y.charAt(z);//bu sifirken bana ilk karakter verilecek artirmadan sonra 1 olduugunda ikinci karakter verilecek
    boolean x = ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' || ch=='A' ||  ch=='E'||  ch=='I' || ch=='O'|| ch=='U';

    if(x){//booleana yazilan kodu if kodunun icinden aldik
        //burada ayrica if(!x)  de yazabilirdik bunun icin else yi cikartamamiz gerekir.
    //   z++;// diger harfe gecmek icin yazmaliyiz
     //   continue;//demezsek tekrarlari yazmiyor
        //continue while loop da sorunsuz calismakla beraber diger kodlarda durum ayni degil
    }else {
        System.out.print(ch);
    }
    z++;
}
         */
    }//main

}//class
