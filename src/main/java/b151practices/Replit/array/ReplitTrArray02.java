package b151practices.Replit.array;

public class ReplitTrArray02 {
    /*
    Array deki sayıları tolpayan Java kodunu yazınız.
array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Beklenen Çıktı:
Array toplamı: 55
     */
    public static void main(String[] args) {
        int sum=0;
        int num[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int w: num){
            sum=sum+w;
        }
        System.out.println("Array toplami: "+sum);

    }



}
