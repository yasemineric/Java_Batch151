package b151practices.Replit.array;

public class ReplitTrArray09 {
    public static void main(String[] args) {
        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
Array: [1,2,3,4,5,6,7,8,9]
Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4
         */
        int counter = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int w : numbers) {
            if (w % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Tek Sayilar: "+(numbers.length-counter));
        System.out.println("Cift Sayilar: " + counter);



    }
}
