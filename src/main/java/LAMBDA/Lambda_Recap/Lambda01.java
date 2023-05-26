package LAMBDA.Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifLamExYazdir(sayi);//12 6 8
        System.out.println("\n***********************");
        ciftVePozitifMetRef(sayi);//12 6 8
        System.out.println("\n***********************");
        kareYazdir(sayi);//25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println("\n***********************");
        kareTekrarsiz(sayi);//25 64 144 0 1 36 81 225
        System.out.println("\n***********************");
        pozitifKupBirlerBas5(sayi);//25 25 225
        System.out.println("\n***********************");
        toplamMetRef(sayi);//Optional[36]
        System.out.println("\n***********************");
        toplamLambdaEx(sayi);//36
        System.out.println("\n***********************");
        System.out.println(ciftElKareKucBuySirListReturn(sayi));//[0, 36, 64, 64, 144, 144]



    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void
    ciftVePozitifLamExYazdir( List<Integer> sayi){

        sayi.
                stream().
                filter(t->t>0&& t%2==0).
                forEach(t-> System.out.print(t+" "));

    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef( List<Integer> nums){
        nums.
                stream().
                filter(t->t%2==0&& t>0).
                forEach(Utils::yazdir);

    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    // (bir degisiklik söz konusu, o nedenle map kullanilmali)

    public static void kareYazdir(List<Integer> nums){
        //nums.stream().map(t->t*t).forEach(Utils::yazdir);
        nums.
                stream().
                map(Utils::kareBul).
                forEach(Utils::yazdir);

    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> nums){
        nums.
                stream().
                map(Utils::kareBul).
                distinct().
                forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5(List<Integer> nums){
        nums.
                stream().
                filter(t->t>0).
                map(t->t*t).
                filter(t->t%10==5).
                forEach(Utils::yazdir);

    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> nums){
       //  nums.stream().reduce(0, (t, u) -> t + u)
        Optional<Integer> sonuc=nums.
                stream().
                reduce(Integer::sum);//Ya akista hicbir eleman yoksa null gelir,
        // bu null integer.a assign edilirse NullPointerExeption hatasi verir,
        // bu hatadan dolayi java kizariyor. (int sonuc==> Optional<Integer> cevirdik) hata düzeldi.
        System.out.println(sonuc);//reduce() terminal methoddur, reduce.dan sonra foreach vs. kullanilamaz, o yüzden yazdirma isini böyle yaptik.

    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer> nums){
        int sonuc= nums.
                stream().
                reduce(0,(a,b)->a+b);// 0 burada ilk degerdir.(toplamaya göre etkisiz eleman oldugu icin)
        // (a ilk degerdir:0, b degerini akistan alir)--Burada ilk deger 0 var, o nedenle java Optional cözümü sunmuyor,
        // direkt int sonuc konteyner.ina assign ettik.
        System.out.println(sonuc);

    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> nums){
        List<Integer> sonuc =nums.
                stream().
                filter(t->t%2==0).
                map(Utils::kareBul).
                sorted().
                collect(Collectors.toList());
        return sonuc;
    }



}
