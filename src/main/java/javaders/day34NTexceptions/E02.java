package javaders.day34NTexceptions;

public class E02 {
    /* bu methodda hata olabilir mi?
        Tabi ki olabilir eger 6 . elemani istersek hata verir. Array in index'i verilen sinirlar
        disindadir hatasi alirsiniz. Index 5, 4 elemanli Array de olmaz.
        14 ve 23 nolu satirlarda hata oldugu gosterir.

        a array'imizde 4 eleman var, 6. elemani istersek hata verir. Cunku 6. eleman yok. 6. eleman index 5'tedir
        ve index 5 olmadigi icin, yazdirma islemi yaptigimizda ekranda problem exception olarak yazilir ve hangi satirda problem oldugu belirtilir.

     */
    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));

        System.out.println(getElement(a, 6));
        System.out.println(getElement(a, -3));



    }

    //Bir String array'den istenilen bir elemani eleman sirasi ile alan method olusturunuz
    public static String getElement(String[] a, int numOfElement){

        String result = "";

        try{
            result = a[numOfElement-1];
        }catch(ArrayIndexOutOfBoundsException e){
            if(numOfElement-1<0){
                result = a[0];
            }else{
                result = a[a.length-1];
            }
        }
        return result;
        /*
        Method olusturduktan sonra bir string olusturacagiz. s isimli String sayesinde length
methodunu kullanabildik. String'imiz "Java" idi. length 4'u verdi. String "Money" oldugunda
length methodu ile 5'i aldik. Bos String'de "", 0 verdi. sout icine String olarak null
koyunca hata verdi, ekranda exception gorduk. Cunku bazi String methodlari null ile calismaz.
         */






    }


}
