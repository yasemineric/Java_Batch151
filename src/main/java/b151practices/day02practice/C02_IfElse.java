package b151practices.day02practice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir


        ##if (a*a+b*b==c*c || c*c+b*b==a*a || a*a+c*c==b*b)

        ##String dikUcgen= (a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a) ? "Dikücgen":"Diküçgen değil";
System.out.println(dikUcgen);
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ücgenin a kenarini giriniz");
        int a = scan.nextInt();
        System.out.println("Ücgenin b kenarini giriniz");
        int b = scan.nextInt();
        System.out.println("Ücgenin c kenarini giriniz");
        int c = scan.nextInt();

        if (a*a+b*b==c*c) {
            System.out.println("Bu bir dikücgendir");
        }else if(a*a+c*c==b*b){
            System.out.println("Bu bir dikücgendir");
        }else if(b*b+c*c==a*a) {
            System.out.println("Bu bir dikücgendir");
        }else{
            System.out.println("bu bir dikücgen degildir");
        }

    }
}
