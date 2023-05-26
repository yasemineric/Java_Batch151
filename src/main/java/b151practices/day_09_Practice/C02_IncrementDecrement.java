package b151practices.day_09_Practice;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a=15;
        int b=a++;
        System.out.println(b);//15--önce atar
        System.out.println(a);//16---sonra arttirir

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi2);//10--önce sadece degeri atadi
        System.out.println(sayi1);//11--sayi1++ deyince ekleme yapti

        sayi3=++sayi1;
        System.out.println(sayi3);//12--sayi1.de 11 vardi, ++sayi1 dedigimiz icin önce arttiracak,12 yapar

        System.out.println(sayi1);//12

        System.out.println(sayi3++);//12-- sayi3.un ensonki degeri 12, sayi 3.ü önce yazdiriyoruz sonra arttiriyoruz.
        System.out.println(sayi3);//13--Sayi3. bir önceki islemde arttirilmisti.

        System.out.println(--sayi2);//9-- sayi2.inin ensonki degeri:10, önce cikart diyor, 9 olur

        sayi2++;
        System.out.println(sayi2);//10
        System.out.println(sayi2--);//10--önce yazdir, sonra eksilt
        System.out.println(sayi2);//9

        System.out.println(sayi3++);//13
        System.out.println(sayi3);//14





    }
}
