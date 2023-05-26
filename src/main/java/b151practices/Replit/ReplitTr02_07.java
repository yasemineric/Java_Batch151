package b151practices.Replit;

public class ReplitTr02_07 {
    public static void main(String[] args) {
        /*
        Iki integer'i toplayan java programini yaziniz.
int a=10

int b=14

Ornek Cikti:

Sayilarin Toplami : 24
         */
       // int a=10;
      //  int b=14;
       // System.out.println("Sayilarin Toplami : "+(a+b));

        /*
        Verilen integer sayilarin Toplamini, carpimini, cikarma islemini ve bolme islemini yapan java kodunu yaziniz.

num1=100;

num2=25;

Ornek Cikti:

125

2500

75

4
         */
        int num1=100;
        int num2=25;

        System.out.println(num1+num2);
        System.out.println(num1*num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);



        /*
        Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

A=5

B=3

Ipucu:
Dikdortgenin Cevresi : 2*(A+B);

Dikdortgenin Alani : A * B ;

Ornek Cikti:

Dikdortgenin Cevresi : 16

Dikdortgenin Alani : 15
         */

        int A= 5;
        int B= 3;
        int cevre=2*(A+B);
        int alan=A*B;
        System.out.println("Dikdörtgenin Cevresi : "+cevre);
        System.out.println("Dikdörtgenin Alani : "+alan);

        /*
        Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.

Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50

Ornek Cikti:

Sayilarin Ortalamasi : 30
         */

        int s1=22, s2=20,s3=30, s4=28, s5=50;
        int ort=(s1+s2+s3+s4+s5)/5;
        System.out.println("Sayilarin Ortalamasi : "+ort);


        /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
        int a= 3;
        int b= 5;
        Ornek Cikti:
        a=5
        b=3
 */
        int a= 3;
        int b= 5;
        int deg=a;
        a=b;
        b=deg;
        System.out.println("a="+a);
        System.out.println("b="+b);




    }


}
