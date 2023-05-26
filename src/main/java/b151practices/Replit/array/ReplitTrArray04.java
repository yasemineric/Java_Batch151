package b151practices.Replit.array;

public class ReplitTrArray04 {
    public static void main(String[] args) {
        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

Beklenen Çıktı:
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
  */


    /*
    int rows=10;

      int columns=10;
      for(int i=1;i<=rows;i++){
          for(int k=1;k<=columns;k++){
              System.out.print("0  ");
          }System.out.println();
      }

     */

        int grid[] = new int[10];


        for(int i=0;i<grid.length;i++){// Array.a sayi atamasi icin
            grid[i]=0;
        }

        for (int i = 0; i <grid.length; i++) {
            for (int w:grid) {
                System.out.print(w+"  ");
            }
            System.out.println();
        }




        /*for (int w: grid) {
            for (int k : grid) {
                System.out.print(k + "  ");

            }
            System.out.println(w + " ");
        }

         */


    }
}
