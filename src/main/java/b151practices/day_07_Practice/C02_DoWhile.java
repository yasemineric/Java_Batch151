package b151practices.day_07_Practice;

import java.util.Scanner;

public class C02_DoWhile {
    /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen topun birakildigi yüksekligi giriniz");
        double yükseklik= input.nextDouble();
        double toplamYol=0;
        int vurmaSayisi=0;

        do {
            toplamYol+=yükseklik;
            vurmaSayisi++;
            toplamYol+=yükseklik*0.5;
            yükseklik=yükseklik*0.5;

        } while (yükseklik>=1);
        toplamYol+=yükseklik;
        vurmaSayisi++;

        System.out.println("vurmaSayisi = " + vurmaSayisi);
        System.out.println("toplamYol = " + toplamYol);





    }

}
