package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();// String.in ters cevrilmesi looplar ile de yapilir, ancak reverse kisaa bir yoldur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ--Orijinal data üstteki kodla degistirildigi icin, yeni formattaki 6. index.deki elemani siler

        sb1.delete(4, 7);// baslangic(dahil) ve bitis index(haric)'ini girerek aradaki elemanlari sildirebiliriz
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2, 5, "X");// index 2,3,4 yerine"X" koyar
        // baslangic(dahil) ve bitis index(haric)'ini girerek
        // aradaki elemanlarin yerine yeni bir karakter girilebilir. Karakter sinirlamasi yok
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3, "2023");// Insert atla-gec diyor. Ilk 3 karakteri geciyor araya verdigimiz String koyar.
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");//Jcva--Burada c, a.dan 2 sonra oldugu icin compareTo +2 gelir
        StringBuilder sb3 = new StringBuilder("Java");//Java
        StringBuilder sb4 = new StringBuilder("Lava");
        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//0-- Java ve Java alfabetik olarak karsilastiriyor, bir fark yoksa 0 veriyor.
        int r2 = sb2.compareTo(sb4);
        System.out.println(r2);//-2-- J,L.den 2 tane önce oldugu icin -2 verir. Sonra olursa +...
        //Sonuc mesela -3 ise sb2, sb3 den alfabetik olarak 3 onde demektir.
        //Sonuc mesela 3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir.

        sb2.toString();// String.e cevirir ve sonrasinda ToUppperCase vs. String methodlari kullanabiliriz
        //sb2.toString();//String buildere Stringe ceviriyor sebebi ise String methodlari cok zengindir bazaen
        // String de bulunan bir methodu kullanmak isteriz bu yuzden ceviririz
        String str=sb1.toString().toUpperCase();
        System.out.println(str);// String YSX2023VAJ
        StringBuilder newSb1=new StringBuilder();
        System.out.println(newSb1);//Stringbuilder YSX2023VAJ











    }
}
