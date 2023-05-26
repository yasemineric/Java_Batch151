package javaders.day13incrementdecrementloops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex:21.den 180.e kadar hem 4 hem 6 ile bölunebilen tamsayilari ekrana yazdir
        for (int i = 21; i < 181; i++) {
            if (i % 12 == 0) {// if(i%4==0 && i%6==0)
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Ex.2: Size verilen  kücük harfle yazilmis String.in index.i cift sayi olan karakterlerinibüyük harfe dönusturun

        String s="ankara"; // bir String.de son index.i her zaman "length-1" ile buluruz
        // yazdigimiz kod belli senaryolar icin calisiyor, ancak
        // tüm senayolar icin calismiyorsa bu tarz koda "hard-code" denir.Mutlaka düzeltilmelidir
        // i<=length()-1--burada cok fazla islem var--yada i<length()--burada az ve öz-- tavsiye edilir
        for(int i=0;i<s.length();i++){
          String ch=s.substring(i,i+1);// substring baslangic indexi dahil, bitis indexi haric
        if(i%2==0){
            System.out.print(ch.toUpperCase()+ " ");
        }
        }
        /*
        for(int i=0;i<s.length();i++){
            if ( i%2==0){
                char ch=s.toUpperCase().charAt(i);
                System.out.println(ch);
            }

        }

         */
    }//main
}//class
