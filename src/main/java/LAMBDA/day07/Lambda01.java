package LAMBDA.day07;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        allEvenPrint(nums);//false
        anyOddPrint(nums);//true
        enKucukIlkUcAtlaKalana50Artis(nums);//15.0 18.0 18.0 21.0 22.5 196.5
        System.out.println("ex 4)");
        evenPrint(nums);//12 14 10 4 12
        System.out.println("ex 5)");
        oddSquarePrint(nums);//81 17161 81 225
        System.out.println("ex 6)");
        oddKupTekrarsizPrint(nums);//729 2248091 3375
        System.out.println("ex 7)");
        benzersizCiftSayiKareTop(nums);//456
        System.out.println("ex 8)");
        evenSquareMultiplyPrint(nums);//45158400
        System.out.println("ex 9)");
        listMax1(nums);//131
        listMax2(nums);//131
        System.out.println("ex 10)");
        listMin(nums);//4
        listMin2(nums);//4
        //listMin3(nums);//4



    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.

    public static void allEvenPrint(List<Integer> nums){
        boolean allEven =nums.
                stream().
                allMatch(t->t%2==0);
        System.out.println("allEven = " + allEven);
    }


    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz
    public static void anyOddPrint(List<Integer> nums){
        boolean anyOdd =nums.
                stream().
                anyMatch(t->t%2!=0);
        System.out.println("anyOdd = " + anyOdd);
    }


    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.
    public static void enKucukIlkUcAtlaKalana50Artis(List<Integer> nums){
        nums.
                stream().
                sorted().
                skip(3).
                map(t->t*1.5).
                forEach(t->System.out.print(t+" "));
    }



    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void evenPrint(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t->System.out.print(t+" "));
    }



    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void oddSquarePrint(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t->System.out.print(t+" "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void oddKupTekrarsizPrint(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                distinct().
                map(t->t*t*t).
                forEach(t->System.out.print(t+" "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftSayiKareTop (List<Integer> nums) {
        System.out.print("7.1 : ");
        int ciftSayiTop= nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

        System.out.println("ciftSayiTop = " + ciftSayiTop);
    }

    public static void benzersizCiftElemanlarınKarelerinTopYazdır( List<Integer> nums ) {
        System.out.print("7.2 : ");
        int benzersizCiftElKareTop =
                nums.
                        stream().
                        distinct()
                        .filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(Math::addExact).orElseThrow();

        System.out.print(benzersizCiftElKareTop);
    }

    public static void benzersizCiftElemanlarınKarelerinToplamiYazdır2( List<Integer> nums ){
        System.out.print("7.3 : ");
        int benzersizCiftElKareToplami2 =
                nums.
                        stream().
                        distinct()
                        .filter(t->t%2==0).
                        map(t->t*t).
                        reduce(0,Integer::sum);//get() mehodu yerine 0,Integer::sum kullanabiliriz.

        System.out.print(benzersizCiftElKareToplami2);

    }
        //reduce() coklu datadan bir dataya indirmek, coklu sayilari toplayarak, yada carparak sonunda bir sayi elde ediyoruz.
        // reduce metodu sonrasinda forEach metodu ile yazdirma islemi yapamiyoruz.
        // get ve orElseThrow metodlari yazdirma yapmadigi icin reduce metoduna eklenebilirler.
        // Biz bunlara gerek olmasin dersek kodumuzu dogrudan bir int variable'a assign etmeliyiz.




    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void evenSquareMultiplyPrint(List<Integer> nums){
        int  evenSquareMultiply=nums.
                stream().
                filter(t->t%2==0).
                distinct().
                map(t->t*t).reduce(Math::multiplyExact).get();
        System.out.println(evenSquareMultiply);
    }

    //9)Liste ogelerinden max degerini veren bir method olusturunuz
    public static void listMax1(List<Integer> nums){
       int maxYol1= nums.
               stream().
               distinct().// bu method bizi islam tekrarindan kurtarir.
               reduce(Math::max).
               orElseThrow();
        System.out.println(maxYol1);
    }
    public static void listMax2(List<Integer> nums){
        int maxYol2= nums.
                stream().
                distinct().// bu method bizi islam tekrarindan kurtarir.
                //reduce(0, (t,u)-> t>u?t:u);// u akistan alir, t baslangic degerini alir.
                reduce(Integer.MIN_VALUE,(t,u)-> t>u?t:u);// 0 yerine Integer.Min value.da alinabilir

        System.out.println(maxYol2);
    }



    //10)Liste ogelerinden minumum degerini veren method olusturunuz
    public static void listMin(List<Integer> nums){
        int min= nums.
                stream().
                distinct().// bu method bizi islam tekrarindan kurtarir.
                reduce(Math::min).
                get();
        System.out.println(min);
    }

    public static void listMin2(List<Integer> nums){
        int minYol2= nums.
                stream().
                distinct().// bu method bizi islam tekrarindan kurtarir.
                //reduce(0, (t,u)-> t>u?t:u);// u akistan alir, t baslangic degerini alir.
                        reduce(Integer.MAX_VALUE,(t,u)-> t<u?t:u);// 0 yerine Integer.Min value.da alinabilir

        System.out.println(minYol2);

    }

   public static void listMin3(List<Integer> nums){
        int minYol3= nums.
                stream().
                distinct().// bu method bizi islam tekrarindan kurtarir.
                        reduce(0,Integer::min);

        System.out.println(minYol3);
    }


}
