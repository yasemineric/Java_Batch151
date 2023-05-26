package b151practices.Replit.foreach;

public class ReplitTrFor05 {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
OUTPUT  :
100 98 96 94 92 … … … … 2 0
         */
        /*for(int i=100;i>-1;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }


         */

            int[] arr = new int[51];
            for (int i = 0; i < 101; i++) {
                if (i % 2 == 0) {
                    arr[arr.length - 1 - (i/2)] = i;
                }
            }
            for(int w:arr){
                System.out.print(w+" ");
            }



    }
}
