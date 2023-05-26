package b151practices.Replit.foreach;

public class For_While10 {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
OutPut:
Sayilarin Toplami : 5050
         */
        int result=0;
        for(int i=1;i<101;i++){
            result=result+i;
        }
        System.out.println("Sayilarin Toplami : "+result);
    }


}
