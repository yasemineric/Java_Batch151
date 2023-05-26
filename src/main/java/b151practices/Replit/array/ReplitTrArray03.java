package b151practices.Replit.array;

public class ReplitTrArray03 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
Array =  [20, 30, 25, 35, -16, 60, -100 ]
Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */
        int sum=0;
        int numbers[]={20, 30, 25, 35, -16, 60, -100};
        for(int w:numbers){
           sum=sum+w;
        } double ort=sum/numbers.length;
        System.out.println("Array Sayılarının ortalaması: "+ort);



    }
}
