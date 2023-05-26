package javaders.day17NTmultidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    /*
    1) Bir array.in elemanlari da array olursa bu tarz arraylare MultiDimensional Array denir.
     */
    public static void main(String[] args) {
        // Multi Dimensional Array nasil olusturulur.
        String names[][]= new String[3][2];// bu yöntemle eleman olusturlacaksa ic arraylerin sayilari ayni olmali
        // Multi Dimensional Arraylere eleman nasil eklenir
        names[1][0]="P";
        names[2][1]="P";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";
        // Multi Dimensional Arrayleri konsola yazdirmak icin ToString() methodu degil, deepToString() Methodunu kullanmaliyiz
        System.out.println(Arrays.deepToString(names));//[[A,K],[P,M],[C,Z]]

        // Multi Dimensional Arraylerde spesific bir eleman nasil yazdirilir
        System.out.println(names[1][1]);//M
        // Multi Dmensional Array icindeki bir Array.i yazdirmak
        System.out.println(Arrays.toString(names[0]));//[A,K]
        System.out.println(Arrays.toString(names[1]));

        // Kisa yoldan MultiDimensional Array nasil olusturulur. Bu yöntemle icerdeki arraylerin sayilari birbirinden farkli olusturulabilir
        String students[][]={{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        // Ex.1)Yukaridaki Students Array.inde toplam kac isim oldugunu bulunuz.
        int sum=0;
        for(String[] w: students){
            sum=sum+w.length;
        }
        System.out.println(sum);
    //Ex.2)Yukaridaki Students Array.inde icinde "m" olan ismleri console.a yazdiriniz(Arraylerde for each loop en cok kullanilanidir.)
        // Herbir Array icinde girip bakmamiz gerektigi icin nested loop gerekir.
        //{{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        for (String[] w: students){
            for(String k: w ){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }
        //Bir Integer Multi Dimensional Array olusturunuz. Tüm elemanlarinin carpimini bulunuz
        int nums[][]={{5,4},{2,3,2},{7}};
        int result=1;
        for(int[] w:nums){// bu Eech Loop ic Arraylari aliyor
            for(int k:w){// bu Each Loop.u icerdeki Array.in icindeki integer degerler icin yaziyoruz
                result=result*k;
            }
        }
        System.out.println(result);
        //ex.4) 2 boyutlu bir Array.i tek boyutlu bir Array.a ceviriniz
        int numbers[][]={{5,4},{2,3,2}};//{5,4,2,3,2}
        //1.Step: Iki boyutlu Array.de kac eleman oldugunu bulan kodu yazmaliyiz.
        int toplamElemanSayisi=0;
        for(int[] w:numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }
        //2.Step: Tek boyutlu Array.i iki boyutlu array.in eleman sayisini kullanarak olusturmaliyiz.
        int newArr[]= new int[toplamElemanSayisi];// yeni array.in eleman sayisi 5.tir ve default degeri [0,0,0,0,0]
        //3.Step: Iki boyutlu array.deki elemanlari tek boyutlu array.e transfer etmeliyiz.
        // Yeni Array icin bir index konteyner.i olusturuyoruz.
        // Cunku eski Array icindeki elemanlari sirasiyla 0. index.e, 1.index.e ... yerlestiriliyoruz
        int idx=0;
        for(int[]w: numbers){
            for(int k:w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));


       // Ex.5)Bir Integer MultiDimensional Array.deki en kücük ve en büyük elemanlarin toplamini bulunuz
        int ages[][]={{15,4},{12,43,21}};// 4+43=47
        int small=ages[0][0];//burada ilk sayiyi en kucuk elemanmis gibi farzediyoruz
        int big=ages[0][0];// burada ilk sayiyi en buyuk elemanmis gibi farzediyoruz
        for(int[] w: ages){
            for(int k:w){
            small=Math.min(small,k);// burada da en kücük eleman farzettigimiz sayiyla diger tum elemanlari karsilastiriyor, en kücügunu aliyor
            big=Math.max(big,k);// burada da en buyuk eleman farzettigimiz sayiyla diger tum elemanlari karsilastiriyor, en buyugunu aliyor
            }
        }
        System.out.println(small+big);






    }

}
