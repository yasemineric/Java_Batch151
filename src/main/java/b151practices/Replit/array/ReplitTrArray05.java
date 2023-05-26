package b151practices.Replit.array;

import java.util.Arrays;

public class ReplitTrArray05 {
    public static void main(String[] args) {
        /*yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]
Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False**
         */

        int[] numbers={1551,1223,1443,1267,1789,1023,2020};
        int result = Arrays.binarySearch(numbers, 2020);
        if(result<0){
            System.out.println("**False**");
        }else{
            System.out.println("**True**");
        }




    }
}
