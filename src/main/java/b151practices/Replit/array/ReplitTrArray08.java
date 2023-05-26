package b151practices.Replit.array;

import java.util.Arrays;

public class ReplitTrArray08 {
    public static void main(String[] args) {
        /*
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
Array: [1232,2345,5467,678,3454,2312,3451]
         */
        int[] numbers={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);


        /*
        for (int i=0;i<numbers.length;i++){

            if(i==numbers.length-2){
                System.out.println(numbers[i]);
            }
        }
        */







    }




}
