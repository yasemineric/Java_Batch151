package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        // primitive:       char-   boolean- byte-short-  int-   long-float-double
        // Wrapper Class: Character- Boolean- Byte-Short-Integer-Long-Float-Double
        // Wrapper Class.lar non primitiv.dir. ve o yüzden memory.de cok yer kaplar
        // o yuzden sart degilse kullanmayi tercih etmeyiz.
        // böyle bir imkanin varligindan da haberdar olmaliyiz.
        int n = 12;
        Integer m = 12;

        // n yazip . koydugumuzda hic method görunmez cunku primitivler method icermez.
        // m yazip . koyarsak bircok method gorebiliriz, cunku wrapper class.lar method icerir.
        byte p = 13;
        Byte r = 13;

        // short data type.nin min. ve max. degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        // Or.2: int data Type.nin min degeri ile byte data.type.nin max. degerinin toplamini bulunuz
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        int toplam = intMin + byteMax;
        System.out.println("toplam = " + toplam);

        //Ör.3 Primitiv int.i Wrapper Integer.a ceviriniz
        int num = 13;
        Integer wrapperNum = num;
       //

        // Wrapper Byte. primitiv byte.a ceviriniz
        Byte k=33;
        byte primitiveK= k;
        //wrapper  bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak primitiv yani method bulunmayan bir kutuya atma islemine unboxing denir.

        //o4
        //pri Char wrap.char.a cevir
        char initial='m';
        Character initialWrapper= initial;

        // wrap. boolean pri.boolean cevir(unboxing)
        Boolean isOld= true;
        boolean isOldpr= isOld;







    }

}
