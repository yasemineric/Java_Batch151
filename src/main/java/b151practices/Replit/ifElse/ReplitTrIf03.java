package b151practices.Replit.ifElse;

public class ReplitTrIf03 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
Ornek:
INPUT      :
25
46
OUTPUT :
Numaralarin Toplami:
71
         */
        int num1 = 25;
        int num2 = 46;
        int sum = num1 + num2;
        if ( 1000000000 <= sum){
            System.out.println("Overflow");
        }else{
            System.out.println("Numaralarin Toplami:"+'\n'+sum);
        }


    }
}
