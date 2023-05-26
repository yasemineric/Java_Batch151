package b151practices.Replit.array;

import java.util.Arrays;

public class ReplitTrArray01 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
not: Test datadaki değerleri kullanınız.
Test Data:
[1232, 1134,2345,1022]
[Java, Python, PHP, C#, C Programming, C++]
Beklenen Çıktı:
[1022,1134,1232,2345]
[C Programming, C#, C++, Java, PHP, Python]
         */
        int num[]  ={1232, 1134,2345,1022};
        String str[] = {"C Programming", "C#", "C++", "Java", "PHP", "Python"};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


    }
}
