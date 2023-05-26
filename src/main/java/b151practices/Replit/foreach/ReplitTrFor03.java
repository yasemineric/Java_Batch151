package b151practices.Replit.foreach;

public class ReplitTrFor03 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
Input :
String str=“Javaisalsoeasy”
Output: a s
         */
        String tekrarliChr="";
        String str="Javaisalsoeasy";
        for(int i=0;i<str.length();i++){
            char chr= str.charAt(i);
            int firstIdx=str.indexOf(chr);
                    int lastIdx=str.lastIndexOf(chr);
            if((firstIdx!=lastIdx)&&!tekrarliChr.contains(""+chr)){
                tekrarliChr=tekrarliChr+" "+chr;
            }

        }System.out.println(tekrarliChr);




    }
}
