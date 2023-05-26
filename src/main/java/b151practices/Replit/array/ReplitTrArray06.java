package b151practices.Replit.array;

public class ReplitTrArray06 {
    public static void main(String[] args) {


    /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

```
Aranan değer:56
```

```
Beklenen Çıktı:
```

```
56 sayısı arrayin 4. elemanı
     */

    int[] numbers={12,15,43,23,56,76,78,90,77,43};
    int num=56;
    for( int i=0;i< numbers.length; i++ ){
        if(numbers[i]==num){
            System.out.println(num+" sayisi arrayin "+i+". elemani");
          }
        }



    }

}
