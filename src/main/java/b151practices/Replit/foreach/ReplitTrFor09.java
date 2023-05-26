package b151practices.Replit.foreach;

public class ReplitTrFor09 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
Input  :1238
Output :Girilen Numananin Tersi: 8321
         */
        String ters="";
        String num="1238";

        for(int i=num.length()-1;i>-1;i--){
           char ch=num.charAt(i);
           ters=ters+ch;
        }
        System.out.println("Girilen Numananin Tersi: "+ters);



    }
}
