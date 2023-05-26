package b151practices.day_07_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {

    public static void main(String[] args) {


// Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
// ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

// Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

// Ortalamadan daha buyuk olan array elemanlarını yazdırınız{

        Scanner input = new Scanner(System.in);

        int arr[] = new int[4];

        for (int i = 0; i < 4; i++) {// kullanicidan 4 tane rakam alacagimiz icin 0-4.e kadarfor döngüüsne aldik
            System.out.println("Lutfen rakam giriniz");
            int rakam = input.nextInt();
            arr[i] = rakam;// kullanicidan aldigimiz her rakami sirasiyla array.a assign ettik
        }
        System.out.println(Arrays.toString(arr));

        double toplam=0;
        for (int w:arr) {
            toplam=toplam+w;
        }
        double ortalama=toplam/arr.length;
        System.out.println("ortalama = " + ortalama);
        for (int w:arr) {
            if (w>ortalama){
                System.out.println(w+" ");
            }

        }




    }
}
