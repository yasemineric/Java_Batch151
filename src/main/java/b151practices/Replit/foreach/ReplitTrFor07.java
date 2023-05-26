package b151practices.Replit.foreach;

public class ReplitTrFor07 {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :
6
Output:
6 Mukemmel Sayidir.
======================
Input
7
Output:
7 Mukemmel Sayidir degildir.
         */
        int numBölenSum=0;
        int num=7;
        for(int i=1;i<num;i++){
            if(num%i==0){
                numBölenSum=numBölenSum+i;
            }
        }if (numBölenSum==num){
            System.out.println( num+" Mukemmel Sayidir.");
        }else{
            System.out.println(num+" Mukemmel Sayidir degildir." );
        }







    }
}
