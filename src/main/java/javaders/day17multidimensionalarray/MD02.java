package javaders.day17multidimensionalarray;

import java.util.Arrays;

public class MD02 {
    public static void main(String[] args) {
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}}; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array de öncelikle kac eleman oldugunu dinamik olarak bulalim
        int toplamElemanSayisi = 0;
        for(int[] w:numbers ){
            toplamElemanSayisi=toplamElemanSayisi+w.length;

        }
        System.out.println(toplamElemanSayisi);
        //2.Step: Tek boyutlu Arrayi elde ettigimiz eleman sayisini kullanarak olusturulalim
        int newArr[]=new int[toplamElemanSayisi];
        //3.Step: iki boyutlu arraydeki elemanlari tek boyutlu arraye transfer edelim

       int idx=0;
        for(int[] w:numbers){
            for(int k: w){
                newArr[idx]=k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));
        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        ////Karsilastirma-kiyaslama yapacagimiz array'lerde buyuk ve kucuk konteyner olustumak gerekir
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47
        int small=ages[0][0];
        int big=ages[0][0];
        for(int[] w:ages){
            for(int k:w){
             small=Math.min(small,k);// Small sepetini her döngude update etmemiz lazim
                big=Math.max(big,k);
            }

        }
        System.out.println(small+big);





    }
}
