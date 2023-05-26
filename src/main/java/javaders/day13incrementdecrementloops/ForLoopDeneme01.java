package javaders.day13incrementdecrementloops;

public class ForLoopDeneme01 {
    public static void main(String[] args) {
        /* Verilen bir stringde ilk a harfinden onceki tum karakterleri consola yazdirin
String str="Hello Java";
 int a=str.indexOf('a');
for (int i=0;i<a;i++){
     char ch=str.charAt(i);
     System.out.print(ch);

        */
        String t="Tokaci";
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='a'){
                break;// loop.u herhagi bir sarta göre kirmak icin break keyword kullanilir
            }else{
                System.out.println(ch);
            }
        }
        System.out.println();

        // Verilen vir Stringin a.dan sonraki karakterleri ters sirada yazdirin
    String u="Tokatci";
        for (int i=u.length()-1;i>=0;i--){
            char ch=u.charAt(i);
            if(ch=='a'){
                break;

            }else {
                System.out.println(ch);
            }

        }

        /*
        20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
bırakarak yazdırmak için gereken kodu yazınız.
    String s = "";
    for(Integer i=20; i>2; i--){
    if(i%2!=0){
    s = s + i + " ";
     }
     }
System.out.println(s)
         */
        String s="";
        for(Integer i=20;i>2;i--) {
            if (i % 2 != 0) {
                s = s + i + "";
            }
        }
            System.out.println(s);


        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
//"Pwd12?Ab" ==> P12?A

        String str="Pwd12?Ab";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>'a' && ch<'z') {
                continue;
            }else{
                System.out.println(ch);
            }


        }






    //Bir String'i tersten yazdiran kodu yaziniz
    //"Java"
    String m="ey edip adanada pide ye";
    String ters="";
    for(int i=m.length()-1;i>=0;i--){
       ters=ters+ m.substring(i,i+1);

    }
        System.out.println(ters);

    }//main

}//class
