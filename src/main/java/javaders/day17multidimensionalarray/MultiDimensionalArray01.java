package javaders.day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    //disdaki "Outer Array", icteki "Inner Array"

    /*
       1-Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.
    */
    public static void main(String[] args) {

        int a[][] = new int[3][2];
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;
        System.out.println(Arrays.toString(a));// [[I@49e4cb85, [I@2133c8f8, [I@43a25848]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Array icinden specific bir eleman alacaksak;
        System.out.println(a[1][1]);//45
        //Multidimensional Array icindeki bir array'i yazdirmak
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]

        //Kisa yoldan "Mutidimensional Array"nasil olusturulur?
        //String students[][]={{},{},{},{}};// burada bastan length.lerini deklare etmedigimiz icin
        // istedigimiz uzunlukta Array tanimlayabiliriz


        //"Mutidimensional Array"nasil olusturulur?
        String names[][] = new String[3][2];// distaki array.in length.i 3, ictekinin 2
        //"Multidemansional Array"e eleman nasil eklenir?
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        //"Multidimensional Array"leri console'a yazdirmak icin "toString()"method'u degil "deepToString()"methodunu kullaniniz.
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]
        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        System.out.println(names[1][1]);//M
        //Multidimensional Array icindeki bir array'i yazdirmak
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]
        //Kisa yoldan "Mutidimensional Array"nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //Example 1 : Yukaridaki students array'inde toplam kac isim oldugunu bulunuz

        int sum = 0;
        for (String[] w : students) {// (for each methodu) w.deki elemalarin data tipi String Array.dir.
            // Bu yüzden String[] olarak data tipini gireriz

            sum += w.length;
        }
        System.out.println(sum);


        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        //{ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} };
        for (String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }

        // ex3: Bir integer multidimensional array olusturunuz, tüm elemanlarin carpimini hesaplayiniz

        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result=1;
        for(int[] w:nums){
            for(int k: w){
            result=result*k;
            }
        }
        System.out.println(result);

    }
}
